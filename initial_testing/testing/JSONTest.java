package testing;

import com.fasterxml.jackson.databind.ObjectMapper;
import testing.json.PersonJSON;
import testing.json.PhoneNumberJSON;
import testing.json.PhoneTypeJSON;

import java.io.*;
import java.util.List;

public class JSONTest {

    public static void main(String[] args) {
        String filename = "person_json.json";
        System.out.println("JSON");

        // create object
        PersonJSON person = new PersonJSON("Hendrik", 1, "hallo@email.de",
                List.of(new PhoneNumberJSON("123-4567", PhoneTypeJSON.MOBILE)));

        ObjectMapper mapper = new ObjectMapper();

        // serialize
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(filename))) {
            out.write(mapper.writeValueAsBytes(person));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            PersonJSON person3 = mapper.readValue(in.readAllBytes(), PersonJSON.class);
            System.out.println(person3.getPhones().get(0).getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
