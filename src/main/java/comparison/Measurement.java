package comparison;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class Measurement {

    private final String MEASUREMENT_NAME;
    private final String FILENAME;
    private final long LIMIT = 100000;
    // divisor to get microseconds
    private final double DIVISOR = 1000000;

    // constants for objects to serialize
    private final String NAME = "Hendrik";
    private final String EMAIL = "hallo@email.com";
    private final int ID = 1;
    private final String NUMBER = "123-4567";

    protected Measurement(String measurementName, String filename) {
        MEASUREMENT_NAME = measurementName;
        FILENAME = filename;
    }

    public String getNAME() {
        return NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public int getID() {
        return ID;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public final void measure() throws IOException {
        System.out.println("\n" + MEASUREMENT_NAME);
        // serialization
        long measurement = measureSerialization();
        System.out.println("Average time for serialization \t\t (" +  LIMIT + " runs): \t" + measurement + " ns = " + measurement / DIVISOR + " ms");
        // deserialization
        measurement = measureDeserialization(serializeObject(buildObject()));
        System.out.println("Average time for deserialization \t (" +  LIMIT + " runs): \t" + measurement + " ns = " + measurement / DIVISOR + " ms");
        // saving byte-array to file
        saveToFile(serializeObject(buildObject()));
    }

    /** Measure the time it takes for an object to be converted to a Byte-array. */
    public final long measureSerialization() throws IOException {
        Object obj = buildObject();

        long startTime = System.nanoTime();
        for (int i = 0; i < LIMIT; i++) {
            serializeObject(obj);
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / LIMIT;
    }

    /** Measure the time it takes for a Byte-array to be reconstructed into an object. */
    public final long measureDeserialization(byte[] bytes) throws IOException {
        long startTime = System.nanoTime();
        for (int i = 0; i < LIMIT; i++) {
            deserializeObject(bytes);
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / LIMIT;
    }

    public abstract Object buildObject();

    public abstract byte[] serializeObject(Object object) throws IOException;

    public abstract Object deserializeObject(byte[] bytes) throws IOException;

    public void saveToFile(byte[] bytes) {
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(FILENAME))) {
            out.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
