package comparison.measurements;

import java.io.*;

public abstract class Measurement {

    private final String measurementName;
    private final String filename;
    private final String fileExtension;

    private final long limit = 10000;
    // divisor to get microseconds
    private final double divisor = 1000000;

    // constants for objects to serialize
    // TODO remove
    private final String NAME = "Hendrik";
    private final String EMAIL = "hallo@email.com";
    private final int ID = 1;
    private final String NUMBER = "123-4567";

    protected Measurement(String measurementName, String filename, String fileExtension) {
        this.measurementName = measurementName;
        this.filename = filename;
        this.fileExtension = fileExtension;
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

    public final void measure(int number) throws IOException {
        System.out.println("\n" + measurementName + " case " + number);
        Object object = buildObject(number);

        // serialization
        long measurement = measureSerialization(object, number);
        System.out.println("Average time for serialization \t\t (" + limit + " runs): \t" + measurement + " ns = " + measurement / divisor + " ms");

        // deserialization
        measurement = measureDeserialization(serializeObject(object, number), number);
        System.out.println("Average time for deserialization \t (" + limit + " runs): \t" + measurement + " ns = " + measurement / divisor + " ms");

        // saving byte-array to file
        saveToFile(serializeObject(object, number), number);
    }

    /** Measure the time it takes for an object to be converted to a Byte-array. */
    public final long measureSerialization(Object object, int number) throws IOException {
        long startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            serializeObject(object, number);
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / limit;
    }

    /** Measure the time it takes for a Byte-array to be reconstructed into an object. */
    public final long measureDeserialization(byte[] bytes, int number) throws IOException {
        long startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            deserializeObject(bytes, number);
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / limit;
    }

    public Object buildObject(int number) {
        if (number == 1) {
            return buildObject1();
        }
        if (number == 2) {
            return buildObject2();
        }
        if (number == 3) {
            return buildObject3();
        }
        if (number == 4) {
            return buildObject4();
        }
        if (number == 5) {
            return buildObject5();
        }
        return null;
    }

    public byte[] serializeObject(Object object, int number) throws IOException {
        if (number == 1) {
            return serializeObject1(object);
        }
        if (number == 2) {
            return serializeObject2(object);
        }
        if (number == 3) {
            return serializeObject3(object);
        }
        if (number == 4) {
            return serializeObject4(object);
        }
        if (number == 5) {
            return serializeObject5(object);
        }
        return new byte[0];
    }

    public Object deserializeObject(byte[] bytes, int number) throws IOException {
        if (number == 1) {
            return deserializeObject1(bytes);
        }
        if (number == 2) {
            return deserializeObject2(bytes);
        }
        if (number == 3) {
            return deserializeObject3(bytes);
        }
        if (number == 4) {
            return deserializeObject4(bytes);
        }
        if (number == 5) {
            return deserializeObject5(bytes);
        }
        return null;
    }

    public void saveToFile(byte[] bytes, int number) {
        String fullFilename = "measurement_data" + File.separator + "data" + number + File.separator +
                filename + "_data" + number + "." + fileExtension;
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(fullFilename))) {
            out.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Specific methods for serializing the different test cases
    public abstract Object buildObject1();
    public abstract byte[] serializeObject1(Object object) throws IOException;
    public abstract Object deserializeObject1(byte[] bytes) throws IOException;

    public abstract Object buildObject2();
    public abstract byte[] serializeObject2(Object object) throws IOException;
    public abstract Object deserializeObject2(byte[] bytes) throws IOException;

    public abstract Object buildObject3();
    public abstract byte[] serializeObject3(Object object) throws IOException;
    public abstract Object deserializeObject3(byte[] bytes) throws IOException;

    public abstract Object buildObject4();
    public abstract byte[] serializeObject4(Object object) throws IOException;
    public abstract Object deserializeObject4(byte[] bytes) throws IOException;

    public abstract Object buildObject5();
    public abstract byte[] serializeObject5(Object object) throws IOException;
    public abstract Object deserializeObject5(byte[] bytes) throws IOException;
}
