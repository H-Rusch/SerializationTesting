package comparison.measurements;

import comparison.DataHelper;
import generated.data1.avro.Data1Avro;
import generated.data2.avro.Data2Avro;
import generated.data3.avro.Data3Avro;
import generated.data4_5.avro.Data4Avro;
import generated.data6.avro.Data6Avro;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import testing.avro.PersonAvro;
import testing.avro.PhoneNumberAvro;
import testing.avro.PhoneTypeAvro;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AvroMeasurement extends Measurement {

    private final DatumWriter<Data1Avro> datumWriterData1;
    private final DatumReader<Data1Avro> datumReaderData1;
    private final DatumWriter<Data2Avro> datumWriterData2;
    private final DatumReader<Data2Avro> datumReaderData2;
    private final DatumWriter<Data3Avro> datumWriterData3;
    private final DatumReader<Data3Avro> datumReaderData3;
    private final DatumWriter<Data4Avro> datumWriterData4;
    private final DatumReader<Data4Avro> datumReaderData4;
    private final DatumWriter<Data6Avro> datumWriterData6;
    private final DatumReader<Data6Avro> datumReaderData6;

    private final ByteArrayOutputStream outputStream;

    private final Encoder encoder;
    private BinaryDecoder decoder;


    public AvroMeasurement() {
        super("Avro", "avro", "ser");
        this.datumWriterData1 = new SpecificDatumWriter<>(Data1Avro.class);
        this.datumReaderData1 = new SpecificDatumReader<>(Data1Avro.class);
        this.datumWriterData2 = new SpecificDatumWriter<>(Data2Avro.class);
        this.datumReaderData2 = new SpecificDatumReader<>(Data2Avro.class);
        this.datumWriterData3 = new SpecificDatumWriter<>(Data3Avro.class);
        this.datumReaderData3 = new SpecificDatumReader<>(Data3Avro.class);
        this.datumWriterData4 = new SpecificDatumWriter<>(Data4Avro.class);
        this.datumReaderData4 = new SpecificDatumReader<>(Data4Avro.class);
        this.datumWriterData6 = new SpecificDatumWriter<>(Data6Avro.class);
        this.datumReaderData6 = new SpecificDatumReader<>(Data6Avro.class);

        this.outputStream = new ByteArrayOutputStream();

        this.encoder = EncoderFactory.get().binaryEncoder(outputStream, null);
        this.decoder = DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(new byte[0]), null);
    }


    @Override
    public Object buildObject1() {
        Map<String, Object> dataItems = DataHelper.getItemMap1();

        return Data1Avro.newBuilder()
                .setString1((String) dataItems.get("string1"))
                .setString2((String) dataItems.get("string2"))
                .setNumber1((Integer) dataItems.get("number1"))
                .setNumber2((Integer) dataItems.get("number2"))
                .setNumber3((Integer) dataItems.get("number3"))
                .setNumber4((Integer) dataItems.get("number4"))
                .setNumber5((Double) dataItems.get("number5"))
                .setNumber6((Double) dataItems.get("number6"))
                .setNumber7((Double) dataItems.get("number7"))
                .setNumber8((Double) dataItems.get("number8"))
                .build();
    }

    @Override
    public byte[] serializeObject1(Object object) throws IOException {
        outputStream.reset();
        datumWriterData1.write((Data1Avro) object, encoder);
        encoder.flush();

        return outputStream.toByteArray();
    }

    @Override
    public Object deserializeObject1(byte[] bytes) throws IOException {
        decoder = DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(bytes), decoder);

        return datumReaderData1.read(null, decoder);
    }


    @Override
    public Object buildObject2() {
        Map<String, Object> dataItems = DataHelper.getItemMap2();

        return Data2Avro.newBuilder()
                .setNumber1((Double) dataItems.get("number1"))
                .setNumber2((Double) dataItems.get("number2"))
                .setString1((String) dataItems.get("string1"))
                .setString2((String) dataItems.get("string2"))
                .setString3((String) dataItems.get("string3"))
                .setString4((String) dataItems.get("string4"))
                .setString5((String) dataItems.get("string5"))
                .setString6((String) dataItems.get("string6"))
                .setString7((String) dataItems.get("string7"))
                .setString8((String) dataItems.get("string8"))
                .build();
    }

    @Override
    public byte[] serializeObject2(Object object) throws IOException {
        outputStream.reset();
        datumWriterData2.write((Data2Avro) object, encoder);
        encoder.flush();

        return outputStream.toByteArray();
    }

    @Override
    public Object deserializeObject2(byte[] bytes) throws IOException {
        decoder = DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(bytes), decoder);

        return datumReaderData2.read(null, decoder);
    }


    @Override
    public Object buildObject3() {
        Map<String, Object> dataItems = DataHelper.getItemMap3();

        return Data3Avro.newBuilder()
                .setNumber1((Integer) dataItems.get("number1"))
                .setNumber2((Integer) dataItems.get("number2"))
                .setNumber3((Integer) dataItems.get("number3"))
                .setNumber4((Integer) dataItems.get("number4"))
                .setNumber5((Integer) dataItems.get("number5"))
                .setNumber6((Integer) dataItems.get("number6"))
                .setNumber7((Integer) dataItems.get("number7"))
                .setNumber8((Integer) dataItems.get("number8"))
                .setNumber9((Integer) dataItems.get("number9"))
                .setNumber10((Integer) dataItems.get("number10"))
                .setNumber11((Double) dataItems.get("number11"))
                .setNumber12((Double) dataItems.get("number12"))
                .setNumber13((Double) dataItems.get("number13"))
                .setNumber14((Double) dataItems.get("number14"))
                .setNumber15((Double) dataItems.get("number15"))
                .setNumber16((Double) dataItems.get("number16"))
                .setNumber17((Double) dataItems.get("number17"))
                .setNumber18((Double) dataItems.get("number18"))
                .setNumber19((Double) dataItems.get("number19"))
                .setNumber20((Double) dataItems.get("number20"))
                .build();
    }

    @Override
    public byte[] serializeObject3(Object object) throws IOException {
        outputStream.reset();
        datumWriterData3.write((Data3Avro) object, encoder);
        encoder.flush();

        return outputStream.toByteArray();
    }

    @Override
    public Object deserializeObject3(byte[] bytes) throws IOException {
        decoder = DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(bytes), decoder);

        return datumReaderData3.read(null, decoder);
    }


    @Override
    public Object buildObject4() {
        Map<String, Object> dataItems = DataHelper.getItemMap4();

        return Data4Avro.newBuilder()
                .setString1((String) dataItems.get("string1"))
                .setString2((String) dataItems.get("string2"))
                .setString3((String) dataItems.get("string3"))
                .setString4((String) dataItems.get("string4"))
                .setString5((String) dataItems.get("string5"))
                .setString6((String) dataItems.get("string6"))
                .setString7((String) dataItems.get("string7"))
                .setString8((String) dataItems.get("string8"))
                .setString9((String) dataItems.get("string9"))
                .setString10((String) dataItems.get("string10"))
                .setString11((String) dataItems.get("string11"))
                .setString12((String) dataItems.get("string12"))
                .setString13((String) dataItems.get("string13"))
                .setString14((String) dataItems.get("string14"))
                .setString15((String) dataItems.get("string15"))
                .setString16((String) dataItems.get("string16"))
                .setString17((String) dataItems.get("string17"))
                .setString18((String) dataItems.get("string18"))
                .setString19((String) dataItems.get("string19"))
                .setString20((String) dataItems.get("string20"))
                .build();
    }

    @Override
    public byte[] serializeObject4(Object object) throws IOException {
        outputStream.reset();
        datumWriterData4.write((Data4Avro) object, encoder);
        encoder.flush();

        return outputStream.toByteArray();
    }

    @Override
    public Object deserializeObject4(byte[] bytes) throws IOException {
        decoder = DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(bytes), decoder);

        return datumReaderData4.read(null, decoder);
    }


    @Override
    public Object buildObject5() {
        Map<String, Object> dataItems = DataHelper.getItemMap5();

        return Data4Avro.newBuilder()
                .setString1((String) dataItems.get("string1"))
                .setString2((String) dataItems.get("string2"))
                .setString3((String) dataItems.get("string3"))
                .setString4((String) dataItems.get("string4"))
                .setString5((String) dataItems.get("string5"))
                .setString6((String) dataItems.get("string6"))
                .setString7((String) dataItems.get("string7"))
                .setString8((String) dataItems.get("string8"))
                .setString9((String) dataItems.get("string9"))
                .setString10((String) dataItems.get("string10"))
                .setString11((String) dataItems.get("string11"))
                .setString12((String) dataItems.get("string12"))
                .setString13((String) dataItems.get("string13"))
                .setString14((String) dataItems.get("string14"))
                .setString15((String) dataItems.get("string15"))
                .setString16((String) dataItems.get("string16"))
                .setString17((String) dataItems.get("string17"))
                .setString18((String) dataItems.get("string18"))
                .setString19((String) dataItems.get("string19"))
                .setString20((String) dataItems.get("string20"))
                .build();
    }

    @Override
    public byte[] serializeObject5(Object object) throws IOException {
        outputStream.reset();
        datumWriterData4.write((Data4Avro) object, encoder);
        encoder.flush();

        return outputStream.toByteArray();
    }

    @Override
    public Object deserializeObject5(byte[] bytes) throws IOException {
        decoder = DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(bytes), decoder);

        return datumReaderData4.read(null, decoder);
    }


    @Override
    public Object buildObject6() {
        Map<String, Object> dataItems = DataHelper.getItemMap6();

        return Data6Avro.newBuilder()
                .setString1((String) dataItems.get("string1"))
                .setString2((String) dataItems.get("string2"))
                .setString3((String) dataItems.get("string3"))
                .setString4((String) dataItems.get("string4"))
                .setString5((String) dataItems.get("string5"))
                .setString6((String) dataItems.get("string6"))
                .setString7((String) dataItems.get("string7"))
                .setString8((String) dataItems.get("string8"))
                .setString9((String) dataItems.get("string9"))
                .setString10((String) dataItems.get("string10"))
                .setString11((String) dataItems.get("string11"))
                .setString12((String) dataItems.get("string12"))
                .setString13((String) dataItems.get("string13"))
                .setString14((String) dataItems.get("string14"))
                .setString15((String) dataItems.get("string15"))
                .setString16((String) dataItems.get("string16"))
                .setString17((String) dataItems.get("string17"))
                .setString18((String) dataItems.get("string18"))
                .setString19((String) dataItems.get("string19"))
                .setString20((String) dataItems.get("string20"))
                .setString21((String) dataItems.get("string21"))
                .setString22((String) dataItems.get("string22"))
                .setString23((String) dataItems.get("string23"))
                .setString24((String) dataItems.get("string24"))
                .setString25((String) dataItems.get("string25"))
                .setString26((String) dataItems.get("string26"))
                .setString27((String) dataItems.get("string27"))
                .setString28((String) dataItems.get("string28"))
                .setString29((String) dataItems.get("string29"))
                .setString30((String) dataItems.get("string30"))
                .setNumber1((Integer) dataItems.get("number1"))
                .setNumber2((Integer) dataItems.get("number2"))
                .setNumber3((Integer) dataItems.get("number3"))
                .setNumber4((Integer) dataItems.get("number4"))
                .setNumber5((Integer) dataItems.get("number5"))
                .setNumber6((Integer) dataItems.get("number6"))
                .setNumber7((Integer) dataItems.get("number7"))
                .setNumber8((Integer) dataItems.get("number8"))
                .setNumber9((Integer) dataItems.get("number9"))
                .setNumber10((Integer) dataItems.get("number10"))
                .setNumber11((Integer) dataItems.get("number11"))
                .setNumber12((Integer) dataItems.get("number12"))
                .setNumber13((Integer) dataItems.get("number13"))
                .setNumber14((Integer) dataItems.get("number14"))
                .setNumber15((Integer) dataItems.get("number15"))
                .setNumber16((Integer) dataItems.get("number16"))
                .setNumber17((Integer) dataItems.get("number17"))
                .setNumber18((Integer) dataItems.get("number18"))
                .setNumber19((Integer) dataItems.get("number19"))
                .setNumber20((Integer) dataItems.get("number20"))
                .setNumber21((Integer) dataItems.get("number21"))
                .setNumber22((Integer) dataItems.get("number22"))
                .setNumber23((Integer) dataItems.get("number23"))
                .setNumber24((Integer) dataItems.get("number24"))
                .setNumber25((Integer) dataItems.get("number25"))
                .setNumber26((Integer) dataItems.get("number26"))
                .setNumber27((Integer) dataItems.get("number27"))
                .setNumber28((Integer) dataItems.get("number28"))
                .setNumber29((Integer) dataItems.get("number29"))
                .setNumber30((Integer) dataItems.get("number30"))
                .setNumber31((Integer) dataItems.get("number31"))
                .setNumber32((Integer) dataItems.get("number32"))
                .setNumber33((Integer) dataItems.get("number33"))
                .setNumber34((Integer) dataItems.get("number34"))
                .setNumber35((Integer) dataItems.get("number35"))
                .setNumber36((Integer) dataItems.get("number36"))
                .setNumber37((Integer) dataItems.get("number37"))
                .setNumber38((Integer) dataItems.get("number38"))
                .setNumber39((Integer) dataItems.get("number39"))
                .setNumber40((Integer) dataItems.get("number40"))
                .setNumber41((Integer) dataItems.get("number41"))
                .setNumber42((Integer) dataItems.get("number42"))
                .setNumber43((Integer) dataItems.get("number43"))
                .setNumber44((Integer) dataItems.get("number44"))
                .setNumber45((Integer) dataItems.get("number45"))
                .setNumber46((Integer) dataItems.get("number46"))
                .setNumber47((Integer) dataItems.get("number47"))
                .setNumber48((Integer) dataItems.get("number48"))
                .setNumber49((Integer) dataItems.get("number49"))
                .setNumber50((Integer) dataItems.get("number50"))
                .setNumber51((Integer) dataItems.get("number51"))
                .setNumber52((Integer) dataItems.get("number52"))
                .setNumber53((Integer) dataItems.get("number53"))
                .setNumber54((Integer) dataItems.get("number54"))
                .setNumber55((Integer) dataItems.get("number55"))
                .setNumber56((Integer) dataItems.get("number56"))
                .setNumber57((Integer) dataItems.get("number57"))
                .setNumber58((Integer) dataItems.get("number58"))
                .setNumber59((Integer) dataItems.get("number59"))
                .setNumber60((Integer) dataItems.get("number60"))
                .setNumber61((Integer) dataItems.get("number61"))
                .setNumber62((Integer) dataItems.get("number62"))
                .setNumber63((Integer) dataItems.get("number63"))
                .setNumber64((Integer) dataItems.get("number64"))
                .setNumber65((Integer) dataItems.get("number65"))
                .setNumber66((Integer) dataItems.get("number66"))
                .setNumber67((Integer) dataItems.get("number67"))
                .setNumber68((Integer) dataItems.get("number68"))
                .setNumber69((Integer) dataItems.get("number69"))
                .setNumber70((Integer) dataItems.get("number70"))
                .setNumber71((Integer) dataItems.get("number71"))
                .setNumber72((Integer) dataItems.get("number72"))
                .setNumber73((Integer) dataItems.get("number73"))
                .setNumber74((Integer) dataItems.get("number74"))
                .setNumber75((Integer) dataItems.get("number75"))
                .setNumber76((Integer) dataItems.get("number76"))
                .setNumber77((Integer) dataItems.get("number77"))
                .setNumber78((Integer) dataItems.get("number78"))
                .setNumber79((Integer) dataItems.get("number79"))
                .setNumber80((Integer) dataItems.get("number80"))
                .setNumber81((Integer) dataItems.get("number81"))
                .setNumber82((Integer) dataItems.get("number82"))
                .setNumber83((Integer) dataItems.get("number83"))
                .setNumber84((Integer) dataItems.get("number84"))
                .setNumber85((Integer) dataItems.get("number85"))
                .setNumber86((Integer) dataItems.get("number86"))
                .setNumber87((Integer) dataItems.get("number87"))
                .setNumber88((Integer) dataItems.get("number88"))
                .setNumber89((Integer) dataItems.get("number89"))
                .setNumber90((Integer) dataItems.get("number90"))
                .setNumber91((Integer) dataItems.get("number91"))
                .setNumber92((Integer) dataItems.get("number92"))
                .setNumber93((Integer) dataItems.get("number93"))
                .setNumber94((Integer) dataItems.get("number94"))
                .setNumber95((Integer) dataItems.get("number95"))
                .setNumber96((Integer) dataItems.get("number96"))
                .setNumber97((Integer) dataItems.get("number97"))
                .setNumber98((Integer) dataItems.get("number98"))
                .setNumber99((Integer) dataItems.get("number99"))
                .setNumber100((Integer) dataItems.get("number100"))
                .setNumber101((Integer) dataItems.get("number101"))
                .setNumber102((Integer) dataItems.get("number102"))
                .setNumber103((Integer) dataItems.get("number103"))
                .setNumber104((Integer) dataItems.get("number104"))
                .setNumber105((Integer) dataItems.get("number105"))
                .setNumber106((Integer) dataItems.get("number106"))
                .setNumber107((Integer) dataItems.get("number107"))
                .setNumber108((Integer) dataItems.get("number108"))
                .setNumber109((Integer) dataItems.get("number109"))
                .setNumber110((Integer) dataItems.get("number110"))
                .setNumber111((Integer) dataItems.get("number111"))
                .setNumber112((Integer) dataItems.get("number112"))
                .setNumber113((Integer) dataItems.get("number113"))
                .setNumber114((Integer) dataItems.get("number114"))
                .setNumber115((Integer) dataItems.get("number115"))
                .setNumber116((Integer) dataItems.get("number116"))
                .setNumber117((Integer) dataItems.get("number117"))
                .setNumber118((Integer) dataItems.get("number118"))
                .setNumber119((Integer) dataItems.get("number119"))
                .setNumber120((Integer) dataItems.get("number120"))
                .setNumber121((Double) dataItems.get("number121"))
                .setNumber122((Double) dataItems.get("number122"))
                .setNumber123((Double) dataItems.get("number123"))
                .setNumber124((Double) dataItems.get("number124"))
                .setNumber125((Double) dataItems.get("number125"))
                .setNumber126((Double) dataItems.get("number126"))
                .setNumber127((Double) dataItems.get("number127"))
                .setNumber128((Double) dataItems.get("number128"))
                .setNumber129((Double) dataItems.get("number129"))
                .setNumber130((Double) dataItems.get("number130"))
                .setNumber131((Double) dataItems.get("number131"))
                .setNumber132((Double) dataItems.get("number132"))
                .setNumber133((Double) dataItems.get("number133"))
                .setNumber134((Double) dataItems.get("number134"))
                .setNumber135((Double) dataItems.get("number135"))
                .setNumber136((Double) dataItems.get("number136"))
                .setNumber137((Double) dataItems.get("number137"))
                .setNumber138((Double) dataItems.get("number138"))
                .setNumber139((Double) dataItems.get("number139"))
                .setNumber140((Double) dataItems.get("number140"))
                .setNumber141((Double) dataItems.get("number141"))
                .setNumber142((Double) dataItems.get("number142"))
                .setNumber143((Double) dataItems.get("number143"))
                .setNumber144((Double) dataItems.get("number144"))
                .setNumber145((Double) dataItems.get("number145"))
                .setNumber146((Double) dataItems.get("number146"))
                .setNumber147((Double) dataItems.get("number147"))
                .setNumber148((Double) dataItems.get("number148"))
                .setNumber149((Double) dataItems.get("number149"))
                .setNumber150((Double) dataItems.get("number150"))
                .setNumber151((Double) dataItems.get("number151"))
                .setNumber152((Double) dataItems.get("number152"))
                .setNumber153((Double) dataItems.get("number153"))
                .setNumber154((Double) dataItems.get("number154"))
                .setNumber155((Double) dataItems.get("number155"))
                .setNumber156((Double) dataItems.get("number156"))
                .setNumber157((Double) dataItems.get("number157"))
                .setNumber158((Double) dataItems.get("number158"))
                .setNumber159((Double) dataItems.get("number159"))
                .setNumber160((Double) dataItems.get("number160"))
                .setNumber161((Double) dataItems.get("number161"))
                .setNumber162((Double) dataItems.get("number162"))
                .setNumber163((Double) dataItems.get("number163"))
                .setNumber164((Double) dataItems.get("number164"))
                .setNumber165((Double) dataItems.get("number165"))
                .setNumber166((Double) dataItems.get("number166"))
                .setNumber167((Double) dataItems.get("number167"))
                .setNumber168((Double) dataItems.get("number168"))
                .setNumber169((Double) dataItems.get("number169"))
                .setNumber170((Double) dataItems.get("number170"))
                .build();
    }

    @Override
    public byte[] serializeObject6(Object object) throws IOException {
        outputStream.reset();
        datumWriterData6.write((Data6Avro) object, encoder);
        encoder.flush();

        return outputStream.toByteArray();
    }

    @Override
    public Object deserializeObject6(byte[] bytes) throws IOException {
        decoder = DecoderFactory.get().directBinaryDecoder(new ByteArrayInputStream(bytes), decoder);

        return datumReaderData6.read(null, decoder);
    }
}
