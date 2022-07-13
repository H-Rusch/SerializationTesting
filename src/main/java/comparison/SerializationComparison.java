package comparison;

import comparison.measurements.BsonMeasurement;
import comparison.measurements.JsonMeasurement;
import comparison.measurements.ProtocolBuffersMeasurement;

public class SerializationComparison {
    private static final int start = 1;
    private static final int end = 5;

    public static void main(String[] args) {
        DataHelper.initAll();

        try {
            for (int i = start; i <= end; i++) {
                // JSON
                new JsonMeasurement().measure(i);

                // BSON
                new BsonMeasurement().measure(i);

                    // Protocol Buffers
                new ProtocolBuffersMeasurement().measure(i);
    /*
                // Avro
                new AvroMeasurement().measure();


                // Thrift
                new ThriftMeasurement().measure();

                // FlatBuffers
                new FlatBuffersMeasurement().measure();

                // Cap'n Proto
                new CapnProtoMeasurement().measure();


                 */
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
