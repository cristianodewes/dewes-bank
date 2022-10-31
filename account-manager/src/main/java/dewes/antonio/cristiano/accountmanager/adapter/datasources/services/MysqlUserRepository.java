package dewes.antonio.cristiano.accountmanager.adapter.datasources.services;

import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model.AccountOwnerModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MysqlUserRepository extends CrudRepository<AccountOwnerModel, Long> {

    Optional<AccountOwnerModel> findByCpf(String cpf);
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
}
