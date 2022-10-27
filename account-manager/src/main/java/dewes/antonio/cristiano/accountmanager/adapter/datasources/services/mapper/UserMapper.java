package dewes.antonio.cristiano.accountmanager.adapter.datasources.services.mapper;

import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model.UserModel;
import dewes.antonio.cristiano.accountmanager.internal.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User map(UserModel source);
    UserModel map(User source);
}
