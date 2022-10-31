package dewes.antonio.cristiano.accountmanager.internal.repositories;

import dewes.antonio.cristiano.accountmanager.internal.entities.AccountOwner;

public interface AccountOwnerRepository {

    /**
     * Create a User
     *
     * @param accountOwner
     * @return AccountOwner
     */
    AccountOwner create(AccountOwner accountOwner);

    /**
     * Get user by CPF number
     * @param cpf
     * @return AccountOwner
     */
    AccountOwner getAccountOwnerByCpf(String cpf);

    /**
     * Verify if exist AccountOwner by CPF
     * @param cpf
     * @return boolean
     */
    boolean existsByCpf(String cpf);

    /**
     * Verify if exist AccountOwner by EMAIL
     * @param email
     * @return boolean
     */
    boolean existsByEmail(String email);
}
