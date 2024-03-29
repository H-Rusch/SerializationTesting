/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package generated.data1.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Data1Avro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2312575359069561362L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Data1Avro\",\"namespace\":\"generated.data1.avro\",\"fields\":[{\"name\":\"string1\",\"type\":\"string\"},{\"name\":\"string2\",\"type\":\"string\"},{\"name\":\"number1\",\"type\":\"int\"},{\"name\":\"number2\",\"type\":\"int\"},{\"name\":\"number3\",\"type\":\"int\"},{\"name\":\"number4\",\"type\":\"int\"},{\"name\":\"number5\",\"type\":\"double\"},{\"name\":\"number6\",\"type\":\"double\"},{\"name\":\"number7\",\"type\":\"double\"},{\"name\":\"number8\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Data1Avro> ENCODER =
      new BinaryMessageEncoder<Data1Avro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Data1Avro> DECODER =
      new BinaryMessageDecoder<Data1Avro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Data1Avro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Data1Avro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Data1Avro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Data1Avro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Data1Avro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Data1Avro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Data1Avro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Data1Avro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence string1;
  private java.lang.CharSequence string2;
  private int number1;
  private int number2;
  private int number3;
  private int number4;
  private double number5;
  private double number6;
  private double number7;
  private double number8;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Data1Avro() {}

  /**
   * All-args constructor.
   * @param string1 The new value for string1
   * @param string2 The new value for string2
   * @param number1 The new value for number1
   * @param number2 The new value for number2
   * @param number3 The new value for number3
   * @param number4 The new value for number4
   * @param number5 The new value for number5
   * @param number6 The new value for number6
   * @param number7 The new value for number7
   * @param number8 The new value for number8
   */
  public Data1Avro(java.lang.CharSequence string1, java.lang.CharSequence string2, java.lang.Integer number1, java.lang.Integer number2, java.lang.Integer number3, java.lang.Integer number4, java.lang.Double number5, java.lang.Double number6, java.lang.Double number7, java.lang.Double number8) {
    this.string1 = string1;
    this.string2 = string2;
    this.number1 = number1;
    this.number2 = number2;
    this.number3 = number3;
    this.number4 = number4;
    this.number5 = number5;
    this.number6 = number6;
    this.number7 = number7;
    this.number8 = number8;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return string1;
    case 1: return string2;
    case 2: return number1;
    case 3: return number2;
    case 4: return number3;
    case 5: return number4;
    case 6: return number5;
    case 7: return number6;
    case 8: return number7;
    case 9: return number8;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: string1 = (java.lang.CharSequence)value$; break;
    case 1: string2 = (java.lang.CharSequence)value$; break;
    case 2: number1 = (java.lang.Integer)value$; break;
    case 3: number2 = (java.lang.Integer)value$; break;
    case 4: number3 = (java.lang.Integer)value$; break;
    case 5: number4 = (java.lang.Integer)value$; break;
    case 6: number5 = (java.lang.Double)value$; break;
    case 7: number6 = (java.lang.Double)value$; break;
    case 8: number7 = (java.lang.Double)value$; break;
    case 9: number8 = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'string1' field.
   * @return The value of the 'string1' field.
   */
  public java.lang.CharSequence getString1() {
    return string1;
  }


  /**
   * Sets the value of the 'string1' field.
   * @param value the value to set.
   */
  public void setString1(java.lang.CharSequence value) {
    this.string1 = value;
  }

  /**
   * Gets the value of the 'string2' field.
   * @return The value of the 'string2' field.
   */
  public java.lang.CharSequence getString2() {
    return string2;
  }


  /**
   * Sets the value of the 'string2' field.
   * @param value the value to set.
   */
  public void setString2(java.lang.CharSequence value) {
    this.string2 = value;
  }

  /**
   * Gets the value of the 'number1' field.
   * @return The value of the 'number1' field.
   */
  public int getNumber1() {
    return number1;
  }


  /**
   * Sets the value of the 'number1' field.
   * @param value the value to set.
   */
  public void setNumber1(int value) {
    this.number1 = value;
  }

  /**
   * Gets the value of the 'number2' field.
   * @return The value of the 'number2' field.
   */
  public int getNumber2() {
    return number2;
  }


  /**
   * Sets the value of the 'number2' field.
   * @param value the value to set.
   */
  public void setNumber2(int value) {
    this.number2 = value;
  }

  /**
   * Gets the value of the 'number3' field.
   * @return The value of the 'number3' field.
   */
  public int getNumber3() {
    return number3;
  }


  /**
   * Sets the value of the 'number3' field.
   * @param value the value to set.
   */
  public void setNumber3(int value) {
    this.number3 = value;
  }

  /**
   * Gets the value of the 'number4' field.
   * @return The value of the 'number4' field.
   */
  public int getNumber4() {
    return number4;
  }


  /**
   * Sets the value of the 'number4' field.
   * @param value the value to set.
   */
  public void setNumber4(int value) {
    this.number4 = value;
  }

  /**
   * Gets the value of the 'number5' field.
   * @return The value of the 'number5' field.
   */
  public double getNumber5() {
    return number5;
  }


  /**
   * Sets the value of the 'number5' field.
   * @param value the value to set.
   */
  public void setNumber5(double value) {
    this.number5 = value;
  }

  /**
   * Gets the value of the 'number6' field.
   * @return The value of the 'number6' field.
   */
  public double getNumber6() {
    return number6;
  }


  /**
   * Sets the value of the 'number6' field.
   * @param value the value to set.
   */
  public void setNumber6(double value) {
    this.number6 = value;
  }

  /**
   * Gets the value of the 'number7' field.
   * @return The value of the 'number7' field.
   */
  public double getNumber7() {
    return number7;
  }


  /**
   * Sets the value of the 'number7' field.
   * @param value the value to set.
   */
  public void setNumber7(double value) {
    this.number7 = value;
  }

  /**
   * Gets the value of the 'number8' field.
   * @return The value of the 'number8' field.
   */
  public double getNumber8() {
    return number8;
  }


  /**
   * Sets the value of the 'number8' field.
   * @param value the value to set.
   */
  public void setNumber8(double value) {
    this.number8 = value;
  }

  /**
   * Creates a new Data1Avro RecordBuilder.
   * @return A new Data1Avro RecordBuilder
   */
  public static generated.data1.avro.Data1Avro.Builder newBuilder() {
    return new generated.data1.avro.Data1Avro.Builder();
  }

  /**
   * Creates a new Data1Avro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Data1Avro RecordBuilder
   */
  public static generated.data1.avro.Data1Avro.Builder newBuilder(generated.data1.avro.Data1Avro.Builder other) {
    if (other == null) {
      return new generated.data1.avro.Data1Avro.Builder();
    } else {
      return new generated.data1.avro.Data1Avro.Builder(other);
    }
  }

  /**
   * Creates a new Data1Avro RecordBuilder by copying an existing Data1Avro instance.
   * @param other The existing instance to copy.
   * @return A new Data1Avro RecordBuilder
   */
  public static generated.data1.avro.Data1Avro.Builder newBuilder(generated.data1.avro.Data1Avro other) {
    if (other == null) {
      return new generated.data1.avro.Data1Avro.Builder();
    } else {
      return new generated.data1.avro.Data1Avro.Builder(other);
    }
  }

  /**
   * RecordBuilder for Data1Avro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Data1Avro>
    implements org.apache.avro.data.RecordBuilder<Data1Avro> {

    private java.lang.CharSequence string1;
    private java.lang.CharSequence string2;
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private double number5;
    private double number6;
    private double number7;
    private double number8;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(generated.data1.avro.Data1Avro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.string1)) {
        this.string1 = data().deepCopy(fields()[0].schema(), other.string1);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.string2)) {
        this.string2 = data().deepCopy(fields()[1].schema(), other.string2);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.number1)) {
        this.number1 = data().deepCopy(fields()[2].schema(), other.number1);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.number2)) {
        this.number2 = data().deepCopy(fields()[3].schema(), other.number2);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.number3)) {
        this.number3 = data().deepCopy(fields()[4].schema(), other.number3);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.number4)) {
        this.number4 = data().deepCopy(fields()[5].schema(), other.number4);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.number5)) {
        this.number5 = data().deepCopy(fields()[6].schema(), other.number5);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.number6)) {
        this.number6 = data().deepCopy(fields()[7].schema(), other.number6);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.number7)) {
        this.number7 = data().deepCopy(fields()[8].schema(), other.number7);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.number8)) {
        this.number8 = data().deepCopy(fields()[9].schema(), other.number8);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
    }

    /**
     * Creates a Builder by copying an existing Data1Avro instance
     * @param other The existing instance to copy.
     */
    private Builder(generated.data1.avro.Data1Avro other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.string1)) {
        this.string1 = data().deepCopy(fields()[0].schema(), other.string1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.string2)) {
        this.string2 = data().deepCopy(fields()[1].schema(), other.string2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.number1)) {
        this.number1 = data().deepCopy(fields()[2].schema(), other.number1);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.number2)) {
        this.number2 = data().deepCopy(fields()[3].schema(), other.number2);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.number3)) {
        this.number3 = data().deepCopy(fields()[4].schema(), other.number3);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.number4)) {
        this.number4 = data().deepCopy(fields()[5].schema(), other.number4);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.number5)) {
        this.number5 = data().deepCopy(fields()[6].schema(), other.number5);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.number6)) {
        this.number6 = data().deepCopy(fields()[7].schema(), other.number6);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.number7)) {
        this.number7 = data().deepCopy(fields()[8].schema(), other.number7);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.number8)) {
        this.number8 = data().deepCopy(fields()[9].schema(), other.number8);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'string1' field.
      * @return The value.
      */
    public java.lang.CharSequence getString1() {
      return string1;
    }


    /**
      * Sets the value of the 'string1' field.
      * @param value The value of 'string1'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setString1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.string1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'string1' field has been set.
      * @return True if the 'string1' field has been set, false otherwise.
      */
    public boolean hasString1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'string1' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearString1() {
      string1 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'string2' field.
      * @return The value.
      */
    public java.lang.CharSequence getString2() {
      return string2;
    }


    /**
      * Sets the value of the 'string2' field.
      * @param value The value of 'string2'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setString2(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.string2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'string2' field has been set.
      * @return True if the 'string2' field has been set, false otherwise.
      */
    public boolean hasString2() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'string2' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearString2() {
      string2 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'number1' field.
      * @return The value.
      */
    public int getNumber1() {
      return number1;
    }


    /**
      * Sets the value of the 'number1' field.
      * @param value The value of 'number1'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setNumber1(int value) {
      validate(fields()[2], value);
      this.number1 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'number1' field has been set.
      * @return True if the 'number1' field has been set, false otherwise.
      */
    public boolean hasNumber1() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'number1' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearNumber1() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'number2' field.
      * @return The value.
      */
    public int getNumber2() {
      return number2;
    }


    /**
      * Sets the value of the 'number2' field.
      * @param value The value of 'number2'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setNumber2(int value) {
      validate(fields()[3], value);
      this.number2 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'number2' field has been set.
      * @return True if the 'number2' field has been set, false otherwise.
      */
    public boolean hasNumber2() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'number2' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearNumber2() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'number3' field.
      * @return The value.
      */
    public int getNumber3() {
      return number3;
    }


    /**
      * Sets the value of the 'number3' field.
      * @param value The value of 'number3'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setNumber3(int value) {
      validate(fields()[4], value);
      this.number3 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'number3' field has been set.
      * @return True if the 'number3' field has been set, false otherwise.
      */
    public boolean hasNumber3() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'number3' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearNumber3() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'number4' field.
      * @return The value.
      */
    public int getNumber4() {
      return number4;
    }


    /**
      * Sets the value of the 'number4' field.
      * @param value The value of 'number4'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setNumber4(int value) {
      validate(fields()[5], value);
      this.number4 = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'number4' field has been set.
      * @return True if the 'number4' field has been set, false otherwise.
      */
    public boolean hasNumber4() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'number4' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearNumber4() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'number5' field.
      * @return The value.
      */
    public double getNumber5() {
      return number5;
    }


    /**
      * Sets the value of the 'number5' field.
      * @param value The value of 'number5'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setNumber5(double value) {
      validate(fields()[6], value);
      this.number5 = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'number5' field has been set.
      * @return True if the 'number5' field has been set, false otherwise.
      */
    public boolean hasNumber5() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'number5' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearNumber5() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'number6' field.
      * @return The value.
      */
    public double getNumber6() {
      return number6;
    }


    /**
      * Sets the value of the 'number6' field.
      * @param value The value of 'number6'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setNumber6(double value) {
      validate(fields()[7], value);
      this.number6 = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'number6' field has been set.
      * @return True if the 'number6' field has been set, false otherwise.
      */
    public boolean hasNumber6() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'number6' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearNumber6() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'number7' field.
      * @return The value.
      */
    public double getNumber7() {
      return number7;
    }


    /**
      * Sets the value of the 'number7' field.
      * @param value The value of 'number7'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setNumber7(double value) {
      validate(fields()[8], value);
      this.number7 = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'number7' field has been set.
      * @return True if the 'number7' field has been set, false otherwise.
      */
    public boolean hasNumber7() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'number7' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearNumber7() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'number8' field.
      * @return The value.
      */
    public double getNumber8() {
      return number8;
    }


    /**
      * Sets the value of the 'number8' field.
      * @param value The value of 'number8'.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder setNumber8(double value) {
      validate(fields()[9], value);
      this.number8 = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'number8' field has been set.
      * @return True if the 'number8' field has been set, false otherwise.
      */
    public boolean hasNumber8() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'number8' field.
      * @return This builder.
      */
    public generated.data1.avro.Data1Avro.Builder clearNumber8() {
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Data1Avro build() {
      try {
        Data1Avro record = new Data1Avro();
        record.string1 = fieldSetFlags()[0] ? this.string1 : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.string2 = fieldSetFlags()[1] ? this.string2 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.number1 = fieldSetFlags()[2] ? this.number1 : (java.lang.Integer) defaultValue(fields()[2]);
        record.number2 = fieldSetFlags()[3] ? this.number2 : (java.lang.Integer) defaultValue(fields()[3]);
        record.number3 = fieldSetFlags()[4] ? this.number3 : (java.lang.Integer) defaultValue(fields()[4]);
        record.number4 = fieldSetFlags()[5] ? this.number4 : (java.lang.Integer) defaultValue(fields()[5]);
        record.number5 = fieldSetFlags()[6] ? this.number5 : (java.lang.Double) defaultValue(fields()[6]);
        record.number6 = fieldSetFlags()[7] ? this.number6 : (java.lang.Double) defaultValue(fields()[7]);
        record.number7 = fieldSetFlags()[8] ? this.number7 : (java.lang.Double) defaultValue(fields()[8]);
        record.number8 = fieldSetFlags()[9] ? this.number8 : (java.lang.Double) defaultValue(fields()[9]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Data1Avro>
    WRITER$ = (org.apache.avro.io.DatumWriter<Data1Avro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Data1Avro>
    READER$ = (org.apache.avro.io.DatumReader<Data1Avro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.string1);

    out.writeString(this.string2);

    out.writeInt(this.number1);

    out.writeInt(this.number2);

    out.writeInt(this.number3);

    out.writeInt(this.number4);

    out.writeDouble(this.number5);

    out.writeDouble(this.number6);

    out.writeDouble(this.number7);

    out.writeDouble(this.number8);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.string1 = in.readString(this.string1 instanceof Utf8 ? (Utf8)this.string1 : null);

      this.string2 = in.readString(this.string2 instanceof Utf8 ? (Utf8)this.string2 : null);

      this.number1 = in.readInt();

      this.number2 = in.readInt();

      this.number3 = in.readInt();

      this.number4 = in.readInt();

      this.number5 = in.readDouble();

      this.number6 = in.readDouble();

      this.number7 = in.readDouble();

      this.number8 = in.readDouble();

    } else {
      for (int i = 0; i < 10; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.string1 = in.readString(this.string1 instanceof Utf8 ? (Utf8)this.string1 : null);
          break;

        case 1:
          this.string2 = in.readString(this.string2 instanceof Utf8 ? (Utf8)this.string2 : null);
          break;

        case 2:
          this.number1 = in.readInt();
          break;

        case 3:
          this.number2 = in.readInt();
          break;

        case 4:
          this.number3 = in.readInt();
          break;

        case 5:
          this.number4 = in.readInt();
          break;

        case 6:
          this.number5 = in.readDouble();
          break;

        case 7:
          this.number6 = in.readDouble();
          break;

        case 8:
          this.number7 = in.readDouble();
          break;

        case 9:
          this.number8 = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










