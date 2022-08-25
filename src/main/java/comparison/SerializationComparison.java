package comparison;

import java.util.List;

public class SerializationComparison {

    private static final String JAVA = "java";
    private static final String CP = "-cp";
    private static final String CLASS_PATH = System.getProperty("java.class.path");
    private static final String PATH = "comparison.measurements.";

    private static final List<String> measurements = List.of("JsonMeasurement",
            "BsonMeasurement",
            "ProtocolBuffersMeasurement",
            "ThriftMeasurement",
            "ThriftCompactMeasurement",
            "AvroMeasurement",
            "CapnProtoMeasurement",
            "FlatBuffersMeasurement",
            "JavaMeasurement"
    );

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder();
        pb.inheritIO();

        for (int i = 1; i <= 6; i++) {
            System.out.println("\n" + "--- TEST " + i + " " + "-".repeat(40));


            for (String measurement : measurements) {
                // start another process so there is no caching between cases
                try {
                    pb.command(JAVA,
                            CP, CLASS_PATH,
                            PATH + measurement,
                            String.valueOf(i)
                    );
                    pb.start().waitFor();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
