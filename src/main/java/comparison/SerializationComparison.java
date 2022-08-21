package comparison;

import comparison.measurements.*;

public class SerializationComparison {

    public static void main(String[] args) {
        DataHelper.initAll();

        // set the variable manually to run the test for the specified case.
        // valid values contain [1, 6]
        int i = 1;
        try {
            System.out.println("\n" + "--- TEST " + i + " " + "-".repeat(40));

            // JSON
            new JsonMeasurement().measure(i);

            // BSON
            new BsonMeasurement().measure(i);

            // Protocol Buffers
            new ProtocolBuffersMeasurement().measure(i);

            // Thrift - normal encoding
            new ThriftMeasurement().measure(i);

            // Thrift - compact encoding
            new ThriftCompactMeasurement().measure(i);

            // Avro
            new AvroMeasurement().measure(i);

            // Cap'n Proto
            new CapnProtoMeasurement().measure(i);

            // FlatBuffers
            new FlatBuffersMeasurement().measure(i);

            // Java Object Serialization
            new JavaMeasurement().measure(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
