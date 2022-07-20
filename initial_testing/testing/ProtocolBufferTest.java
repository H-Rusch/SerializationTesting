package testing;

import testing.protos.PersonProtos;

import java.io.*;

public class ProtocolBufferTest {

    public static void main(String[] args) {
        System.out.println("Protocol Buffers");

        String filename = "person_proto.ser";

        // build object
        PersonProtos person = PersonProtos.newBuilder()
                .setId(1)
                .setName("Hendrik")
                .setEmail("hallo@email.de")
                .addPhones(
                        PersonProtos.PhoneNumberProtos.newBuilder()
                                .setNumber("123-4567")
                                .setType(PersonProtos.PhoneTypeProtos.MOBIILE)
                                .build()
                ).build();
        System.out.println(person);

        // serialize object
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(filename))) {
            out.write(person.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize object
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            PersonProtos person2 = PersonProtos.parseFrom(in.readAllBytes());

            System.out.println(person2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
