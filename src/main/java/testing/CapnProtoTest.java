package testing;

import org.capnproto.MessageBuilder;
import org.capnproto.MessageReader;
import org.capnproto.Serialize;
import org.capnproto.StructList;
import testing.capnp.PersonCapnp;

import java.io.*;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

public class CapnProtoTest {

    public static void main(String[] args) {
        System.out.println("Cap'n Proto");

        String filename = "person_capnp.ser";

        // build object
        MessageBuilder message = new MessageBuilder();

        PersonCapnp.Person.Builder person = message.initRoot(PersonCapnp.Person.factory);
        person.setName("Hendrik");
        person.setId(1);
        person.setEmail("hallo@email.de");

        StructList.Builder<PersonCapnp.Person.PhoneNumber.Builder> phones = person.initPhones(1);
        phones.get(0).setNumber("123-4767");
        phones.get(0).setType(PersonCapnp.Person.PhoneNumber.Type.MOBILE);

        System.out.println(person.getName());

        // serialize object
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(filename))) {
            WritableByteChannel channel = Channels.newChannel(out);
            Serialize.write(channel, message);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize object
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            MessageReader messageReader = Serialize.read(Channels.newChannel(in));

            PersonCapnp.Person.Reader person2 = messageReader.getRoot(PersonCapnp.Person.factory);
            System.out.println(person2.getPhones().get(0).getNumber());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
