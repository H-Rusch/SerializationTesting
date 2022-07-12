package comparison;

import com.fasterxml.jackson.databind.ObjectMapper;
import testing.json.PersonJSON;
import testing.json.PhoneNumberJSON;
import testing.json.PhoneTypeJSON;

import java.io.IOException;
import java.util.List;

public class JsonMeasurement extends Measurement {

    private final ObjectMapper mapper;

    public JsonMeasurement() {
        super("JSON", "data_json.json");
        this.mapper = new ObjectMapper();
    }

    // constructor for BSON Measurement
    public JsonMeasurement(String name, String filename, ObjectMapper mapper) {
        super(name, filename);
        this.mapper = mapper;
    }


    @Override
    public Object buildObject() {
        return new PersonJSON(super.getNAME(), super.getID(), super.getEMAIL(),
                List.of(new PhoneNumberJSON(super.getNUMBER(), PhoneTypeJSON.MOBILE)));
    }

    @Override
    public byte[] serializeObject(Object object) throws IOException {
        return mapper.writeValueAsBytes(object);
    }

    @Override
    public Object deserializeObject(byte[] bytes) throws IOException {
        return mapper.readValue(bytes, PersonJSON.class);
    }
}
