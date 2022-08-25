package comparison.measurements;

import com.fasterxml.jackson.databind.ObjectMapper;
import comparison.DataHelper;
import de.undercouch.bson4jackson.BsonFactory;

import java.io.IOException;

public class BsonMeasurement extends JsonMeasurement {

    public BsonMeasurement() {
        super("BSON", "bson", "dat", new ObjectMapper(new BsonFactory()));
    }

    public static void main(String[] args) throws IOException {
        int i = Integer.parseInt(args[0]);
        DataHelper.initAll();

        new BsonMeasurement().measure(i);
    }
}
