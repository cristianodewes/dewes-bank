package dewes.antonio.cristiano.accountmanager.adapter.datasources.services;

import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MysqlUserRepository extends CrudRepository<UserModel, Long> {

    Optional<UserModel> findByCpf(String cpf);
}
