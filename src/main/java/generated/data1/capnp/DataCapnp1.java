// Generated by Cap'n Proto compiler, DO NOT EDIT
// source: data1.capnp

package generated.data1.capnp;

public final class DataCapnp1 {
  public static class Data {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)6,(short)2);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return Data.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final boolean hasString1() {
        return !_pointerFieldIsNull(0);
      }
      public final org.capnproto.Text.Builder getString1() {
        return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
      }
      public final void setString1(org.capnproto.Text.Reader value) {
        _setPointerField(org.capnproto.Text.factory, 0, value);
      }
      public final void setString1(String value) {
        _setPointerField(org.capnproto.Text.factory, 0, new org.capnproto.Text.Reader(value));
      }
      public final org.capnproto.Text.Builder initString1(int size) {
        return _initPointerField(org.capnproto.Text.factory, 0, size);
      }
      public final boolean hasString2() {
        return !_pointerFieldIsNull(1);
      }
      public final org.capnproto.Text.Builder getString2() {
        return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
      }
      public final void setString2(org.capnproto.Text.Reader value) {
        _setPointerField(org.capnproto.Text.factory, 1, value);
      }
      public final void setString2(String value) {
        _setPointerField(org.capnproto.Text.factory, 1, new org.capnproto.Text.Reader(value));
      }
      public final org.capnproto.Text.Builder initString2(int size) {
        return _initPointerField(org.capnproto.Text.factory, 1, size);
      }
      public final int getNumber1() {
        return _getIntField(0);
      }
      public final void setNumber1(int value) {
        _setIntField(0, value);
      }

      public final int getNumber2() {
        return _getIntField(1);
      }
      public final void setNumber2(int value) {
        _setIntField(1, value);
      }

      public final int getNumber3() {
        return _getIntField(2);
      }
      public final void setNumber3(int value) {
        _setIntField(2, value);
      }

      public final int getNumber4() {
        return _getIntField(3);
      }
      public final void setNumber4(int value) {
        _setIntField(3, value);
      }

      public final double getNumber5() {
        return _getDoubleField(2);
      }
      public final void setNumber5(double value) {
        _setDoubleField(2, value);
      }

      public final double getNumber6() {
        return _getDoubleField(3);
      }
      public final void setNumber6(double value) {
        _setDoubleField(3, value);
      }

      public final double getNumber7() {
        return _getDoubleField(4);
      }
      public final void setNumber7(double value) {
        _setDoubleField(4, value);
      }

      public final double getNumber8() {
        return _getDoubleField(5);
      }
      public final void setNumber8(double value) {
        _setDoubleField(5, value);
      }

    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public boolean hasString1() {
        return !_pointerFieldIsNull(0);
      }
      public org.capnproto.Text.Reader getString1() {
        return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
      }

      public boolean hasString2() {
        return !_pointerFieldIsNull(1);
      }
      public org.capnproto.Text.Reader getString2() {
        return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
      }

      public final int getNumber1() {
        return _getIntField(0);
      }

      public final int getNumber2() {
        return _getIntField(1);
      }

      public final int getNumber3() {
        return _getIntField(2);
      }

      public final int getNumber4() {
        return _getIntField(3);
      }

      public final double getNumber5() {
        return _getDoubleField(2);
      }

      public final double getNumber6() {
        return _getDoubleField(3);
      }

      public final double getNumber7() {
        return _getDoubleField(4);
      }

      public final double getNumber8() {
        return _getDoubleField(5);
      }

    }

  }



public static final class Schemas {
public static final org.capnproto.SegmentReader b_d61c84ec5934a86e =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u006e\u00a8\u0034\u0059\u00ec\u0084\u001c\u00d6" +
   "\u000c\u0000\u0000\u0000\u0001\u0000\u0006\u0000" +
   "\u0046\u00ae\u00c6\u0091\u008b\u00a3\u002d\u008b" +
   "\u0002\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u008a\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0019\u0000\u0000\u0000\u0037\u0002\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0064\u0061\u0074\u0061\u0031\u002e\u0063\u0061" +
   "\u0070\u006e\u0070\u003a\u0044\u0061\u0074\u0061" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0028\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0009\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0004\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0010\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\r\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0014\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0011\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0018\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0010\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u001c\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0019\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0014\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0020\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0005\u0000\u0000\u0000\u0003\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0005\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001d\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0018\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0024\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0006\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0006\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0021\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u001c\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0028\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0007\u0000\u0000\u0000\u0003\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0025\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0020\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u002c\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0008\u0000\u0000\u0000\u0004\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0008\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0029\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0024\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0030\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0009\u0000\u0000\u0000\u0005\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0009\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u002d\u0001\u0000\u0000\u0042\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0028\u0001\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0034\u0001\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0073\u0074\u0072\u0069\u006e\u0067\u0031\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0073\u0074\u0072\u0069\u006e\u0067\u0032\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0031\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0032\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0033\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0034\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0035\u0000" +
   "\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0036\u0000" +
   "\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0037\u0000" +
   "\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u006e\u0075\u006d\u0062\u0065\u0072\u0038\u0000" +
   "\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000b\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
}
}

