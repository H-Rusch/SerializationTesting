package comparison.measurements;

import org.apache.thrift.TDeserializer;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TTransportException;
import testing.thrift.PersonThrift;
import testing.thrift.PhoneNumberThrift;
import testing.thrift.PhoneTypeThrift;

import java.io.IOException;
import java.util.List;

public class ThriftMeasurement extends Measurement {

    private TSerializer serializer;
    private TDeserializer deserializer;


    protected ThriftMeasurement() {
        super("Thrift", "thrift", "ser");
        try {
            this.serializer = new TSerializer(new TBinaryProtocol.Factory());
            this.deserializer = new TDeserializer(new TBinaryProtocol.Factory());
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object buildObject1() {
        return new PersonThrift()
                .setId(super.getID())
                .setName(super.getNAME())
                .setEmail(super.getEMAIL())
                .setPhones(List.of(
                        new PhoneNumberThrift()
                                .setNumber(super.getNUMBER())
                                .setType(PhoneTypeThrift.MOBILE)
                ));
    }

    @Override
    public byte[] serializeObject1(Object object) throws IOException {
        try {
            return this.serializer.serialize((PersonThrift) object);
        } catch (TException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object deserializeObject1(byte[] bytes) throws IOException {
        PersonThrift person = new PersonThrift();
        try {
            deserializer.deserialize(person, bytes);
        } catch (TException e) {
            e.printStackTrace();
        }
        return person;
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
