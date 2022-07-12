package comparison;

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
        super("Thrift", "data_thrift.ser");
        try {
            this.serializer = new TSerializer(new TBinaryProtocol.Factory());
            this.deserializer = new TDeserializer(new TBinaryProtocol.Factory());
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object buildObject() {
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
    public byte[] serializeObject(Object object) throws IOException {
        try {
            return this.serializer.serialize((PersonThrift) object);
        } catch (TException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object deserializeObject(byte[] bytes) throws IOException {
        PersonThrift person = new PersonThrift();
        try {
            deserializer.deserialize(person, bytes);
        } catch (TException e) {
            e.printStackTrace();
        }
        return person;
    }
}
