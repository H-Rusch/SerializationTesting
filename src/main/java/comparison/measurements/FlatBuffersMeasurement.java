package comparison.measurements;

import com.google.flatbuffers.FlatBufferBuilder;
import comparison.DataHelper;
import generated.data1.flatbuffers.Data1Flat;
import generated.data2.flatbuffers.Data2Flat;
import generated.data3.flatbuffers.Data3Flat;
import generated.data4_5.flatbuffers.Data4Flat;
import generated.data6.flatbuffers.Data6Flat;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

public class FlatBuffersMeasurement extends Measurement {

    private FlatBufferBuilder builder;

    public FlatBuffersMeasurement() {
        super("FlatBuffers", "flatbuffers", "dat");
        this.builder = new FlatBufferBuilder();
    }

    @Override
    public Object buildObject1() {
        return null;
    }

    @Override
    public byte[] serializeObject1(Object object) throws IOException {
        Map<String, Object> dataItems = DataHelper.getItemMap1();

        builder.clear();

        int string1Offset = builder.createString((String) dataItems.get("string1"));
        int string2Offset = builder.createString((String) dataItems.get("string2"));

        Data1Flat.startData1Flat(builder);
        Data1Flat.addString1(builder, string1Offset);
        Data1Flat.addString2(builder, string2Offset);
        Data1Flat.addNumber1(builder, (Integer) dataItems.get("number1"));
        Data1Flat.addNumber2(builder, (Integer) dataItems.get("number2"));
        Data1Flat.addNumber3(builder, (Integer) dataItems.get("number3"));
        Data1Flat.addNumber4(builder, (Integer) dataItems.get("number4"));
        Data1Flat.addNumber5(builder, (Double) dataItems.get("number5"));
        Data1Flat.addNumber6(builder, (Double) dataItems.get("number6"));
        Data1Flat.addNumber7(builder, (Double) dataItems.get("number7"));
        Data1Flat.addNumber8(builder, (Double) dataItems.get("number8"));
        int data = Data1Flat.endData1Flat(builder);
        builder.finish(data);

        return builder.sizedByteArray();
    }

