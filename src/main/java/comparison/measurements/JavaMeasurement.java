package comparison.measurements;

import java.io.*;

public class JavaMeasurement extends JsonMeasurement {

    public JavaMeasurement() {
        super("Java", "java", "dat", null);
    }

    public byte[] serializeObject(Object object) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(bos)) {
            out.writeObject(object);
            out.flush();

            return bos.toByteArray();
        }
    }

    public Object deserializeObject(byte[] bytes) throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes))) {

            return in.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public byte[] serializeObject1(Object object) throws IOException {
        return serializeObject(object);
    }

    @Override
    public Object deserializeObject1(byte[] bytes) throws IOException {
        return deserializeObject(bytes);
    }


    @Override
    public byte[] serializeObject2(Object object) throws IOException {
        return serializeObject(object);
    }

    @Override
    public Object deserializeObject2(byte[] bytes) throws IOException {
        return deserializeObject(bytes);
    }


    @Override
    public byte[] serializeObject3(Object object) throws IOException {
        return serializeObject(object);
    }

    @Override
    public Object deserializeObject3(byte[] bytes) throws IOException {
        return deserializeObject(bytes);
    }


    @Override
    public byte[] serializeObject4(Object object) throws IOException {
        return serializeObject(object);
    }

    @Override
    public Object deserializeObject4(byte[] bytes) throws IOException {
        return deserializeObject(bytes);
    }

    @Override
    public byte[] serializeObject5(Object object) throws IOException {
        return serializeObject(object);
    }

    @Override
    public Object deserializeObject5(byte[] bytes) throws IOException {
        return deserializeObject(bytes);
    }


    @Override
    public byte[] serializeObject6(Object object) throws IOException {
        return serializeObject(object);
    }

    @Override
    public Object deserializeObject6(byte[] bytes) throws IOException {
        return deserializeObject(bytes);
    }
}
