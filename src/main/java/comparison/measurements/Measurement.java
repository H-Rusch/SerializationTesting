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

    public final void measure() throws IOException {
        long startTime, endTime, measurementSerialize, measurementDeserialize;
        byte[] bytes;
        Object object;
        int number = 1;

        // --- TEST 1 -----------------------------------
        // serialization
        object = buildObject1();
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            serializeObject1(object);
        }
        endTime = System.nanoTime();
        measurementSerialize = (endTime - startTime) / limit;

        // deserialization
        bytes = serializeObject1(object);
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            deserializeObject1(bytes);
        }
        endTime = System.nanoTime();
        measurementDeserialize = (endTime - startTime) / limit;

        // save to file
        saveToFile(bytes, number);

        // print info
        printInfo(number, measurementSerialize, measurementDeserialize);

        // --- TEST 2 -----------------------------------
        number++;
        // serialization
        object = buildObject2();
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            serializeObject2(object);
        }
        endTime = System.nanoTime();
        measurementSerialize = (endTime - startTime) / limit;

        // deserialization
        bytes = serializeObject2(object);
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            deserializeObject2(bytes);
        }
        endTime = System.nanoTime();
        measurementDeserialize = (endTime - startTime) / limit;

        // save to file
        saveToFile(bytes, number);

        // print info
        printInfo(number, measurementSerialize, measurementDeserialize);


        // --- TEST 3 -----------------------------------
        number++;
        // serialization
        object = buildObject3();
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            serializeObject3(object);
        }
        endTime = System.nanoTime();
        measurementSerialize = (endTime - startTime) / limit;

        // deserialization
        bytes = serializeObject3(object);
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            deserializeObject3(bytes);
        }
        endTime = System.nanoTime();
        measurementDeserialize = (endTime - startTime) / limit;

        // save to file
        saveToFile(bytes, number);

        // print info
        printInfo(number, measurementSerialize, measurementDeserialize);


        // --- TEST 4 -----------------------------------
        number++;
        // serialization
        object = buildObject4();
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            serializeObject4(object);
        }
        endTime = System.nanoTime();
        measurementSerialize = (endTime - startTime) / limit;

        // deserialization
        bytes = serializeObject4(object);
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            deserializeObject4(bytes);
        }
        endTime = System.nanoTime();
        measurementDeserialize = (endTime - startTime) / limit;

        // save to file
        saveToFile(bytes, number);

        // print info
        printInfo(number, measurementSerialize, measurementDeserialize);


        // --- TEST 5 -----------------------------------
        number++;
        // serialization
        object = buildObject5();
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            serializeObject5(object);
        }
        endTime = System.nanoTime();
        measurementSerialize = (endTime - startTime) / limit;

        // deserialization
        bytes = serializeObject5(object);
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            deserializeObject5(bytes);
        }
        endTime = System.nanoTime();
        measurementDeserialize = (endTime - startTime) / limit;

        // save to file
        saveToFile(bytes, number);

        // print info
        printInfo(number, measurementSerialize, measurementDeserialize);


        // --- TEST 6 -----------------------------------
        number++;
        // serialization
        object = buildObject6();
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            serializeObject6(object);
        }
        endTime = System.nanoTime();
        measurementSerialize = (endTime - startTime) / limit;

        // deserialization
        bytes = serializeObject6(object);
        startTime = System.nanoTime();
        for (int i = 0; i < limit; i++) {
            deserializeObject6(bytes);
        }
        endTime = System.nanoTime();
        measurementDeserialize = (endTime - startTime) / limit;

        // save to file
        saveToFile(bytes, number);

        // print info
        printInfo(number, measurementSerialize, measurementDeserialize);
    }

    private void printInfo(int number, long measurementSerialize, long measurementDeserialize) {
        System.out.println("\n" + measurementName + " case " + number);
        System.out.println("Average time for serialization \t\t (" + limit + " runs): \t" + measurementSerialize +
                " ns = " + measurementSerialize / divisor + " ms");
        System.out.println("Average time for deserialization \t (" + limit + " runs): \t" + measurementDeserialize +
                " ns = " + measurementDeserialize / divisor + " ms");
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
