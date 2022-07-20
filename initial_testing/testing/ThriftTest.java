package testing;

import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TBinaryProtocol;
import testing.thrift.PersonThrift;
import testing.thrift.PhoneNumberThrift;
import testing.thrift.PhoneTypeThrift;

import java.io.*;
import java.util.List;

public class ThriftTest {

    public static void main(String[] args) {
        System.out.println("Thrift");

        String filename = "person_thrift.ser";

        // build object
        PersonThrift person = new PersonThrift()
                .setId(1)
                .setName("Hendrik")
                .setEmail("hallo@email.de")
                .setPhones(List.of(
                        new PhoneNumberThrift()
                                .setNumber("123-4567")
                                .setType(PhoneTypeThrift.MOBILE)
                ));

        System.out.println(person);

        // serialize object
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(filename))) {
            TSerializer serializer = new TSerializer(new TBinaryProtocol.Factory());
            out.write(serializer.serialize(person));
        } catch (IOException | TException e) {
            e.printStackTrace();
        }

        // deserialize object
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            TDeserializer deserializer = new TDeserializer(new TBinaryProtocol.Factory());
            PersonThrift person2 = new PersonThrift();
            deserializer.deserialize(person2, in.readAllBytes());

            System.out.println(person2);
        } catch (IOException | TException e) {
            e.printStackTrace();
        }
    }
}
