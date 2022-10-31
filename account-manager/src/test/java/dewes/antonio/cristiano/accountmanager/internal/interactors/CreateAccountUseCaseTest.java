package dewes.antonio.cristiano.accountmanager.internal.interactors;

import dewes.antonio.cristiano.accountmanager.internal.repositories.AccountRepository;
import dewes.antonio.cristiano.accountmanager.internal.repositories.AccountOwnerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class CreateAccountUseCaseTest {

    private final AccountOwnerRepository accountOwnerRepository;
    private final AccountRepository accountRepository;

    public CreateAccountUseCaseTest() {
        this.accountOwnerRepository = mock(AccountOwnerRepository.class);
        this.accountRepository = mock(AccountRepository.class);
    }

    @Test
    @DisplayName("Should return Account when create")
    public void shouldReturnAccountWhenCreate() {
    }
}
