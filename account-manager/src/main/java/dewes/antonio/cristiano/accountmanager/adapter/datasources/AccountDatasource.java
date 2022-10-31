package dewes.antonio.cristiano.accountmanager.adapter.datasources;

import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.MysqlAccountRepository;
import dewes.antonio.cristiano.accountmanager.adapter.datasources.services.mapper.AccountMapper;
import dewes.antonio.cristiano.accountmanager.internal.entities.Account;
import dewes.antonio.cristiano.accountmanager.internal.repositories.AccountRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class AccountDatasource implements AccountRepository {

    private AtomicLong atomicLong = new AtomicLong(1);

    private final MysqlAccountRepository mysqlAccountRepository;

    public AccountDatasource(MysqlAccountRepository mysqlAccountRepository) {
        this.mysqlAccountRepository = mysqlAccountRepository;
    }

    @Override
    @Transactional
    public Account create(Account account) {
        var newAccount = AccountMapper.INSTANCE.map(account);
        return AccountMapper.INSTANCE.map(this.mysqlAccountRepository.save(newAccount));
    }

    @Override
    public Long getNextAccountNumber() {
        return atomicLong.incrementAndGet();
    }
}
