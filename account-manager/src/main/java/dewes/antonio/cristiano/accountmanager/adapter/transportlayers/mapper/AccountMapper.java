package dewes.antonio.cristiano.accountmanager.adapter.transportlayers.mapper;

import dewes.antonio.cristiano.accountmanager.internal.entities.Account;
import dewes.antonio.cristiano.gen.proto.AccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AccountMapper extends UtilsMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountResponse map(Account source);
}
