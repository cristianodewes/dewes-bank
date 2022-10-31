package dewes.antonio.cristiano.accountmanager.adapter.datasources;

import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.MysqlUserRepository;
import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.mapper.AccountOwnerMapper;
import dewes.antonio.cristiano.accountmanager.bootstrap.exceptions.AccountOwnerNotFoundException;
import dewes.antonio.cristiano.accountmanager.internal.entities.AccountOwner;
import dewes.antonio.cristiano.accountmanager.internal.repositories.AccountOwnerRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AccountOwnerDatasource implements AccountOwnerRepository {

    private final MysqlUserRepository mysqlUserRepository;

    public AccountOwnerDatasource(MysqlUserRepository mysqlUserRepository) {
        this.mysqlUserRepository = mysqlUserRepository;
    }

    @Override
    @Transactional
    public AccountOwner create(AccountOwner accountOwner) {
        var newUser = AccountOwnerMapper.INSTANCE.map(accountOwner);
        return AccountOwnerMapper.INSTANCE.map(this.mysqlUserRepository.save(newUser));
    }

    @Override
    public AccountOwner getAccountOwnerByCpf(String cpf) {
        final var result = this.mysqlUserRepository.findByCpf(cpf)
                .orElseThrow(() -> new AccountOwnerNotFoundException("O usuário com CPF '" + cpf + "' não foi encontrado."));

        return AccountOwnerMapper.INSTANCE.map(result);
    }

    @Override
    public boolean existsByCpf(String cpf) {
        return this.mysqlUserRepository.existsByCpf(cpf);
    }

    @Override
    public boolean existsByEmail(String email) {
        return this.mysqlUserRepository.existsByEmail(email);
    }
}
