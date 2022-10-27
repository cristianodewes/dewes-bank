package dewes.antonio.cristiano.accountmanager.adapter.datasources.services;

import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model.AccountModel;
import org.springframework.data.repository.CrudRepository;

public interface MysqlAccountRepository extends CrudRepository<AccountModel, Long> {
}
