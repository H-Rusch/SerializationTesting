package comparison;

import comparison.measurements.*;

public class SerializationComparison {

    public static void main(String[] args) {
        DataHelper.initAll();

        try {
            for (int i = 1; i <= 6; i++) {
                System.out.println("\n" + "--- TEST " + i + " " + "-".repeat(30));

                // JSON
                new JsonMeasurement().measure(i);

                // BSON
                new BsonMeasurement().measure(i);

                // Protocol Buffers
                new ProtocolBuffersMeasurement().measure(i);

                // Avro
                new AvroMeasurement().measure(i);

                // Thrift
                new ThriftMeasurement().measure(i);

                // FlatBuffers
                new FlatBuffersMeasurement().measure(i);

                // Cap'n Proto
                new CapnProtoMeasurement().measure(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
