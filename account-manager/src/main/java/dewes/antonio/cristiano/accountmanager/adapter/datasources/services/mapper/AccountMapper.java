package dewes.antonio.cristiano.accountmanager.adapter.datasources.services.mapper;

import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model.AccountModel;
import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model.UserModel;
import dewes.antonio.cristiano.accountmanager.internal.entities.Account;
import dewes.antonio.cristiano.accountmanager.internal.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    Account map(AccountModel source);
    AccountModel map(Account source);
}
