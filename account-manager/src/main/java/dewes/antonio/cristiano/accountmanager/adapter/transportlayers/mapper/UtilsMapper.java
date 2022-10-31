package dewes.antonio.cristiano.accountmanager.adapter.transportlayers.mapper;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import dewes.antonio.cristiano.gen.proto.DecimalValue;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UtilsMapper {

    default Timestamp map(ZonedDateTime source) {
        if (Objects.isNull(source))
            return Timestamp.newBuilder()
                    .setSeconds(0)
                    .setNanos(0)
                    .build();

        final var time = source.toInstant();
        return Timestamp.newBuilder()
                .setSeconds(time.getEpochSecond())
                .setNanos(time.getNano())
                .build();
    }

    default ZonedDateTime map(Timestamp source) {
        if (Objects.isNull(source))
            return null;

        if (source.getNanos() == 0 && source.getSeconds() == 0)
            return null;

        final var time = Instant.ofEpochSecond(source.getSeconds(), source.getNanos());
        return ZonedDateTime.ofInstant(time, ZoneId.systemDefault());
    }

    default DecimalValue map(BigDecimal source) {
        if (Objects.isNull(source))
            source = BigDecimal.ZERO;

        return DecimalValue.newBuilder()
                .setScale(source.scale())
                .setPrecision(source.precision())
                .setValue(ByteString.copyFrom(source.unscaledValue().toByteArray()))
                .build();
    }

    default BigDecimal map(DecimalValue source) {
        if (Objects.isNull(source))
            return null;

        final var value = new BigInteger(source.getValue().toByteArray());
        final var precision = new MathContext(source.getPrecision());

        return new BigDecimal(value, source.getScale(), precision);
    }
}
