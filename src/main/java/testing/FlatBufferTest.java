package testing;

import com.google.flatbuffers.FlatBufferBuilder;
import testing.flatbuffers.PersonFlat;
import testing.flatbuffers.PhoneNumberFlat;
import testing.flatbuffers.PhoneTypeFlat;

import java.io.*;
import java.nio.ByteBuffer;

public class FlatBufferTest {

    public static void main(String[] args) {
        String filename = "person_flat.ser";

        // "build" object
        FlatBufferBuilder builder = new FlatBufferBuilder(1024);

        String name = "Hendrik";
        int id = 1;
        String email = "hallo@email.de";
        String number = "123-4567";
        byte numberType = PhoneTypeFlat.Mobile;

        int nameOffset = builder.createString(name);
        int emailOffset = builder.createString(email);

        int numberOffset = builder.createString(number);
        int phoneNumberOffset = PhoneNumberFlat.createPhoneNumberFlat(builder, numberOffset, numberType);
        int[] phoneArray = new int[] {phoneNumberOffset};
        int phones = PersonFlat.createPhonesVector(builder, phoneArray);

        PersonFlat.startPersonFlat(builder);
        PersonFlat.addName(builder, nameOffset);
        PersonFlat.addId(builder, id);
        PersonFlat.addEmail(builder, emailOffset);
        PersonFlat.addPhones(builder, phones);
        int person = PersonFlat.endPersonFlat(builder);

        builder.finish(person);

        byte[] arr = builder.sizedByteArray();

        // serialize object
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(filename))) {
            out.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize object
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            ByteBuffer buffer = ByteBuffer.wrap(in.readAllBytes());

            PersonFlat person2 = PersonFlat.getRootAsPersonFlat(buffer);

            System.out.println(person2.id());
            System.out.println(person2.name());
            System.out.println(person2.email());

            PhoneNumberFlat.Vector phonesVector = person2.phonesVector();
            for (int i = 0; i < phonesVector.length(); i++) {
                System.out.println(phonesVector.get(i).number());
                System.out.println(phonesVector.get(i).type());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
