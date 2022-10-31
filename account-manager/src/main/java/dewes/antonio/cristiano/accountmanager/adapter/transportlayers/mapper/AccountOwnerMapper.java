package dewes.antonio.cristiano.accountmanager.adapter.transportlayers.mapper;

import dewes.antonio.cristiano.accountmanager.internal.entities.AccountOwner;
import dewes.antonio.cristiano.gen.proto.AccountOwnerRequest;
import dewes.antonio.cristiano.gen.proto.AccountOwnerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AccountOwnerMapper extends UtilsMapper {

    AccountOwnerMapper INSTANCE = Mappers.getMapper(AccountOwnerMapper.class);

    AccountOwner map(AccountOwnerRequest source);

    AccountOwnerResponse map(AccountOwner source);
}
