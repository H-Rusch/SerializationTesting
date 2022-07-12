package comparison;

import com.google.flatbuffers.FlatBufferBuilder;
import testing.flatbuffers.PersonFlat;
import testing.flatbuffers.PhoneNumberFlat;
import testing.flatbuffers.PhoneTypeFlat;

import java.io.IOException;
import java.nio.ByteBuffer;

public class FlatBuffersMeasurement extends Measurement {

    private FlatBufferBuilder builder;

    public FlatBuffersMeasurement() {
        super("FlatBuffers", "data_flatbuffers.ser");
        this.builder = new FlatBufferBuilder();
    }

    @Override
    public Object buildObject() {
        return null;
    }

    @Override
    public byte[] serializeObject(Object object) throws IOException {
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
    public Object deserializeObject(byte[] bytes) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        return PersonFlat.getRootAsPersonFlat(buffer);
    }
}
