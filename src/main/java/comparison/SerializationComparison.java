package comparison;

import comparison.measurements.*;

public class SerializationComparison {

    public static void main(String[] args) {
        DataHelper.initAll();

        try {
            for (int i = 1; i <= 6; i++) {
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
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
