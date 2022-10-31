package dewes.antonio.cristiano.accountmanager.internal.repositories;

import dewes.antonio.cristiano.accountmanager.internal.entities.Account;

public interface AccountRepository {

    /**
     * Create an account
     *
     * @param account
     * @return Account
     */
    Account create(Account account);

    /**
     * Get next account number
     * @return Long
     */
    Long getNextAccountNumber();
}
