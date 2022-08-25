package comparison.measurements;

import comparison.DataHelper;
import org.apache.thrift.TDeserializer;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.transport.TTransportException;

import java.io.IOException;

public class ThriftCompactMeasurement extends ThriftMeasurement {

    public ThriftCompactMeasurement() throws TTransportException {
        super("Thrift Compact", "thrift_compact", "dat",
                new TSerializer(new TCompactProtocol.Factory()),
                new TDeserializer(new TCompactProtocol.Factory()));
    }

    public static void main(String[] args) throws Exception {
        int i = Integer.parseInt(args[0]);
        DataHelper.initAll();

        new ThriftCompactMeasurement().measure(i);
    }
}
