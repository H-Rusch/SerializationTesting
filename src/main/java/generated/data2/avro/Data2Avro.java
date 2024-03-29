/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package generated.data2.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Data2Avro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4622553222079108593L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Data2Avro\",\"namespace\":\"generated.data2.avro\",\"fields\":[{\"name\":\"number1\",\"type\":\"double\"},{\"name\":\"number2\",\"type\":\"double\"},{\"name\":\"string1\",\"type\":\"string\"},{\"name\":\"string2\",\"type\":\"string\"},{\"name\":\"string3\",\"type\":\"string\"},{\"name\":\"string4\",\"type\":\"string\"},{\"name\":\"string5\",\"type\":\"string\"},{\"name\":\"string6\",\"type\":\"string\"},{\"name\":\"string7\",\"type\":\"string\"},{\"name\":\"string8\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Data2Avro> ENCODER =
      new BinaryMessageEncoder<Data2Avro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Data2Avro> DECODER =
      new BinaryMessageDecoder<Data2Avro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Data2Avro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Data2Avro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Data2Avro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Data2Avro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Data2Avro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Data2Avro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Data2Avro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Data2Avro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private double number1;
  private double number2;
  private java.lang.CharSequence string1;
  private java.lang.CharSequence string2;
  private java.lang.CharSequence string3;
  private java.lang.CharSequence string4;
  private java.lang.CharSequence string5;
  private java.lang.CharSequence string6;
  private java.lang.CharSequence string7;
  private java.lang.CharSequence string8;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Data2Avro() {}

  /**
   * All-args constructor.
   * @param number1 The new value for number1
   * @param number2 The new value for number2
   * @param string1 The new value for string1
   * @param string2 The new value for string2
   * @param string3 The new value for string3
   * @param string4 The new value for string4
   * @param string5 The new value for string5
   * @param string6 The new value for string6
   * @param string7 The new value for string7
   * @param string8 The new value for string8
   */
  public Data2Avro(java.lang.Double number1, java.lang.Double number2, java.lang.CharSequence string1, java.lang.CharSequence string2, java.lang.CharSequence string3, java.lang.CharSequence string4, java.lang.CharSequence string5, java.lang.CharSequence string6, java.lang.CharSequence string7, java.lang.CharSequence string8) {
    this.number1 = number1;
    this.number2 = number2;
    this.string1 = string1;
    this.string2 = string2;
    this.string3 = string3;
    this.string4 = string4;
    this.string5 = string5;
    this.string6 = string6;
    this.string7 = string7;
    this.string8 = string8;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return number1;
    case 1: return number2;
    case 2: return string1;
    case 3: return string2;
    case 4: return string3;
    case 5: return string4;
    case 6: return string5;
    case 7: return string6;
    case 8: return string7;
    case 9: return string8;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: number1 = (java.lang.Double)value$; break;
    case 1: number2 = (java.lang.Double)value$; break;
    case 2: string1 = (java.lang.CharSequence)value$; break;
    case 3: string2 = (java.lang.CharSequence)value$; break;
    case 4: string3 = (java.lang.CharSequence)value$; break;
    case 5: string4 = (java.lang.CharSequence)value$; break;
    case 6: string5 = (java.lang.CharSequence)value$; break;
    case 7: string6 = (java.lang.CharSequence)value$; break;
    case 8: string7 = (java.lang.CharSequence)value$; break;
    case 9: string8 = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'number1' field.
   * @return The value of the 'number1' field.
   */
  public double getNumber1() {
    return number1;
  }


  /**
   * Sets the value of the 'number1' field.
   * @param value the value to set.
   */
  public void setNumber1(double value) {
    this.number1 = value;
  }

  /**
   * Gets the value of the 'number2' field.
   * @return The value of the 'number2' field.
   */
  public double getNumber2() {
    return number2;
  }


  /**
   * Sets the value of the 'number2' field.
   * @param value the value to set.
   */
  public void setNumber2(double value) {
    this.number2 = value;
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
   * Gets the value of the 'string3' field.
   * @return The value of the 'string3' field.
   */
  public java.lang.CharSequence getString3() {
    return string3;
  }


  /**
   * Sets the value of the 'string3' field.
   * @param value the value to set.
   */
  public void setString3(java.lang.CharSequence value) {
    this.string3 = value;
  }

  /**
   * Gets the value of the 'string4' field.
   * @return The value of the 'string4' field.
   */
  public java.lang.CharSequence getString4() {
    return string4;
  }


  /**
   * Sets the value of the 'string4' field.
   * @param value the value to set.
   */
  public void setString4(java.lang.CharSequence value) {
    this.string4 = value;
  }

  /**
   * Gets the value of the 'string5' field.
   * @return The value of the 'string5' field.
   */
  public java.lang.CharSequence getString5() {
    return string5;
  }


  /**
   * Sets the value of the 'string5' field.
   * @param value the value to set.
   */
  public void setString5(java.lang.CharSequence value) {
    this.string5 = value;
  }

  /**
   * Gets the value of the 'string6' field.
   * @return The value of the 'string6' field.
   */
  public java.lang.CharSequence getString6() {
    return string6;
  }


  /**
   * Sets the value of the 'string6' field.
   * @param value the value to set.
   */
  public void setString6(java.lang.CharSequence value) {
    this.string6 = value;
  }

  /**
   * Gets the value of the 'string7' field.
   * @return The value of the 'string7' field.
   */
  public java.lang.CharSequence getString7() {
    return string7;
  }


  /**
   * Sets the value of the 'string7' field.
   * @param value the value to set.
   */
  public void setString7(java.lang.CharSequence value) {
    this.string7 = value;
  }

  /**
   * Gets the value of the 'string8' field.
   * @return The value of the 'string8' field.
   */
  public java.lang.CharSequence getString8() {
    return string8;
  }


  /**
   * Sets the value of the 'string8' field.
   * @param value the value to set.
   */
  public void setString8(java.lang.CharSequence value) {
    this.string8 = value;
  }

  /**
   * Creates a new Data2Avro RecordBuilder.
   * @return A new Data2Avro RecordBuilder
   */
  public static generated.data2.avro.Data2Avro.Builder newBuilder() {
    return new generated.data2.avro.Data2Avro.Builder();
  }

  /**
   * Creates a new Data2Avro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Data2Avro RecordBuilder
   */
  public static generated.data2.avro.Data2Avro.Builder newBuilder(generated.data2.avro.Data2Avro.Builder other) {
    if (other == null) {
      return new generated.data2.avro.Data2Avro.Builder();
    } else {
      return new generated.data2.avro.Data2Avro.Builder(other);
    }
  }

  /**
   * Creates a new Data2Avro RecordBuilder by copying an existing Data2Avro instance.
   * @param other The existing instance to copy.
   * @return A new Data2Avro RecordBuilder
   */
  public static generated.data2.avro.Data2Avro.Builder newBuilder(generated.data2.avro.Data2Avro other) {
    if (other == null) {
      return new generated.data2.avro.Data2Avro.Builder();
    } else {
      return new generated.data2.avro.Data2Avro.Builder(other);
    }
  }

  /**
   * RecordBuilder for Data2Avro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Data2Avro>
    implements org.apache.avro.data.RecordBuilder<Data2Avro> {

    private double number1;
    private double number2;
    private java.lang.CharSequence string1;
    private java.lang.CharSequence string2;
    private java.lang.CharSequence string3;
    private java.lang.CharSequence string4;
    private java.lang.CharSequence string5;
    private java.lang.CharSequence string6;
    private java.lang.CharSequence string7;
    private java.lang.CharSequence string8;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(generated.data2.avro.Data2Avro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.number1)) {
        this.number1 = data().deepCopy(fields()[0].schema(), other.number1);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.number2)) {
        this.number2 = data().deepCopy(fields()[1].schema(), other.number2);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.string1)) {
        this.string1 = data().deepCopy(fields()[2].schema(), other.string1);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.string2)) {
        this.string2 = data().deepCopy(fields()[3].schema(), other.string2);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.string3)) {
        this.string3 = data().deepCopy(fields()[4].schema(), other.string3);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.string4)) {
        this.string4 = data().deepCopy(fields()[5].schema(), other.string4);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.string5)) {
        this.string5 = data().deepCopy(fields()[6].schema(), other.string5);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.string6)) {
        this.string6 = data().deepCopy(fields()[7].schema(), other.string6);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.string7)) {
        this.string7 = data().deepCopy(fields()[8].schema(), other.string7);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.string8)) {
        this.string8 = data().deepCopy(fields()[9].schema(), other.string8);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
    }

    /**
     * Creates a Builder by copying an existing Data2Avro instance
     * @param other The existing instance to copy.
     */
    private Builder(generated.data2.avro.Data2Avro other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.number1)) {
        this.number1 = data().deepCopy(fields()[0].schema(), other.number1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.number2)) {
        this.number2 = data().deepCopy(fields()[1].schema(), other.number2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.string1)) {
        this.string1 = data().deepCopy(fields()[2].schema(), other.string1);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.string2)) {
        this.string2 = data().deepCopy(fields()[3].schema(), other.string2);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.string3)) {
        this.string3 = data().deepCopy(fields()[4].schema(), other.string3);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.string4)) {
        this.string4 = data().deepCopy(fields()[5].schema(), other.string4);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.string5)) {
        this.string5 = data().deepCopy(fields()[6].schema(), other.string5);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.string6)) {
        this.string6 = data().deepCopy(fields()[7].schema(), other.string6);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.string7)) {
        this.string7 = data().deepCopy(fields()[8].schema(), other.string7);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.string8)) {
        this.string8 = data().deepCopy(fields()[9].schema(), other.string8);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'number1' field.
      * @return The value.
      */
    public double getNumber1() {
      return number1;
    }


    /**
      * Sets the value of the 'number1' field.
      * @param value The value of 'number1'.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder setNumber1(double value) {
      validate(fields()[0], value);
      this.number1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'number1' field has been set.
      * @return True if the 'number1' field has been set, false otherwise.
      */
    public boolean hasNumber1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'number1' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearNumber1() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'number2' field.
      * @return The value.
      */
    public double getNumber2() {
      return number2;
    }


    /**
      * Sets the value of the 'number2' field.
      * @param value The value of 'number2'.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder setNumber2(double value) {
      validate(fields()[1], value);
      this.number2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'number2' field has been set.
      * @return True if the 'number2' field has been set, false otherwise.
      */
    public boolean hasNumber2() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'number2' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearNumber2() {
      fieldSetFlags()[1] = false;
      return this;
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
    public generated.data2.avro.Data2Avro.Builder setString1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.string1 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'string1' field has been set.
      * @return True if the 'string1' field has been set, false otherwise.
      */
    public boolean hasString1() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'string1' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearString1() {
      string1 = null;
      fieldSetFlags()[2] = false;
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
    public generated.data2.avro.Data2Avro.Builder setString2(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.string2 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'string2' field has been set.
      * @return True if the 'string2' field has been set, false otherwise.
      */
    public boolean hasString2() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'string2' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearString2() {
      string2 = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'string3' field.
      * @return The value.
      */
    public java.lang.CharSequence getString3() {
      return string3;
    }


    /**
      * Sets the value of the 'string3' field.
      * @param value The value of 'string3'.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder setString3(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.string3 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'string3' field has been set.
      * @return True if the 'string3' field has been set, false otherwise.
      */
    public boolean hasString3() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'string3' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearString3() {
      string3 = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'string4' field.
      * @return The value.
      */
    public java.lang.CharSequence getString4() {
      return string4;
    }


    /**
      * Sets the value of the 'string4' field.
      * @param value The value of 'string4'.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder setString4(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.string4 = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'string4' field has been set.
      * @return True if the 'string4' field has been set, false otherwise.
      */
    public boolean hasString4() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'string4' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearString4() {
      string4 = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'string5' field.
      * @return The value.
      */
    public java.lang.CharSequence getString5() {
      return string5;
    }


    /**
      * Sets the value of the 'string5' field.
      * @param value The value of 'string5'.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder setString5(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.string5 = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'string5' field has been set.
      * @return True if the 'string5' field has been set, false otherwise.
      */
    public boolean hasString5() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'string5' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearString5() {
      string5 = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'string6' field.
      * @return The value.
      */
    public java.lang.CharSequence getString6() {
      return string6;
    }


    /**
      * Sets the value of the 'string6' field.
      * @param value The value of 'string6'.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder setString6(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.string6 = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'string6' field has been set.
      * @return True if the 'string6' field has been set, false otherwise.
      */
    public boolean hasString6() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'string6' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearString6() {
      string6 = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'string7' field.
      * @return The value.
      */
    public java.lang.CharSequence getString7() {
      return string7;
    }


    /**
      * Sets the value of the 'string7' field.
      * @param value The value of 'string7'.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder setString7(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.string7 = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'string7' field has been set.
      * @return True if the 'string7' field has been set, false otherwise.
      */
    public boolean hasString7() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'string7' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearString7() {
      string7 = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'string8' field.
      * @return The value.
      */
    public java.lang.CharSequence getString8() {
      return string8;
    }


    /**
      * Sets the value of the 'string8' field.
      * @param value The value of 'string8'.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder setString8(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.string8 = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'string8' field has been set.
      * @return True if the 'string8' field has been set, false otherwise.
      */
    public boolean hasString8() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'string8' field.
      * @return This builder.
      */
    public generated.data2.avro.Data2Avro.Builder clearString8() {
      string8 = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Data2Avro build() {
      try {
        Data2Avro record = new Data2Avro();
        record.number1 = fieldSetFlags()[0] ? this.number1 : (java.lang.Double) defaultValue(fields()[0]);
        record.number2 = fieldSetFlags()[1] ? this.number2 : (java.lang.Double) defaultValue(fields()[1]);
        record.string1 = fieldSetFlags()[2] ? this.string1 : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.string2 = fieldSetFlags()[3] ? this.string2 : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.string3 = fieldSetFlags()[4] ? this.string3 : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.string4 = fieldSetFlags()[5] ? this.string4 : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.string5 = fieldSetFlags()[6] ? this.string5 : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.string6 = fieldSetFlags()[7] ? this.string6 : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.string7 = fieldSetFlags()[8] ? this.string7 : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.string8 = fieldSetFlags()[9] ? this.string8 : (java.lang.CharSequence) defaultValue(fields()[9]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Data2Avro>
    WRITER$ = (org.apache.avro.io.DatumWriter<Data2Avro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Data2Avro>
    READER$ = (org.apache.avro.io.DatumReader<Data2Avro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeDouble(this.number1);

    out.writeDouble(this.number2);

    out.writeString(this.string1);

    out.writeString(this.string2);

    out.writeString(this.string3);

    out.writeString(this.string4);

    out.writeString(this.string5);

    out.writeString(this.string6);

    out.writeString(this.string7);

    out.writeString(this.string8);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.number1 = in.readDouble();

      this.number2 = in.readDouble();

      this.string1 = in.readString(this.string1 instanceof Utf8 ? (Utf8)this.string1 : null);

      this.string2 = in.readString(this.string2 instanceof Utf8 ? (Utf8)this.string2 : null);

      this.string3 = in.readString(this.string3 instanceof Utf8 ? (Utf8)this.string3 : null);

      this.string4 = in.readString(this.string4 instanceof Utf8 ? (Utf8)this.string4 : null);

      this.string5 = in.readString(this.string5 instanceof Utf8 ? (Utf8)this.string5 : null);

      this.string6 = in.readString(this.string6 instanceof Utf8 ? (Utf8)this.string6 : null);

      this.string7 = in.readString(this.string7 instanceof Utf8 ? (Utf8)this.string7 : null);

      this.string8 = in.readString(this.string8 instanceof Utf8 ? (Utf8)this.string8 : null);

    } else {
      for (int i = 0; i < 10; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.number1 = in.readDouble();
          break;

        case 1:
          this.number2 = in.readDouble();
          break;

        case 2:
          this.string1 = in.readString(this.string1 instanceof Utf8 ? (Utf8)this.string1 : null);
          break;

        case 3:
          this.string2 = in.readString(this.string2 instanceof Utf8 ? (Utf8)this.string2 : null);
          break;

        case 4:
          this.string3 = in.readString(this.string3 instanceof Utf8 ? (Utf8)this.string3 : null);
          break;

        case 5:
          this.string4 = in.readString(this.string4 instanceof Utf8 ? (Utf8)this.string4 : null);
          break;

        case 6:
          this.string5 = in.readString(this.string5 instanceof Utf8 ? (Utf8)this.string5 : null);
          break;

        case 7:
          this.string6 = in.readString(this.string6 instanceof Utf8 ? (Utf8)this.string6 : null);
          break;

        case 8:
          this.string7 = in.readString(this.string7 instanceof Utf8 ? (Utf8)this.string7 : null);
          break;

        case 9:
          this.string8 = in.readString(this.string8 instanceof Utf8 ? (Utf8)this.string8 : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










