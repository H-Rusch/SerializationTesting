package comparison;

import comparison.measurements.BsonMeasurement;
import comparison.measurements.CapnProtoMeasurement;
import comparison.measurements.JsonMeasurement;
import comparison.measurements.ProtocolBuffersMeasurement;

public class SerializationComparison {

    public static void main(String[] args) {
        DataHelper.initAll();

        try {
            for (int i = 1; i <= 6; i++) {
            /*
            // JSON
            new JsonMeasurement().measure();

            // BSON
            new BsonMeasurement().measure();

            // Protocol Buffers
            new ProtocolBuffersMeasurement().measure();

             */
    /*
            // Avro
            new AvroMeasurement().measure();


            // Thrift
            new ThriftMeasurement().measure();

            // FlatBuffers
            new FlatBuffersMeasurement().measure();
*/
                // Cap'n Proto
                new CapnProtoMeasurement().measure(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
