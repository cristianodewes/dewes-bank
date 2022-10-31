package dewes.antonio.cristiano.accountmanager.adapter.datasources.services.mapper;

import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model.AccountOwnerModel;
import dewes.antonio.cristiano.accountmanager.internal.entities.AccountOwner;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AccountOwnerMapper {

    AccountOwnerMapper INSTANCE = Mappers.getMapper(AccountOwnerMapper.class);

    AccountOwner map(AccountOwnerModel source);

    AccountOwnerModel map(AccountOwner source);
}
