package testing;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import testing.avro.PersonAvro;
import testing.avro.PhoneNumberAvro;
import testing.avro.PhoneTypeAvro;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AvroTest {

    public static void main(String[] args) {
        System.out.println("Avro");

        String filename = "person_avro.ser";

        // create person
        PersonAvro person = PersonAvro.newBuilder()
                .setId(1)
                .setName("Hendrik")
                .setEmail("hallo@email.de")
                .setPhones(List.of(
                        PhoneNumberAvro.newBuilder()
                                .setNumber("123-4567")
                                .setType(PhoneTypeAvro.MOBILE)
                                .build()
                ))
                .build();
        System.out.println(person);

        // serialize
        try (DataFileWriter<PersonAvro> dataFileWriter = new DataFileWriter<>(new SpecificDatumWriter<>(PersonAvro.class))) {
            dataFileWriter.create(person.getSchema(), new File(filename));
            dataFileWriter.append(person);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize
        try (DataFileReader<PersonAvro> dataFileReader = new DataFileReader<>(new File(filename), new SpecificDatumReader<>(PersonAvro.class))) {
            PersonAvro person2 = dataFileReader.next();

            System.out.println(person2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
