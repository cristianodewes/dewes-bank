package dewes.antonio.cristiano.accountmanager.internal.entities;

import java.time.ZonedDateTime;
import java.util.Objects;

public class AccountOwner {

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String cellPhoneNumber;
    private ZonedDateTime insertedDate;
    private ZonedDateTime lastUpdatedDate;

    public Long getId() {
        return id;
    }

    public AccountOwner setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AccountOwner setName(String name) {
        this.name = name;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public AccountOwner setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AccountOwner setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public AccountOwner setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        return this;
    }

    public ZonedDateTime getInsertedDate() {
        return insertedDate;
    }

    public AccountOwner setInsertedDate(ZonedDateTime insertedDate) {
        this.insertedDate = insertedDate;
        return this;
    }

    public ZonedDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public AccountOwner setLastUpdatedDate(ZonedDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountOwner accountOwner = (AccountOwner) o;
        return Objects.equals(id, accountOwner.id) && Objects.equals(name, accountOwner.name) && Objects.equals(cpf, accountOwner.cpf) && Objects.equals(email, accountOwner.email) && Objects.equals(cellPhoneNumber, accountOwner.cellPhoneNumber) && Objects.equals(insertedDate, accountOwner.insertedDate) && Objects.equals(lastUpdatedDate, accountOwner.lastUpdatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, email, cellPhoneNumber, insertedDate, lastUpdatedDate);
    }
}
