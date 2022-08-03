package comparison.measurements;

import org.apache.thrift.TDeserializer;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.transport.TTransportException;

public class ThriftCompactMeasurement extends ThriftMeasurement {

    public ThriftCompactMeasurement() throws TTransportException {
        super("Thrift Compact", "thrift_compact", "dat",
                new TSerializer(new TCompactProtocol.Factory()),
                new TDeserializer(new TCompactProtocol.Factory()));
    }
}
