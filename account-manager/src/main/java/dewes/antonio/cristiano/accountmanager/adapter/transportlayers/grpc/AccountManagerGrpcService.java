package dewes.antonio.cristiano.accountmanager.adapter.transportlayers.grpc;

import dewes.antonio.cristiano.accountmanager.adapter.transportlayers.mapper.AccountMapper;
import dewes.antonio.cristiano.accountmanager.adapter.transportlayers.mapper.AccountOwnerMapper;
import dewes.antonio.cristiano.accountmanager.internal.entities.Account;
import dewes.antonio.cristiano.accountmanager.internal.entities.AccountOwner;
import dewes.antonio.cristiano.accountmanager.internal.interactors.CreateAccountUseCase;
import dewes.antonio.cristiano.gen.proto.AccountManagerServiceGrpc;
import dewes.antonio.cristiano.gen.proto.AccountRequest;
import dewes.antonio.cristiano.gen.proto.AccountResponse;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class AccountManagerGrpcService extends AccountManagerServiceGrpc.AccountManagerServiceImplBase {

    private final CreateAccountUseCase createAccountUseCase;

    public AccountManagerGrpcService(CreateAccountUseCase createAccountUseCase) {
        this.createAccountUseCase = createAccountUseCase;
    }

    @Override
    public void createAccount(AccountRequest request, StreamObserver<AccountResponse> responseObserver) {
        final var user = AccountOwnerMapper.INSTANCE.map(request.getAccountOwner());
        final var newAccount = this.createAccountUseCase.execute(user, request.getAgency(), "");

        responseObserver.onNext(AccountMapper.INSTANCE.map(new Account().setAccountOwner(new AccountOwner())));
        responseObserver.onCompleted();
    }
}
