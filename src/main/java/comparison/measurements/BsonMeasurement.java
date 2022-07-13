package comparison.measurements;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.undercouch.bson4jackson.BsonFactory;

public class BsonMeasurement extends JsonMeasurement {

    public BsonMeasurement() {
        super("BSON", "bson", "dat", new ObjectMapper(new BsonFactory()));
    }
}
