package comparison;

import testing.protos.PersonProtos;

import java.io.IOException;

public class ProtocolBuffersMeasurement extends Measurement {

    public ProtocolBuffersMeasurement() {
        super("Protocol Buffers", "data_protobuffers.ser");
    }

    @Override
    public Object buildObject() {
        return PersonProtos.newBuilder()
                .setId(super.getID())
                .setName(super.getNAME())
                .setEmail(super.getEMAIL())
                .addPhones(
                        PersonProtos.PhoneNumberProtos.newBuilder()
                                .setNumber(super.getNUMBER())
                                .setType(PersonProtos.PhoneTypeProtos.MOBIILE)
                                .build()
                ).build();
    }

    @Override
    public byte[] serializeObject(Object object) throws IOException {
        return ((PersonProtos) object).toByteArray();
    }

    @Override
    public Object deserializeObject(byte[] bytes) throws IOException {
        return PersonProtos.parseFrom(bytes);
    }
}