    @Override
    public Object deserializeObject1(byte[] bytes) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        return Data1Flat.getRootAsData1Flat(buffer);
    }


    @Override
    public Object buildObject2() {
        return null;
    }

    @Override
    public byte[] serializeObject2(Object object) throws IOException {
        Map<String, Object> dataItems = DataHelper.getItemMap2();

        builder.clear();

        int string1Offset = builder.createString((String) dataItems.get("string1"));
        int string2Offset = builder.createString((String) dataItems.get("string2"));
        int string3Offset = builder.createString((String) dataItems.get("string3"));
        int string4Offset = builder.createString((String) dataItems.get("string4"));
        int string5Offset = builder.createString((String) dataItems.get("string5"));
        int string6Offset = builder.createString((String) dataItems.get("string6"));
        int string7Offset = builder.createString((String) dataItems.get("string7"));
        int string8Offset = builder.createString((String) dataItems.get("string8"));

        Data2Flat.startData2Flat(builder);
        Data2Flat.addNumber1(builder, (Double) dataItems.get("number1"));
        Data2Flat.addNumber2(builder, (Double) dataItems.get("number2"));
        Data2Flat.addString1(builder, string1Offset);
        Data2Flat.addString2(builder, string2Offset);
        Data2Flat.addString3(builder, string3Offset);
        Data2Flat.addString4(builder, string4Offset);
        Data2Flat.addString5(builder, string5Offset);
        Data2Flat.addString6(builder, string6Offset);
        Data2Flat.addString7(builder, string7Offset);
        Data2Flat.addString8(builder, string8Offset);
        int data = Data2Flat.endData2Flat(builder);
        builder.finish(data);

        return builder.sizedByteArray();
    }

    @Override
    public Object deserializeObject2(byte[] bytes) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        return Data2Flat.getRootAsData2Flat(buffer);
    }

    @Override
    public Object buildObject3() {
        return null;
    }


    @Override
    public byte[] serializeObject3(Object object) throws IOException {
        Map<String, Object> dataItems = DataHelper.getItemMap3();

        builder.clear();

        Data3Flat.startData3Flat(builder);
        Data3Flat.addNumber1(builder, (Integer) dataItems.get("number1"));
        Data3Flat.addNumber2(builder, (Integer) dataItems.get("number2"));
        Data3Flat.addNumber3(builder, (Integer) dataItems.get("number3"));
        Data3Flat.addNumber4(builder, (Integer) dataItems.get("number4"));
        Data3Flat.addNumber5(builder, (Integer) dataItems.get("number5"));
        Data3Flat.addNumber6(builder, (Integer) dataItems.get("number6"));
        Data3Flat.addNumber7(builder, (Integer) dataItems.get("number7"));
        Data3Flat.addNumber8(builder, (Integer) dataItems.get("number8"));
        Data3Flat.addNumber9(builder, (Integer) dataItems.get("number9"));
        Data3Flat.addNumber10(builder, (Integer) dataItems.get("number10"));
        Data3Flat.addNumber11(builder, (Double) dataItems.get("number11"));
        Data3Flat.addNumber12(builder, (Double) dataItems.get("number12"));
        Data3Flat.addNumber13(builder, (Double) dataItems.get("number13"));
        Data3Flat.addNumber14(builder, (Double) dataItems.get("number14"));
        Data3Flat.addNumber15(builder, (Double) dataItems.get("number15"));
        Data3Flat.addNumber16(builder, (Double) dataItems.get("number16"));
        Data3Flat.addNumber17(builder, (Double) dataItems.get("number17"));
        Data3Flat.addNumber18(builder, (Double) dataItems.get("number18"));
        Data3Flat.addNumber19(builder, (Double) dataItems.get("number19"));
        Data3Flat.addNumber20(builder, (Double) dataItems.get("number20"));
        int data = Data3Flat.endData3Flat(builder);
        builder.finish(data);

        return builder.sizedByteArray();
    }

    @Override
    public Object deserializeObject3(byte[] bytes) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        return Data3Flat.getRootAsData3Flat(buffer);
    }


    @Override
    public Object buildObject4() {
        return null;
    }

    @Override
    public byte[] serializeObject4(Object object) throws IOException {
        Map<String, Object> dataItems = DataHelper.getItemMap4();

        builder.clear();

        int string1Offset = builder.createString((String) dataItems.get("string1"));
        int string2Offset = builder.createString((String) dataItems.get("string2"));
        int string3Offset = builder.createString((String) dataItems.get("string3"));
        int string4Offset = builder.createString((String) dataItems.get("string4"));
        int string5Offset = builder.createString((String) dataItems.get("string5"));
        int string6Offset = builder.createString((String) dataItems.get("string6"));
        int string7Offset = builder.createString((String) dataItems.get("string7"));
        int string8Offset = builder.createString((String) dataItems.get("string8"));
        int string9Offset = builder.createString((String) dataItems.get("string9"));
        int string10Offset = builder.createString((String) dataItems.get("string10"));
        int string11Offset = builder.createString((String) dataItems.get("string11"));
        int string12Offset = builder.createString((String) dataItems.get("string12"));
        int string13Offset = builder.createString((String) dataItems.get("string13"));
        int string14Offset = builder.createString((String) dataItems.get("string14"));
        int string15Offset = builder.createString((String) dataItems.get("string15"));
        int string16Offset = builder.createString((String) dataItems.get("string16"));
        int string17Offset = builder.createString((String) dataItems.get("string17"));
        int string18Offset = builder.createString((String) dataItems.get("string18"));
        int string19Offset = builder.createString((String) dataItems.get("string19"));
        int string20Offset = builder.createString((String) dataItems.get("string20"));

        Data4Flat.startData4Flat(builder);
        Data4Flat.addString1(builder, string1Offset);
        Data4Flat.addString2(builder, string2Offset);
        Data4Flat.addString3(builder, string3Offset);
        Data4Flat.addString4(builder, string4Offset);
        Data4Flat.addString5(builder, string5Offset);
        Data4Flat.addString6(builder, string6Offset);
        Data4Flat.addString7(builder, string7Offset);
        Data4Flat.addString8(builder, string8Offset);
        Data4Flat.addString9(builder, string9Offset);
        Data4Flat.addString10(builder, string10Offset);
        Data4Flat.addString11(builder, string11Offset);
        Data4Flat.addString12(builder, string12Offset);
        Data4Flat.addString13(builder, string13Offset);
        Data4Flat.addString14(builder, string14Offset);
        Data4Flat.addString15(builder, string15Offset);
        Data4Flat.addString16(builder, string16Offset);
        Data4Flat.addString17(builder, string17Offset);
        Data4Flat.addString18(builder, string18Offset);
        Data4Flat.addString19(builder, string19Offset);
        Data4Flat.addString20(builder, string20Offset);
        int data = Data4Flat.endData4Flat(builder);
        builder.finish(data);

        return builder.sizedByteArray();
    }

    @Override
    public Object deserializeObject4(byte[] bytes) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        return Data4Flat.getRootAsData4Flat(buffer);
    }


    @Override
    public Object buildObject5() {
        return null;
    }

    @Override
    public byte[] serializeObject5(Object object) throws IOException {
        Map<String, Object> dataItems = DataHelper.getItemMap5();

        builder.clear();

        int string1Offset = builder.createString((String) dataItems.get("string1"));
        int string2Offset = builder.createString((String) dataItems.get("string2"));
        int string3Offset = builder.createString((String) dataItems.get("string3"));
        int string4Offset = builder.createString((String) dataItems.get("string4"));
        int string5Offset = builder.createString((String) dataItems.get("string5"));
        int string6Offset = builder.createString((String) dataItems.get("string6"));
        int string7Offset = builder.createString((String) dataItems.get("string7"));
        int string8Offset = builder.createString((String) dataItems.get("string8"));
        int string9Offset = builder.createString((String) dataItems.get("string9"));
        int string10Offset = builder.createString((String) dataItems.get("string10"));
        int string11Offset = builder.createString((String) dataItems.get("string11"));
        int string12Offset = builder.createString((String) dataItems.get("string12"));
        int string13Offset = builder.createString((String) dataItems.get("string13"));
        int string14Offset = builder.createString((String) dataItems.get("string14"));
        int string15Offset = builder.createString((String) dataItems.get("string15"));
        int string16Offset = builder.createString((String) dataItems.get("string16"));
        int string17Offset = builder.createString((String) dataItems.get("string17"));
        int string18Offset = builder.createString((String) dataItems.get("string18"));
        int string19Offset = builder.createString((String) dataItems.get("string19"));
        int string20Offset = builder.createString((String) dataItems.get("string20"));

        Data4Flat.startData4Flat(builder);
        Data4Flat.addString1(builder, string1Offset);
        Data4Flat.addString2(builder, string2Offset);
        Data4Flat.addString3(builder, string3Offset);
        Data4Flat.addString4(builder, string4Offset);
        Data4Flat.addString5(builder, string5Offset);
        Data4Flat.addString6(builder, string6Offset);
        Data4Flat.addString7(builder, string7Offset);
        Data4Flat.addString8(builder, string8Offset);
        Data4Flat.addString9(builder, string9Offset);
        Data4Flat.addString10(builder, string10Offset);
        Data4Flat.addString11(builder, string11Offset);
        Data4Flat.addString12(builder, string12Offset);
        Data4Flat.addString13(builder, string13Offset);
        Data4Flat.addString14(builder, string14Offset);
        Data4Flat.addString15(builder, string15Offset);
        Data4Flat.addString16(builder, string16Offset);
        Data4Flat.addString17(builder, string17Offset);
        Data4Flat.addString18(builder, string18Offset);
        Data4Flat.addString19(builder, string19Offset);
        Data4Flat.addString20(builder, string20Offset);
        int data = Data4Flat.endData4Flat(builder);
        builder.finish(data);

        return builder.sizedByteArray();
    }

    @Override
    public Object deserializeObject5(byte[] bytes) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        return Data4Flat.getRootAsData4Flat(buffer);
    }


    @Override
    public Object buildObject6() {
        return null;
    }

    @Override
    public byte[] serializeObject6(Object object) throws IOException {
        Map<String, Object> dataItems = DataHelper.getItemMap6();

        builder.clear();

        int string1Offset = builder.createString((String) dataItems.get("string1"));
        int string2Offset = builder.createString((String) dataItems.get("string2"));
        int string3Offset = builder.createString((String) dataItems.get("string3"));
        int string4Offset = builder.createString((String) dataItems.get("string4"));
        int string5Offset = builder.createString((String) dataItems.get("string5"));
        int string6Offset = builder.createString((String) dataItems.get("string6"));
        int string7Offset = builder.createString((String) dataItems.get("string7"));
        int string8Offset = builder.createString((String) dataItems.get("string8"));
        int string9Offset = builder.createString((String) dataItems.get("string9"));
        int string10Offset = builder.createString((String) dataItems.get("string10"));
        int string11Offset = builder.createString((String) dataItems.get("string11"));
        int string12Offset = builder.createString((String) dataItems.get("string12"));
        int string13Offset = builder.createString((String) dataItems.get("string13"));
        int string14Offset = builder.createString((String) dataItems.get("string14"));
        int string15Offset = builder.createString((String) dataItems.get("string15"));
        int string16Offset = builder.createString((String) dataItems.get("string16"));
        int string17Offset = builder.createString((String) dataItems.get("string17"));
        int string18Offset = builder.createString((String) dataItems.get("string18"));
        int string19Offset = builder.createString((String) dataItems.get("string19"));
        int string20Offset = builder.createString((String) dataItems.get("string20"));
        int string21Offset = builder.createString((String) dataItems.get("string21"));
        int string22Offset = builder.createString((String) dataItems.get("string22"));
        int string23Offset = builder.createString((String) dataItems.get("string23"));
        int string24Offset = builder.createString((String) dataItems.get("string24"));
        int string25Offset = builder.createString((String) dataItems.get("string25"));
        int string26Offset = builder.createString((String) dataItems.get("string26"));
        int string27Offset = builder.createString((String) dataItems.get("string27"));
        int string28Offset = builder.createString((String) dataItems.get("string28"));
        int string29Offset = builder.createString((String) dataItems.get("string29"));
        int string30Offset = builder.createString((String) dataItems.get("string30"));

        Data6Flat.startData6Flat(builder);
        Data6Flat.addString1(builder, string1Offset);
        Data6Flat.addString2(builder, string2Offset);
        Data6Flat.addString3(builder, string3Offset);
        Data6Flat.addString4(builder, string4Offset);
        Data6Flat.addString5(builder, string5Offset);
        Data6Flat.addString6(builder, string6Offset);
        Data6Flat.addString7(builder, string7Offset);
        Data6Flat.addString8(builder, string8Offset);
        Data6Flat.addString9(builder, string9Offset);
        Data6Flat.addString10(builder, string10Offset);
        Data6Flat.addString11(builder, string11Offset);
        Data6Flat.addString12(builder, string12Offset);
        Data6Flat.addString13(builder, string13Offset);
        Data6Flat.addString14(builder, string14Offset);
        Data6Flat.addString15(builder, string15Offset);
        Data6Flat.addString16(builder, string16Offset);
        Data6Flat.addString17(builder, string17Offset);
        Data6Flat.addString18(builder, string18Offset);
        Data6Flat.addString19(builder, string19Offset);
        Data6Flat.addString20(builder, string20Offset);
        Data6Flat.addString21(builder, string21Offset);
        Data6Flat.addString22(builder, string22Offset);
        Data6Flat.addString23(builder, string23Offset);
        Data6Flat.addString24(builder, string24Offset);
        Data6Flat.addString25(builder, string25Offset);
        Data6Flat.addString26(builder, string26Offset);
        Data6Flat.addString27(builder, string27Offset);
        Data6Flat.addString28(builder, string28Offset);
        Data6Flat.addString29(builder, string29Offset);
        Data6Flat.addString30(builder, string30Offset);
        Data6Flat.addNumber1(builder, (Integer) dataItems.get("number1"));
        Data6Flat.addNumber2(builder, (Integer) dataItems.get("number2"));
        Data6Flat.addNumber3(builder, (Integer) dataItems.get("number3"));
        Data6Flat.addNumber4(builder, (Integer) dataItems.get("number4"));
        Data6Flat.addNumber5(builder, (Integer) dataItems.get("number5"));
        Data6Flat.addNumber6(builder, (Integer) dataItems.get("number6"));
        Data6Flat.addNumber7(builder, (Integer) dataItems.get("number7"));
        Data6Flat.addNumber8(builder, (Integer) dataItems.get("number8"));
        Data6Flat.addNumber9(builder, (Integer) dataItems.get("number9"));
        Data6Flat.addNumber10(builder, (Integer) dataItems.get("number10"));
        Data6Flat.addNumber11(builder, (Integer) dataItems.get("number11"));
        Data6Flat.addNumber12(builder, (Integer) dataItems.get("number12"));
        Data6Flat.addNumber13(builder, (Integer) dataItems.get("number13"));
        Data6Flat.addNumber14(builder, (Integer) dataItems.get("number14"));
        Data6Flat.addNumber15(builder, (Integer) dataItems.get("number15"));
        Data6Flat.addNumber16(builder, (Integer) dataItems.get("number16"));
        Data6Flat.addNumber17(builder, (Integer) dataItems.get("number17"));
        Data6Flat.addNumber18(builder, (Integer) dataItems.get("number18"));
        Data6Flat.addNumber19(builder, (Integer) dataItems.get("number19"));
        Data6Flat.addNumber20(builder, (Integer) dataItems.get("number20"));
        Data6Flat.addNumber21(builder, (Integer) dataItems.get("number21"));
        Data6Flat.addNumber22(builder, (Integer) dataItems.get("number22"));
        Data6Flat.addNumber23(builder, (Integer) dataItems.get("number23"));
        Data6Flat.addNumber24(builder, (Integer) dataItems.get("number24"));
        Data6Flat.addNumber25(builder, (Integer) dataItems.get("number25"));
        Data6Flat.addNumber26(builder, (Integer) dataItems.get("number26"));
        Data6Flat.addNumber27(builder, (Integer) dataItems.get("number27"));
        Data6Flat.addNumber28(builder, (Integer) dataItems.get("number28"));
        Data6Flat.addNumber29(builder, (Integer) dataItems.get("number29"));
        Data6Flat.addNumber30(builder, (Integer) dataItems.get("number30"));
        Data6Flat.addNumber31(builder, (Integer) dataItems.get("number31"));
        Data6Flat.addNumber32(builder, (Integer) dataItems.get("number32"));
        Data6Flat.addNumber33(builder, (Integer) dataItems.get("number33"));
        Data6Flat.addNumber34(builder, (Integer) dataItems.get("number34"));
        Data6Flat.addNumber35(builder, (Integer) dataItems.get("number35"));
        Data6Flat.addNumber36(builder, (Integer) dataItems.get("number36"));
        Data6Flat.addNumber37(builder, (Integer) dataItems.get("number37"));
        Data6Flat.addNumber38(builder, (Integer) dataItems.get("number38"));
        Data6Flat.addNumber39(builder, (Integer) dataItems.get("number39"));
        Data6Flat.addNumber40(builder, (Integer) dataItems.get("number40"));
        Data6Flat.addNumber41(builder, (Integer) dataItems.get("number41"));
        Data6Flat.addNumber42(builder, (Integer) dataItems.get("number42"));
        Data6Flat.addNumber43(builder, (Integer) dataItems.get("number43"));
        Data6Flat.addNumber44(builder, (Integer) dataItems.get("number44"));
        Data6Flat.addNumber45(builder, (Integer) dataItems.get("number45"));
        Data6Flat.addNumber46(builder, (Integer) dataItems.get("number46"));
        Data6Flat.addNumber47(builder, (Integer) dataItems.get("number47"));
        Data6Flat.addNumber48(builder, (Integer) dataItems.get("number48"));
        Data6Flat.addNumber49(builder, (Integer) dataItems.get("number49"));
        Data6Flat.addNumber50(builder, (Integer) dataItems.get("number50"));
        Data6Flat.addNumber51(builder, (Integer) dataItems.get("number51"));
        Data6Flat.addNumber52(builder, (Integer) dataItems.get("number52"));
        Data6Flat.addNumber53(builder, (Integer) dataItems.get("number53"));
        Data6Flat.addNumber54(builder, (Integer) dataItems.get("number54"));
        Data6Flat.addNumber55(builder, (Integer) dataItems.get("number55"));
        Data6Flat.addNumber56(builder, (Integer) dataItems.get("number56"));
        Data6Flat.addNumber57(builder, (Integer) dataItems.get("number57"));
        Data6Flat.addNumber58(builder, (Integer) dataItems.get("number58"));
        Data6Flat.addNumber59(builder, (Integer) dataItems.get("number59"));
        Data6Flat.addNumber60(builder, (Integer) dataItems.get("number60"));
        Data6Flat.addNumber61(builder, (Integer) dataItems.get("number61"));
        Data6Flat.addNumber62(builder, (Integer) dataItems.get("number62"));
        Data6Flat.addNumber63(builder, (Integer) dataItems.get("number63"));
        Data6Flat.addNumber64(builder, (Integer) dataItems.get("number64"));
        Data6Flat.addNumber65(builder, (Integer) dataItems.get("number65"));
        Data6Flat.addNumber66(builder, (Integer) dataItems.get("number66"));
        Data6Flat.addNumber67(builder, (Integer) dataItems.get("number67"));
        Data6Flat.addNumber68(builder, (Integer) dataItems.get("number68"));
        Data6Flat.addNumber69(builder, (Integer) dataItems.get("number69"));
        Data6Flat.addNumber70(builder, (Integer) dataItems.get("number70"));
        Data6Flat.addNumber71(builder, (Integer) dataItems.get("number71"));
        Data6Flat.addNumber72(builder, (Integer) dataItems.get("number72"));
        Data6Flat.addNumber73(builder, (Integer) dataItems.get("number73"));
        Data6Flat.addNumber74(builder, (Integer) dataItems.get("number74"));
        Data6Flat.addNumber75(builder, (Integer) dataItems.get("number75"));
        Data6Flat.addNumber76(builder, (Integer) dataItems.get("number76"));
        Data6Flat.addNumber77(builder, (Integer) dataItems.get("number77"));
        Data6Flat.addNumber78(builder, (Integer) dataItems.get("number78"));
        Data6Flat.addNumber79(builder, (Integer) dataItems.get("number79"));
        Data6Flat.addNumber80(builder, (Integer) dataItems.get("number80"));
        Data6Flat.addNumber81(builder, (Integer) dataItems.get("number81"));
        Data6Flat.addNumber82(builder, (Integer) dataItems.get("number82"));
        Data6Flat.addNumber83(builder, (Integer) dataItems.get("number83"));
        Data6Flat.addNumber84(builder, (Integer) dataItems.get("number84"));
        Data6Flat.addNumber85(builder, (Integer) dataItems.get("number85"));
        Data6Flat.addNumber86(builder, (Integer) dataItems.get("number86"));
        Data6Flat.addNumber87(builder, (Integer) dataItems.get("number87"));
        Data6Flat.addNumber88(builder, (Integer) dataItems.get("number88"));
        Data6Flat.addNumber89(builder, (Integer) dataItems.get("number89"));
        Data6Flat.addNumber90(builder, (Integer) dataItems.get("number90"));
        Data6Flat.addNumber91(builder, (Integer) dataItems.get("number91"));
        Data6Flat.addNumber92(builder, (Integer) dataItems.get("number92"));
        Data6Flat.addNumber93(builder, (Integer) dataItems.get("number93"));
        Data6Flat.addNumber94(builder, (Integer) dataItems.get("number94"));
        Data6Flat.addNumber95(builder, (Integer) dataItems.get("number95"));
        Data6Flat.addNumber96(builder, (Integer) dataItems.get("number96"));
        Data6Flat.addNumber97(builder, (Integer) dataItems.get("number97"));
        Data6Flat.addNumber98(builder, (Integer) dataItems.get("number98"));
        Data6Flat.addNumber99(builder, (Integer) dataItems.get("number99"));
        Data6Flat.addNumber100(builder, (Integer) dataItems.get("number100"));
        Data6Flat.addNumber101(builder, (Integer) dataItems.get("number101"));
        Data6Flat.addNumber102(builder, (Integer) dataItems.get("number102"));
        Data6Flat.addNumber103(builder, (Integer) dataItems.get("number103"));
        Data6Flat.addNumber104(builder, (Integer) dataItems.get("number104"));
        Data6Flat.addNumber105(builder, (Integer) dataItems.get("number105"));
        Data6Flat.addNumber106(builder, (Integer) dataItems.get("number106"));
        Data6Flat.addNumber107(builder, (Integer) dataItems.get("number107"));
        Data6Flat.addNumber108(builder, (Integer) dataItems.get("number108"));
        Data6Flat.addNumber109(builder, (Integer) dataItems.get("number109"));
        Data6Flat.addNumber110(builder, (Integer) dataItems.get("number110"));
        Data6Flat.addNumber111(builder, (Integer) dataItems.get("number111"));
        Data6Flat.addNumber112(builder, (Integer) dataItems.get("number112"));
        Data6Flat.addNumber113(builder, (Integer) dataItems.get("number113"));
        Data6Flat.addNumber114(builder, (Integer) dataItems.get("number114"));
        Data6Flat.addNumber115(builder, (Integer) dataItems.get("number115"));
        Data6Flat.addNumber116(builder, (Integer) dataItems.get("number116"));
        Data6Flat.addNumber117(builder, (Integer) dataItems.get("number117"));
        Data6Flat.addNumber118(builder, (Integer) dataItems.get("number118"));
        Data6Flat.addNumber119(builder, (Integer) dataItems.get("number119"));
        Data6Flat.addNumber120(builder, (Integer) dataItems.get("number120"));
        Data6Flat.addNumber121(builder, (Double) dataItems.get("number121"));
        Data6Flat.addNumber122(builder, (Double) dataItems.get("number122"));
        Data6Flat.addNumber123(builder, (Double) dataItems.get("number123"));
        Data6Flat.addNumber124(builder, (Double) dataItems.get("number124"));
        Data6Flat.addNumber125(builder, (Double) dataItems.get("number125"));
        Data6Flat.addNumber126(builder, (Double) dataItems.get("number126"));
        Data6Flat.addNumber127(builder, (Double) dataItems.get("number127"));
        Data6Flat.addNumber128(builder, (Double) dataItems.get("number128"));
        Data6Flat.addNumber129(builder, (Double) dataItems.get("number129"));
        Data6Flat.addNumber130(builder, (Double) dataItems.get("number130"));
        Data6Flat.addNumber131(builder, (Double) dataItems.get("number131"));
        Data6Flat.addNumber132(builder, (Double) dataItems.get("number132"));
        Data6Flat.addNumber133(builder, (Double) dataItems.get("number133"));
        Data6Flat.addNumber134(builder, (Double) dataItems.get("number134"));
        Data6Flat.addNumber135(builder, (Double) dataItems.get("number135"));
        Data6Flat.addNumber136(builder, (Double) dataItems.get("number136"));
        Data6Flat.addNumber137(builder, (Double) dataItems.get("number137"));
        Data6Flat.addNumber138(builder, (Double) dataItems.get("number138"));
        Data6Flat.addNumber139(builder, (Double) dataItems.get("number139"));
        Data6Flat.addNumber140(builder, (Double) dataItems.get("number140"));
        Data6Flat.addNumber141(builder, (Double) dataItems.get("number141"));
        Data6Flat.addNumber142(builder, (Double) dataItems.get("number142"));
        Data6Flat.addNumber143(builder, (Double) dataItems.get("number143"));
        Data6Flat.addNumber144(builder, (Double) dataItems.get("number144"));
        Data6Flat.addNumber145(builder, (Double) dataItems.get("number145"));
        Data6Flat.addNumber146(builder, (Double) dataItems.get("number146"));
        Data6Flat.addNumber147(builder, (Double) dataItems.get("number147"));
        Data6Flat.addNumber148(builder, (Double) dataItems.get("number148"));
        Data6Flat.addNumber149(builder, (Double) dataItems.get("number149"));
        Data6Flat.addNumber150(builder, (Double) dataItems.get("number150"));
        Data6Flat.addNumber151(builder, (Double) dataItems.get("number151"));
        Data6Flat.addNumber152(builder, (Double) dataItems.get("number152"));
        Data6Flat.addNumber153(builder, (Double) dataItems.get("number153"));
        Data6Flat.addNumber154(builder, (Double) dataItems.get("number154"));
        Data6Flat.addNumber155(builder, (Double) dataItems.get("number155"));
        Data6Flat.addNumber156(builder, (Double) dataItems.get("number156"));
        Data6Flat.addNumber157(builder, (Double) dataItems.get("number157"));
        Data6Flat.addNumber158(builder, (Double) dataItems.get("number158"));
        Data6Flat.addNumber159(builder, (Double) dataItems.get("number159"));
        Data6Flat.addNumber160(builder, (Double) dataItems.get("number160"));
        Data6Flat.addNumber161(builder, (Double) dataItems.get("number161"));
        Data6Flat.addNumber162(builder, (Double) dataItems.get("number162"));
        Data6Flat.addNumber163(builder, (Double) dataItems.get("number163"));
        Data6Flat.addNumber164(builder, (Double) dataItems.get("number164"));
        Data6Flat.addNumber165(builder, (Double) dataItems.get("number165"));
        Data6Flat.addNumber166(builder, (Double) dataItems.get("number166"));
        Data6Flat.addNumber167(builder, (Double) dataItems.get("number167"));
        Data6Flat.addNumber168(builder, (Double) dataItems.get("number168"));
        Data6Flat.addNumber169(builder, (Double) dataItems.get("number169"));
        Data6Flat.addNumber170(builder, (Double) dataItems.get("number170"));
        int data = Data6Flat.endData6Flat(builder);
        builder.finish(data);

        return builder.sizedByteArray();
    }

    @Override
    public Object deserializeObject6(byte[] bytes) throws IOException {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        return Data6Flat.getRootAsData6Flat(buffer);
    }

    public static void main(String[] args) throws Exception {
        int i = Integer.parseInt(args[0]);
        DataHelper.initAll();

        new FlatBuffersMeasurement().measure(i);
    }
}
