package comparison.measurements;

import java.io.*;

public abstract class Measurement {

    private final String measurementName;
    private final String filename;
    private final String fileExtension;

    private final long limit = 100000;
    // divisor to get microseconds
    private final double divisor = 1000000;

    private boolean pretty = false;

    protected Measurement(String measurementName, String filename, String fileExtension) {
        this.measurementName = measurementName;
        this.filename = filename;
        this.fileExtension = fileExtension;
    }

    public void setPretty(boolean pretty) {
        this.pretty = pretty;
    }

    public final void measure(int number) throws IOException {
        long startTime, endTime, measurementSerialize, measurementDeserialize;
        byte[] bytes;
        Object object;

        // build object
        object = buildObject(number);

        //serialization
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            serializeObject(number, object);
        }
        endTime = System.nanoTime();
        measurementSerialize = (endTime - startTime) / limit;

        // deserialization
        bytes = serializeObject(number, object);
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            deserializeObject(number, bytes);
        }
        endTime = System.nanoTime();
        measurementDeserialize = (endTime - startTime) / limit;

        // save to file
        saveToFile(bytes, number);

        if (pretty) {
            // print info
            printInfo(number, measurementSerialize, measurementDeserialize);
        } else {
            printInfoCompact(number, measurementSerialize, measurementDeserialize);
        }
    }

    public final Object buildObject(int number) {
        return switch (number) {
            case 1 -> buildObject1();
            case 2 -> buildObject2();
            case 3 -> buildObject3();
            case 4 -> buildObject4();
            case 5 -> buildObject5();
            case 6 -> buildObject6();
            default -> null;
        };
    }

    public final byte[] serializeObject(int number, Object object) throws IOException {
        return switch (number) {
            case 1 -> serializeObject1(object);
            case 2 -> serializeObject2(object);
            case 3 -> serializeObject3(object);
            case 4 -> serializeObject4(object);
            case 5 -> serializeObject5(object);
            case 6 -> serializeObject6(object);
            default -> null;
        };
    }

    public final Object deserializeObject(int number, byte[] bytes) throws IOException {
        return switch (number) {
            case 1 -> deserializeObject1(bytes);
            case 2 -> deserializeObject2(bytes);
            case 3 -> deserializeObject3(bytes);
            case 4 -> deserializeObject4(bytes);
            case 5 -> deserializeObject5(bytes);
            case 6 -> deserializeObject6(bytes);
            default -> null;
        };
    }

    private void printInfo(int number, long measurementSerialize, long measurementDeserialize) {
        System.out.println("\n" + measurementName + " case " + number);
        System.out.println("Average time for serialization \t\t (" + limit + " runs): \t" + measurementSerialize +
                " ns = " + measurementSerialize / divisor + " ms");
        System.out.println("Average time for deserialization \t (" + limit + " runs): \t" + measurementDeserialize +
                " ns = " + measurementDeserialize / divisor + " ms");
    }

    private void printInfoCompact(int number, long measurementSerialize, long measurementDeserialize) {
        String string = String.format("%-30s", measurementName + " case " + number);
        string = String.format("%-40s", string + "\t" + measurementSerialize);
        string = String.format("%-50s", string + "\t" + measurementDeserialize);
        System.out.println(string);
    }

    private void saveToFile(byte[] bytes, int number) {
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

    public abstract Object buildObject6();

    public abstract byte[] serializeObject6(Object object) throws IOException;

    public abstract Object deserializeObject6(byte[] bytes) throws IOException;
}
