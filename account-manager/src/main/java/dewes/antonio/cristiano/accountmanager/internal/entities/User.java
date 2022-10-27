package dewes.antonio.cristiano.accountmanager.internal.entities;

import java.time.ZonedDateTime;
import java.util.Objects;

public class User {

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String cellPhoneNumber;
    private String password;
    private Boolean isActive;
    private ZonedDateTime insertedDate;
    private ZonedDateTime lastUpdatedDate;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public User setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public User setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public User setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public ZonedDateTime getInsertedDate() {
        return insertedDate;
    }

    public User setInsertedDate(ZonedDateTime insertedDate) {
        this.insertedDate = insertedDate;
        return this;
    }

    public ZonedDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public User setLastUpdatedDate(ZonedDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(cpf, user.cpf) && Objects.equals(email, user.email) && Objects.equals(cellPhoneNumber, user.cellPhoneNumber) && Objects.equals(password, user.password) && Objects.equals(isActive, user.isActive) && Objects.equals(insertedDate, user.insertedDate) && Objects.equals(lastUpdatedDate, user.lastUpdatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, email, cellPhoneNumber, password, isActive, insertedDate, lastUpdatedDate);
    }
}
