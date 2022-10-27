package dewes.antonio.cristiano.accountmanager.internal.entities;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Account {

    private Long id;
    private User user;
    private Long number;
    private Long agency;
    private BigDecimal amount;
    private ZonedDateTime createdDate;
    private ZonedDateTime lasUpdatedDate;
    private ZonedDateTime fishedDate;
    private Boolean isActive;
    private String version;

    public Long getId() {
        return id;
    }

    public Account setId(Long id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Account setUser(User user) {
        this.user = user;
        return this;
    }

    public Long getNumber() {
        return number;
    }

    public Account setNumber(Long number) {
        this.number = number;
        return this;
    }

    public Long getAgency() {
        return agency;
    }

    public Account setAgency(Long agency) {
        this.agency = agency;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Account setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public Account setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public ZonedDateTime getLasUpdatedDate() {
        return lasUpdatedDate;
    }

    public Account setLasUpdatedDate(ZonedDateTime lasUpdatedDate) {
        this.lasUpdatedDate = lasUpdatedDate;
        return this;
    }

    public ZonedDateTime getFishedDate() {
        return fishedDate;
    }

    public Account setFishedDate(ZonedDateTime fishedDate) {
        this.fishedDate = fishedDate;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Account setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Account setVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(user, account.user) && Objects.equals(number, account.number) && Objects.equals(agency, account.agency) && Objects.equals(amount, account.amount) && Objects.equals(createdDate, account.createdDate) && Objects.equals(lasUpdatedDate, account.lasUpdatedDate) && Objects.equals(fishedDate, account.fishedDate) && Objects.equals(isActive, account.isActive) && Objects.equals(version, account.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, number, agency, amount, createdDate, lasUpdatedDate, fishedDate, isActive, version);
    }
}
