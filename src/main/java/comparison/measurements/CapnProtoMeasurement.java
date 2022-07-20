package comparison.measurements;

import comparison.DataHelper;
import generated.data1.capnp.DataCapnp1;
import generated.data2.capnp.DataCapnp2;
import generated.data3.capnp.DataCapnp3;
import generated.data4_5.capnp.DataCapnp4;
import generated.data6.capnp.DataCapnp6;
import org.capnproto.MessageBuilder;
import org.capnproto.MessageReader;
import org.capnproto.Serialize;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.Map;

public class CapnProtoMeasurement extends Measurement {

    public CapnProtoMeasurement() {
        super("Cap'n Proto", "capnp", "dat");
    }

    @Override
    public Object buildObject1() {
        Map<String, Object> dataItems = DataHelper.getItemMap1();

        MessageBuilder message = new MessageBuilder();

        DataCapnp1.Data.Builder data = message.initRoot(DataCapnp1.Data.factory);
        data.setString1((String) dataItems.get("string1"));
        data.setString2((String) dataItems.get("string2"));
        data.setNumber1((Integer) dataItems.get("number1"));
        data.setNumber2((Integer) dataItems.get("number2"));
        data.setNumber3((Integer) dataItems.get("number3"));
        data.setNumber4((Integer) dataItems.get("number4"));
        data.setNumber5((Double) dataItems.get("number5"));
        data.setNumber6((Double) dataItems.get("number6"));
        data.setNumber7((Double) dataItems.get("number7"));
        data.setNumber8((Double) dataItems.get("number8"));

        return message;
    }

    @Override
    public byte[] serializeObject1(Object object) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Serialize.write(Channels.newChannel(out), (MessageBuilder) object);

