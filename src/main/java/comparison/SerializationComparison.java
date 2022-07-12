package comparison;

public class SerializationComparison {

    public static void main(String[] args) {
        try {
            /*
            // JSON
            new JsonMeasurement().measure();

            // BSON
            new BsonMeasurement().measure();
*/
            // Protocol Buffers
            new ProtocolBuffersMeasurement().measure();
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
