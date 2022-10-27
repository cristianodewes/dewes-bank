package dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
@Table(name = "BANK_USER")
public class UserModel {

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
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean isActive;
    @Column(name = "INSERTED_DATE", nullable = false, updatable = false)
    private ZonedDateTime insertedDate;
    @Column(name = "LAST_UPDATED_DATE")
    private ZonedDateTime lastUpdatedDate;

    public Long getId() {
        return id;
    }

    public UserModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public UserModel setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public UserModel setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public UserModel setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public ZonedDateTime getInsertedDate() {
        return insertedDate;
    }

    public UserModel setInsertedDate(ZonedDateTime insertedDate) {
        this.insertedDate = insertedDate;
        return this;
    }

    public ZonedDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public UserModel setLastUpdatedDate(ZonedDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(id, userModel.id) && Objects.equals(name, userModel.name) && Objects.equals(cpf, userModel.cpf) && Objects.equals(email, userModel.email) && Objects.equals(cellPhoneNumber, userModel.cellPhoneNumber) && Objects.equals(password, userModel.password) && Objects.equals(isActive, userModel.isActive) && Objects.equals(insertedDate, userModel.insertedDate) && Objects.equals(lastUpdatedDate, userModel.lastUpdatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, email, cellPhoneNumber, password, isActive, insertedDate, lastUpdatedDate);
    }
}
