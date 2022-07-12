package comparison;

import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import testing.avro.PersonAvro;
import testing.avro.PhoneNumberAvro;
import testing.avro.PhoneTypeAvro;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class AvroMeasurement extends Measurement {

    private final DatumWriter<PersonAvro> datumWriter;
    private final DatumReader<PersonAvro> datumReader;

    private final ByteArrayOutputStream outputStream;

    private final Encoder encoder;
    private Decoder decoder;


    protected AvroMeasurement() {
        super("Avro", "data_avro.ser");
        this.datumWriter = new SpecificDatumWriter<>(PersonAvro.class);
        this.datumReader = new SpecificDatumReader<>(PersonAvro.class);
        this.outputStream = new ByteArrayOutputStream();
        this.encoder = EncoderFactory.get().binaryEncoder(outputStream, null);
        this.decoder = DecoderFactory.get().binaryDecoder(new byte[0], null);
    }


    @Override
    public Object buildObject() {
        return PersonAvro.newBuilder()
                .setId(getID())
                .setName(getNAME())
                .setEmail(getEMAIL())
                .setPhones(List.of(
                        PhoneNumberAvro.newBuilder()
                                .setNumber(getNUMBER())
                                .setType(PhoneTypeAvro.MOBILE)
                                .build()
                ))
                .build();
    }

    @Override
    public byte[] serializeObject(Object object) throws IOException {
        outputStream.reset();
        datumWriter.write((PersonAvro) object, encoder);
        encoder.flush();

        return outputStream.toByteArray();
    }

    @Override
    public Object deserializeObject(byte[] bytes) throws IOException {
        decoder = DecoderFactory.get().binaryDecoder(bytes, (BinaryDecoder) decoder);
        return datumReader.read(null, decoder);
    }
}
