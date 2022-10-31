package dewes.antonio.cristiano.accountmanager.adapter.transportlayers.grpc;

import dewes.antonio.cristiano.accountmanager.bootstrap.exceptions.AccountNotFoundException;
import dewes.antonio.cristiano.accountmanager.bootstrap.exceptions.AccountOwnerNotFoundException;
import io.grpc.Status;
import org.lognet.springboot.grpc.recovery.GRpcExceptionHandler;
import org.lognet.springboot.grpc.recovery.GRpcExceptionScope;
import org.lognet.springboot.grpc.recovery.GRpcServiceAdvice;

@GRpcServiceAdvice
public class AccountManagerExceptionHandler {

    @GRpcExceptionHandler
    public Status handleAccountNotFoundException(AccountNotFoundException e, GRpcExceptionScope scope) {
        final var status = Status.NOT_FOUND.withDescription(e.getMessage()).withCause(e);
        return status;
    }

    @GRpcExceptionHandler
    public Status handleUserNotFoundException(AccountOwnerNotFoundException e, GRpcExceptionScope scope) {
        var status = Status.NOT_FOUND.withDescription(e.getMessage()).withCause(e);
        return status;
    }
}
