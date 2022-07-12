package comparison;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.undercouch.bson4jackson.BsonFactory;

public class BsonMeasurement extends JsonMeasurement {

    protected BsonMeasurement() {
        super("BSON", "data_bson.ser", new ObjectMapper(new BsonFactory()));
    }
}
