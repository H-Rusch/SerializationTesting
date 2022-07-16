package comparison.measurements;

import com.google.flatbuffers.FlatBufferBuilder;
import testing.flatbuffers.PersonFlat;
import testing.flatbuffers.PhoneNumberFlat;
import testing.flatbuffers.PhoneTypeFlat;

import java.io.IOException;
import java.nio.ByteBuffer;

public class FlatBuffersMeasurement extends Measurement {

    private FlatBufferBuilder builder;

    public FlatBuffersMeasurement() {
        super("FlatBuffers", "flatbuffers.ser", "ser");
        this.builder = new FlatBufferBuilder();
    }

    @Override
    public Object buildObject1() {
        return null;
    }

    @Override
    public byte[] serializeObject1(Object object) throws IOException {
        builder.clear();

        byte numberType = PhoneTypeFlat.Mobile;

        int nameOffset = builder.createString(getNAME());
        int emailOffset = builder.createString(getEMAIL());

        int numberOffset = builder.createString(getNUMBER());
        int phoneNumberOffset = PhoneNumberFlat.createPhoneNumberFlat(builder, numberOffset, numberType);
        int[] phoneArray = new int[] {phoneNumberOffset};
        int phones = PersonFlat.createPhonesVector(builder, phoneArray);

        PersonFlat.startPersonFlat(builder);
        PersonFlat.addName(builder, nameOffset);
        PersonFlat.addId(builder, getID());
        PersonFlat.addEmail(builder, emailOffset);
        PersonFlat.addPhones(builder, phones);
        int person = PersonFlat.endPersonFlat(builder);

        builder.finish(person);

        return builder.sizedByteArray();
    }

    @Override
    public Object deserializeObject1(byte[] bytes) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        return PersonFlat.getRootAsPersonFlat(buffer);
    }

    @Override
    public Object buildObject2() {
        return null;
    }

    @Override
    public byte[] serializeObject2(Object object) throws IOException {
        return new byte[0];
    }

    @Override
    public Object deserializeObject2(byte[] bytes) throws IOException {
        return null;
    }

    @Override
    public Object buildObject3() {
        return null;
    }

    @Override
    public byte[] serializeObject3(Object object) throws IOException {
        return new byte[0];
    }

    @Override
    public Object deserializeObject3(byte[] bytes) throws IOException {
        return null;
    }

    @Override
    public Object buildObject4() {
        return null;
    }

    @Override
    public byte[] serializeObject4(Object object) throws IOException {
        return new byte[0];
    }

    @Override
    public Object deserializeObject4(byte[] bytes) throws IOException {
        return null;
    }

    @Override
    public Object buildObject5() {
        return null;
    }

    @Override
    public byte[] serializeObject5(Object object) throws IOException {
        return new byte[0];
    }

    @Override
    public Object deserializeObject5(byte[] bytes) throws IOException {
        return null;
    }

    @Override
    public Object buildObject6() {
        return null;
    }

    @Override
    public byte[] serializeObject6(Object object) throws IOException {
        return new byte[0];
    }

    @Override
    public Object deserializeObject6(byte[] bytes) throws IOException {
        return null;
    }
}