        return out.toByteArray();
    }

    @Override
    public Object deserializeObject1(byte[] bytes) throws IOException {
        MessageReader messageReader = Serialize.read(ByteBuffer.wrap(bytes));

        return messageReader.getRoot(DataCapnp1.Data.factory);
    }


    @Override
    public Object buildObject2() {
        Map<String, Object> dataItems = DataHelper.getItemMap2();

        MessageBuilder message = new MessageBuilder();

        DataCapnp2.Data.Builder data = message.initRoot(DataCapnp2.Data.factory);
        data.setNumber1((Double) dataItems.get("number1"));
        data.setNumber2((Double) dataItems.get("number2"));
        data.setString1((String) dataItems.get("string1"));
        data.setString2((String) dataItems.get("string2"));
        data.setString3((String) dataItems.get("string3"));
        data.setString4((String) dataItems.get("string4"));
        data.setString5((String) dataItems.get("string5"));
        data.setString6((String) dataItems.get("string6"));
        data.setString7((String) dataItems.get("string7"));
        data.setString8((String) dataItems.get("string8"));

        return message;
    }

    @Override
    public byte[] serializeObject2(Object object) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Serialize.write(Channels.newChannel(out), (MessageBuilder) object);

        return out.toByteArray();
    }

    @Override
    public Object deserializeObject2(byte[] bytes) throws IOException {
        MessageReader messageReader = Serialize.read(ByteBuffer.wrap(bytes));

        return messageReader.getRoot(DataCapnp2.Data.factory);
    }


    @Override
    public Object buildObject3() {
        Map<String, Object> dataItems = DataHelper.getItemMap3();

        MessageBuilder message = new MessageBuilder();

        DataCapnp3.Data.Builder data = message.initRoot(DataCapnp3.Data.factory);
        data.setNumber1((Integer) dataItems.get("number1"));
        data.setNumber2((Integer) dataItems.get("number2"));
        data.setNumber3((Integer) dataItems.get("number3"));
        data.setNumber4((Integer) dataItems.get("number4"));
        data.setNumber5((Integer) dataItems.get("number5"));
        data.setNumber6((Integer) dataItems.get("number6"));
        data.setNumber7((Integer) dataItems.get("number7"));
        data.setNumber8((Integer) dataItems.get("number8"));
        data.setNumber9((Integer) dataItems.get("number9"));
        data.setNumber10((Integer) dataItems.get("number10"));
        data.setNumber11((Double) dataItems.get("number11"));
        data.setNumber12((Double) dataItems.get("number12"));
        data.setNumber13((Double) dataItems.get("number13"));
        data.setNumber14((Double) dataItems.get("number14"));
        data.setNumber15((Double) dataItems.get("number15"));
        data.setNumber16((Double) dataItems.get("number16"));
        data.setNumber17((Double) dataItems.get("number17"));
        data.setNumber18((Double) dataItems.get("number18"));
        data.setNumber19((Double) dataItems.get("number19"));
        data.setNumber20((Double) dataItems.get("number20"));

        return message;
    }

    @Override
    public byte[] serializeObject3(Object object) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Serialize.write(Channels.newChannel(out), (MessageBuilder) object);

        return out.toByteArray();
    }

    @Override
    public Object deserializeObject3(byte[] bytes) throws IOException {
        MessageReader messageReader = Serialize.read(ByteBuffer.wrap(bytes));

        return messageReader.getRoot(DataCapnp3.Data.factory);
    }


    @Override
    public Object buildObject4() {
        Map<String, Object> dataItems = DataHelper.getItemMap4();

        MessageBuilder message = new MessageBuilder();

        DataCapnp4.Data.Builder data = message.initRoot(DataCapnp4.Data.factory);
        data.setString1((String) dataItems.get("string1"));
        data.setString2((String) dataItems.get("string2"));
        data.setString3((String) dataItems.get("string3"));
        data.setString4((String) dataItems.get("string4"));
        data.setString5((String) dataItems.get("string5"));
        data.setString6((String) dataItems.get("string6"));
        data.setString7((String) dataItems.get("string7"));
        data.setString8((String) dataItems.get("string8"));
        data.setString9((String) dataItems.get("string9"));
        data.setString10((String) dataItems.get("string10"));
        data.setString11((String) dataItems.get("string11"));
        data.setString12((String) dataItems.get("string12"));
        data.setString13((String) dataItems.get("string13"));
        data.setString14((String) dataItems.get("string14"));
        data.setString15((String) dataItems.get("string15"));
        data.setString16((String) dataItems.get("string16"));
        data.setString17((String) dataItems.get("string17"));
        data.setString18((String) dataItems.get("string18"));
        data.setString19((String) dataItems.get("string19"));
        data.setString20((String) dataItems.get("string20"));

        return message;
    }

    @Override
    public byte[] serializeObject4(Object object) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Serialize.write(Channels.newChannel(out), (MessageBuilder) object);

        return out.toByteArray();
    }

    @Override
    public Object deserializeObject4(byte[] bytes) throws IOException {
        MessageReader messageReader = Serialize.read(ByteBuffer.wrap(bytes));

        return messageReader.getRoot(DataCapnp4.Data.factory);
    }


    @Override
    public Object buildObject5() {
        Map<String, Object> dataItems = DataHelper.getItemMap5();

        MessageBuilder message = new MessageBuilder();

        DataCapnp4.Data.Builder data = message.initRoot(DataCapnp4.Data.factory);
        data.setString1((String) dataItems.get("string1"));
        data.setString2((String) dataItems.get("string2"));
        data.setString3((String) dataItems.get("string3"));
        data.setString4((String) dataItems.get("string4"));
        data.setString5((String) dataItems.get("string5"));
        data.setString6((String) dataItems.get("string6"));
        data.setString7((String) dataItems.get("string7"));
        data.setString8((String) dataItems.get("string8"));
        data.setString9((String) dataItems.get("string9"));
        data.setString10((String) dataItems.get("string10"));
        data.setString11((String) dataItems.get("string11"));
        data.setString12((String) dataItems.get("string12"));
        data.setString13((String) dataItems.get("string13"));
        data.setString14((String) dataItems.get("string14"));
        data.setString15((String) dataItems.get("string15"));
        data.setString16((String) dataItems.get("string16"));
        data.setString17((String) dataItems.get("string17"));
        data.setString18((String) dataItems.get("string18"));
        data.setString19((String) dataItems.get("string19"));
        data.setString20((String) dataItems.get("string20"));

        return message;
    }

    @Override
    public byte[] serializeObject5(Object object) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Serialize.write(Channels.newChannel(out), (MessageBuilder) object);

        return out.toByteArray();
    }

    @Override
    public Object deserializeObject5(byte[] bytes) throws IOException {
        MessageReader messageReader = Serialize.read(ByteBuffer.wrap(bytes));

        return messageReader.getRoot(DataCapnp4.Data.factory);
    }


    @Override
    public Object buildObject6() {
        Map<String, Object> dataItems = DataHelper.getItemMap6();

        MessageBuilder message = new MessageBuilder();

        DataCapnp6.Data.Builder data = message.initRoot(DataCapnp6.Data.factory);
        data.setString1((String) dataItems.get("string1"));
        data.setString2((String) dataItems.get("string2"));
        data.setString3((String) dataItems.get("string3"));
        data.setString4((String) dataItems.get("string4"));
        data.setString5((String) dataItems.get("string5"));
        data.setString6((String) dataItems.get("string6"));
        data.setString7((String) dataItems.get("string7"));
        data.setString8((String) dataItems.get("string8"));
        data.setString9((String) dataItems.get("string9"));
        data.setString10((String) dataItems.get("string10"));
        data.setString11((String) dataItems.get("string11"));
        data.setString12((String) dataItems.get("string12"));
        data.setString13((String) dataItems.get("string13"));
        data.setString14((String) dataItems.get("string14"));
        data.setString15((String) dataItems.get("string15"));
        data.setString16((String) dataItems.get("string16"));
        data.setString17((String) dataItems.get("string17"));
        data.setString18((String) dataItems.get("string18"));
        data.setString19((String) dataItems.get("string19"));
        data.setString20((String) dataItems.get("string20"));
        data.setString21((String) dataItems.get("string21"));
        data.setString22((String) dataItems.get("string22"));
        data.setString23((String) dataItems.get("string23"));
        data.setString24((String) dataItems.get("string24"));
        data.setString25((String) dataItems.get("string25"));
        data.setString26((String) dataItems.get("string26"));
        data.setString27((String) dataItems.get("string27"));
        data.setString28((String) dataItems.get("string28"));
        data.setString29((String) dataItems.get("string29"));
        data.setString30((String) dataItems.get("string30"));
        data.setNumber1((Integer) dataItems.get("number1"));
        data.setNumber2((Integer) dataItems.get("number2"));
        data.setNumber3((Integer) dataItems.get("number3"));
        data.setNumber4((Integer) dataItems.get("number4"));
        data.setNumber5((Integer) dataItems.get("number5"));
        data.setNumber6((Integer) dataItems.get("number6"));
        data.setNumber7((Integer) dataItems.get("number7"));
        data.setNumber8((Integer) dataItems.get("number8"));
        data.setNumber9((Integer) dataItems.get("number9"));
        data.setNumber10((Integer) dataItems.get("number10"));
        data.setNumber11((Integer) dataItems.get("number11"));
        data.setNumber12((Integer) dataItems.get("number12"));
        data.setNumber13((Integer) dataItems.get("number13"));
        data.setNumber14((Integer) dataItems.get("number14"));
        data.setNumber15((Integer) dataItems.get("number15"));
        data.setNumber16((Integer) dataItems.get("number16"));
        data.setNumber17((Integer) dataItems.get("number17"));
        data.setNumber18((Integer) dataItems.get("number18"));
        data.setNumber19((Integer) dataItems.get("number19"));
        data.setNumber20((Integer) dataItems.get("number20"));
        data.setNumber21((Integer) dataItems.get("number21"));
        data.setNumber22((Integer) dataItems.get("number22"));
        data.setNumber23((Integer) dataItems.get("number23"));
        data.setNumber24((Integer) dataItems.get("number24"));
        data.setNumber25((Integer) dataItems.get("number25"));
        data.setNumber26((Integer) dataItems.get("number26"));
        data.setNumber27((Integer) dataItems.get("number27"));
        data.setNumber28((Integer) dataItems.get("number28"));
        data.setNumber29((Integer) dataItems.get("number29"));
        data.setNumber30((Integer) dataItems.get("number30"));
        data.setNumber31((Integer) dataItems.get("number31"));
        data.setNumber32((Integer) dataItems.get("number32"));
        data.setNumber33((Integer) dataItems.get("number33"));
        data.setNumber34((Integer) dataItems.get("number34"));
        data.setNumber35((Integer) dataItems.get("number35"));
        data.setNumber36((Integer) dataItems.get("number36"));
        data.setNumber37((Integer) dataItems.get("number37"));
        data.setNumber38((Integer) dataItems.get("number38"));
        data.setNumber39((Integer) dataItems.get("number39"));
        data.setNumber40((Integer) dataItems.get("number40"));
        data.setNumber41((Integer) dataItems.get("number41"));
        data.setNumber42((Integer) dataItems.get("number42"));
        data.setNumber43((Integer) dataItems.get("number43"));
        data.setNumber44((Integer) dataItems.get("number44"));
        data.setNumber45((Integer) dataItems.get("number45"));
        data.setNumber46((Integer) dataItems.get("number46"));
        data.setNumber47((Integer) dataItems.get("number47"));
        data.setNumber48((Integer) dataItems.get("number48"));
        data.setNumber49((Integer) dataItems.get("number49"));
        data.setNumber50((Integer) dataItems.get("number50"));
        data.setNumber51((Integer) dataItems.get("number51"));
        data.setNumber52((Integer) dataItems.get("number52"));
        data.setNumber53((Integer) dataItems.get("number53"));
        data.setNumber54((Integer) dataItems.get("number54"));
        data.setNumber55((Integer) dataItems.get("number55"));
        data.setNumber56((Integer) dataItems.get("number56"));
        data.setNumber57((Integer) dataItems.get("number57"));
        data.setNumber58((Integer) dataItems.get("number58"));
        data.setNumber59((Integer) dataItems.get("number59"));
        data.setNumber60((Integer) dataItems.get("number60"));
        data.setNumber61((Integer) dataItems.get("number61"));
        data.setNumber62((Integer) dataItems.get("number62"));
        data.setNumber63((Integer) dataItems.get("number63"));
        data.setNumber64((Integer) dataItems.get("number64"));
        data.setNumber65((Integer) dataItems.get("number65"));
        data.setNumber66((Integer) dataItems.get("number66"));
        data.setNumber67((Integer) dataItems.get("number67"));
        data.setNumber68((Integer) dataItems.get("number68"));
        data.setNumber69((Integer) dataItems.get("number69"));
        data.setNumber70((Integer) dataItems.get("number70"));
        data.setNumber71((Integer) dataItems.get("number71"));
        data.setNumber72((Integer) dataItems.get("number72"));
        data.setNumber73((Integer) dataItems.get("number73"));
        data.setNumber74((Integer) dataItems.get("number74"));
        data.setNumber75((Integer) dataItems.get("number75"));
        data.setNumber76((Integer) dataItems.get("number76"));
        data.setNumber77((Integer) dataItems.get("number77"));
        data.setNumber78((Integer) dataItems.get("number78"));
        data.setNumber79((Integer) dataItems.get("number79"));
        data.setNumber80((Integer) dataItems.get("number80"));
        data.setNumber81((Integer) dataItems.get("number81"));
        data.setNumber82((Integer) dataItems.get("number82"));
        data.setNumber83((Integer) dataItems.get("number83"));
        data.setNumber84((Integer) dataItems.get("number84"));
        data.setNumber85((Integer) dataItems.get("number85"));
        data.setNumber86((Integer) dataItems.get("number86"));
        data.setNumber87((Integer) dataItems.get("number87"));
        data.setNumber88((Integer) dataItems.get("number88"));
        data.setNumber89((Integer) dataItems.get("number89"));
        data.setNumber90((Integer) dataItems.get("number90"));
        data.setNumber91((Integer) dataItems.get("number91"));
        data.setNumber92((Integer) dataItems.get("number92"));
        data.setNumber93((Integer) dataItems.get("number93"));
        data.setNumber94((Integer) dataItems.get("number94"));
        data.setNumber95((Integer) dataItems.get("number95"));
        data.setNumber96((Integer) dataItems.get("number96"));
        data.setNumber97((Integer) dataItems.get("number97"));
        data.setNumber98((Integer) dataItems.get("number98"));
        data.setNumber99((Integer) dataItems.get("number99"));
        data.setNumber100((Integer) dataItems.get("number100"));
        data.setNumber101((Integer) dataItems.get("number101"));
        data.setNumber102((Integer) dataItems.get("number102"));
        data.setNumber103((Integer) dataItems.get("number103"));
        data.setNumber104((Integer) dataItems.get("number104"));
        data.setNumber105((Integer) dataItems.get("number105"));
        data.setNumber106((Integer) dataItems.get("number106"));
        data.setNumber107((Integer) dataItems.get("number107"));
        data.setNumber108((Integer) dataItems.get("number108"));
        data.setNumber109((Integer) dataItems.get("number109"));
        data.setNumber110((Integer) dataItems.get("number110"));
        data.setNumber111((Integer) dataItems.get("number111"));
        data.setNumber112((Integer) dataItems.get("number112"));
        data.setNumber113((Integer) dataItems.get("number113"));
        data.setNumber114((Integer) dataItems.get("number114"));
        data.setNumber115((Integer) dataItems.get("number115"));
        data.setNumber116((Integer) dataItems.get("number116"));
        data.setNumber117((Integer) dataItems.get("number117"));
        data.setNumber118((Integer) dataItems.get("number118"));
        data.setNumber119((Integer) dataItems.get("number119"));
        data.setNumber120((Integer) dataItems.get("number120"));
        data.setNumber121((Double) dataItems.get("number121"));
        data.setNumber122((Double) dataItems.get("number122"));
        data.setNumber123((Double) dataItems.get("number123"));
        data.setNumber124((Double) dataItems.get("number124"));
        data.setNumber125((Double) dataItems.get("number125"));
        data.setNumber126((Double) dataItems.get("number126"));
        data.setNumber127((Double) dataItems.get("number127"));
        data.setNumber128((Double) dataItems.get("number128"));
        data.setNumber129((Double) dataItems.get("number129"));
        data.setNumber130((Double) dataItems.get("number130"));
        data.setNumber131((Double) dataItems.get("number131"));
        data.setNumber132((Double) dataItems.get("number132"));
        data.setNumber133((Double) dataItems.get("number133"));
        data.setNumber134((Double) dataItems.get("number134"));
        data.setNumber135((Double) dataItems.get("number135"));
        data.setNumber136((Double) dataItems.get("number136"));
        data.setNumber137((Double) dataItems.get("number137"));
        data.setNumber138((Double) dataItems.get("number138"));
        data.setNumber139((Double) dataItems.get("number139"));
        data.setNumber140((Double) dataItems.get("number140"));
        data.setNumber141((Double) dataItems.get("number141"));
        data.setNumber142((Double) dataItems.get("number142"));
        data.setNumber143((Double) dataItems.get("number143"));
        data.setNumber144((Double) dataItems.get("number144"));
        data.setNumber145((Double) dataItems.get("number145"));
        data.setNumber146((Double) dataItems.get("number146"));
        data.setNumber147((Double) dataItems.get("number147"));
        data.setNumber148((Double) dataItems.get("number148"));
        data.setNumber149((Double) dataItems.get("number149"));
        data.setNumber150((Double) dataItems.get("number150"));
        data.setNumber151((Double) dataItems.get("number151"));
        data.setNumber152((Double) dataItems.get("number152"));
        data.setNumber153((Double) dataItems.get("number153"));
        data.setNumber154((Double) dataItems.get("number154"));
        data.setNumber155((Double) dataItems.get("number155"));
        data.setNumber156((Double) dataItems.get("number156"));
        data.setNumber157((Double) dataItems.get("number157"));
        data.setNumber158((Double) dataItems.get("number158"));
        data.setNumber159((Double) dataItems.get("number159"));
        data.setNumber160((Double) dataItems.get("number160"));
        data.setNumber161((Double) dataItems.get("number161"));
        data.setNumber162((Double) dataItems.get("number162"));
        data.setNumber163((Double) dataItems.get("number163"));
        data.setNumber164((Double) dataItems.get("number164"));
        data.setNumber165((Double) dataItems.get("number165"));
        data.setNumber166((Double) dataItems.get("number166"));
        data.setNumber167((Double) dataItems.get("number167"));
        data.setNumber168((Double) dataItems.get("number168"));
        data.setNumber169((Double) dataItems.get("number169"));
        data.setNumber170((Double) dataItems.get("number170"));

        return message;
    }

    @Override
    public byte[] serializeObject6(Object object) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Serialize.write(Channels.newChannel(out), (MessageBuilder) object);

        return out.toByteArray();
    }

    @Override
    public Object deserializeObject6(byte[] bytes) throws IOException {
        MessageReader messageReader = Serialize.read(ByteBuffer.wrap(bytes));

        return messageReader.getRoot(DataCapnp6.Data.factory);
    }
}
