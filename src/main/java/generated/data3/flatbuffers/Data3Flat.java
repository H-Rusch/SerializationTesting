// automatically generated by the FlatBuffers compiler, do not modify

package generated.data3.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Data3Flat extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static Data3Flat getRootAsData3Flat(ByteBuffer _bb) { return getRootAsData3Flat(_bb, new Data3Flat()); }
  public static Data3Flat getRootAsData3Flat(ByteBuffer _bb, Data3Flat obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Data3Flat __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int number1() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number2() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number3() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number4() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number5() { int o = __offset(12); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number6() { int o = __offset(14); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number7() { int o = __offset(16); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number8() { int o = __offset(18); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number9() { int o = __offset(20); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int number10() { int o = __offset(22); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public double number11() { int o = __offset(24); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number12() { int o = __offset(26); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number13() { int o = __offset(28); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number14() { int o = __offset(30); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number15() { int o = __offset(32); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number16() { int o = __offset(34); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number17() { int o = __offset(36); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number18() { int o = __offset(38); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number19() { int o = __offset(40); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public double number20() { int o = __offset(42); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }

  public static int createData3Flat(FlatBufferBuilder builder,
      int number1,
      int number2,
      int number3,
      int number4,
      int number5,
      int number6,
      int number7,
      int number8,
      int number9,
      int number10,
      double number11,
      double number12,
      double number13,
      double number14,
      double number15,
      double number16,
      double number17,
      double number18,
      double number19,
      double number20) {
    builder.startTable(20);
    Data3Flat.addNumber20(builder, number20);
    Data3Flat.addNumber19(builder, number19);
    Data3Flat.addNumber18(builder, number18);
    Data3Flat.addNumber17(builder, number17);
    Data3Flat.addNumber16(builder, number16);
    Data3Flat.addNumber15(builder, number15);
    Data3Flat.addNumber14(builder, number14);
    Data3Flat.addNumber13(builder, number13);
    Data3Flat.addNumber12(builder, number12);
    Data3Flat.addNumber11(builder, number11);
    Data3Flat.addNumber10(builder, number10);
    Data3Flat.addNumber9(builder, number9);
    Data3Flat.addNumber8(builder, number8);
    Data3Flat.addNumber7(builder, number7);
    Data3Flat.addNumber6(builder, number6);
    Data3Flat.addNumber5(builder, number5);
    Data3Flat.addNumber4(builder, number4);
    Data3Flat.addNumber3(builder, number3);
    Data3Flat.addNumber2(builder, number2);
    Data3Flat.addNumber1(builder, number1);
    return Data3Flat.endData3Flat(builder);
  }

  public static void startData3Flat(FlatBufferBuilder builder) { builder.startTable(20); }
  public static void addNumber1(FlatBufferBuilder builder, int number1) { builder.addInt(0, number1, 0); }
  public static void addNumber2(FlatBufferBuilder builder, int number2) { builder.addInt(1, number2, 0); }
  public static void addNumber3(FlatBufferBuilder builder, int number3) { builder.addInt(2, number3, 0); }
  public static void addNumber4(FlatBufferBuilder builder, int number4) { builder.addInt(3, number4, 0); }
  public static void addNumber5(FlatBufferBuilder builder, int number5) { builder.addInt(4, number5, 0); }
  public static void addNumber6(FlatBufferBuilder builder, int number6) { builder.addInt(5, number6, 0); }
  public static void addNumber7(FlatBufferBuilder builder, int number7) { builder.addInt(6, number7, 0); }
  public static void addNumber8(FlatBufferBuilder builder, int number8) { builder.addInt(7, number8, 0); }
  public static void addNumber9(FlatBufferBuilder builder, int number9) { builder.addInt(8, number9, 0); }
  public static void addNumber10(FlatBufferBuilder builder, int number10) { builder.addInt(9, number10, 0); }
  public static void addNumber11(FlatBufferBuilder builder, double number11) { builder.addDouble(10, number11, 0.0); }
  public static void addNumber12(FlatBufferBuilder builder, double number12) { builder.addDouble(11, number12, 0.0); }
  public static void addNumber13(FlatBufferBuilder builder, double number13) { builder.addDouble(12, number13, 0.0); }
  public static void addNumber14(FlatBufferBuilder builder, double number14) { builder.addDouble(13, number14, 0.0); }
  public static void addNumber15(FlatBufferBuilder builder, double number15) { builder.addDouble(14, number15, 0.0); }
  public static void addNumber16(FlatBufferBuilder builder, double number16) { builder.addDouble(15, number16, 0.0); }
  public static void addNumber17(FlatBufferBuilder builder, double number17) { builder.addDouble(16, number17, 0.0); }
  public static void addNumber18(FlatBufferBuilder builder, double number18) { builder.addDouble(17, number18, 0.0); }
  public static void addNumber19(FlatBufferBuilder builder, double number19) { builder.addDouble(18, number19, 0.0); }
  public static void addNumber20(FlatBufferBuilder builder, double number20) { builder.addDouble(19, number20, 0.0); }
  public static int endData3Flat(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Data3Flat get(int j) { return get(new Data3Flat(), j); }
    public Data3Flat get(Data3Flat obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

