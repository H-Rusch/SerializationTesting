package comparison.measurements;

import org.capnproto.MessageBuilder;
import org.capnproto.MessageReader;
import org.capnproto.Serialize;
import org.capnproto.StructList;
import testing.capnp.PersonCapnp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class CapnProtoMeasurement extends Measurement {

    public CapnProtoMeasurement() {
        super("Cap'n Proto", "capnp" , "ser");
    }

    @Override
    public Object buildObject1() {
        // only returns the builder and not the actual object, since there is no way to do so(?)
        MessageBuilder message = new MessageBuilder();

        PersonCapnp.Person.Builder person = message.initRoot(PersonCapnp.Person.factory);
        person.setName(super.getNAME());
        person.setId(super.getID());
        person.setEmail(super.getEMAIL());

        StructList.Builder<PersonCapnp.Person.PhoneNumber.Builder> phones = person.initPhones(1);
        phones.get(0).setNumber(super.getNUMBER());
        phones.get(0).setType(PersonCapnp.Person.PhoneNumber.Type.MOBILE);

        return message;
    }

    @Override
    public byte[] serializeObject1(Object object) throws IOException {
        // System.out.println(((MessageBuilder) object).getRoot(PersonCapnp.Person.factory).getName());
        var a = new ByteArrayOutputStream();
        Serialize.write(Channels.newChannel(a), (MessageBuilder) object);

        return a.toByteArray();
    }

    @Override
    public Object deserializeObject1(byte[] bytes) throws IOException {
        MessageReader messageReader = Serialize.read(ByteBuffer.wrap(bytes));

        return messageReader.getRoot(PersonCapnp.Person.factory);
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
