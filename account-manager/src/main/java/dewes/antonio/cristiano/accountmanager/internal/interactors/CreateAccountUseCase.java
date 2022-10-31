package dewes.antonio.cristiano.accountmanager.internal.interactors;

import dewes.antonio.cristiano.accountmanager.bootstrap.exceptions.EmailDuplicateException;
import dewes.antonio.cristiano.accountmanager.internal.entities.Account;
import dewes.antonio.cristiano.accountmanager.internal.entities.AccountOwner;
import dewes.antonio.cristiano.accountmanager.internal.repositories.AccountOwnerRepository;
import dewes.antonio.cristiano.accountmanager.internal.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class CreateAccountUseCase {

    private final AccountOwnerRepository accountOwnerRepository;
    private final AccountRepository accountRepository;

    public CreateAccountUseCase(AccountOwnerRepository accountOwnerRepository, AccountRepository accountRepository) {
        this.accountOwnerRepository = accountOwnerRepository;
        this.accountRepository = accountRepository;
    }

    public Account execute(AccountOwner accountOwner, Long agency, String password) {
        accountOwner = this.saveAccountOwner(accountOwner);

        final var account = new Account(accountOwner, agency, this.accountRepository.getNextAccountNumber(), password);
        return this.accountRepository.create(account);
    }

    private AccountOwner saveAccountOwner(AccountOwner accountOwner) {
        if (this.verifyIfAccountOwnerExist(accountOwner)) {
            return this.accountOwnerRepository.getAccountOwnerByCpf(accountOwner.getCpf());
        }
        if (verifyIfEmailExist(accountOwner))
            throw new EmailDuplicateException("O e-mail '" + accountOwner.getEmail() + "' já está em uso.");

        accountOwner.setInsertedDate(ZonedDateTime.now());

        return this.accountOwnerRepository.create(accountOwner);
    }

    private boolean verifyIfAccountOwnerExist(AccountOwner accountOwner) {
        return this.accountOwnerRepository.existsByCpf(accountOwner.getCpf());
    }

    private boolean verifyIfEmailExist(AccountOwner accountOwner) {
        return this.accountOwnerRepository.existsByEmail(accountOwner.getEmail());
    }
}
