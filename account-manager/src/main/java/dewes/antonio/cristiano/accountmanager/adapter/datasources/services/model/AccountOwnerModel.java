package dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNT_OWNER")
public class AccountOwnerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", updatable = false)
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "CPF", unique = true, nullable = false, updatable = false)
    private String cpf;
    @Column(name = "E_MAIL", unique = true, nullable = false)
    private String email;
    @Column(name = "CELL_PHONE_NUMBER", unique = true, nullable = false)
    private String cellPhoneNumber;
    @Column(name = "INSERTED_DATE", nullable = false, updatable = false)
    private ZonedDateTime insertedDate;
    @Column(name = "LAST_UPDATED_DATE")
    private ZonedDateTime lastUpdatedDate;

    public Long getId() {
        return id;
    }

    public AccountOwnerModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AccountOwnerModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public AccountOwnerModel setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AccountOwnerModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public AccountOwnerModel setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        return this;
    }

    public ZonedDateTime getInsertedDate() {
        return insertedDate;
    }

    public AccountOwnerModel setInsertedDate(ZonedDateTime insertedDate) {
        this.insertedDate = insertedDate;
        return this;
    }

    public ZonedDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public AccountOwnerModel setLastUpdatedDate(ZonedDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountOwnerModel accountOwnerModel = (AccountOwnerModel) o;
        return Objects.equals(id, accountOwnerModel.id) && Objects.equals(name, accountOwnerModel.name) && Objects.equals(cpf, accountOwnerModel.cpf) && Objects.equals(email, accountOwnerModel.email) && Objects.equals(cellPhoneNumber, accountOwnerModel.cellPhoneNumber) && Objects.equals(insertedDate, accountOwnerModel.insertedDate) && Objects.equals(lastUpdatedDate, accountOwnerModel.lastUpdatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, email, cellPhoneNumber, insertedDate, lastUpdatedDate);
    }
}
