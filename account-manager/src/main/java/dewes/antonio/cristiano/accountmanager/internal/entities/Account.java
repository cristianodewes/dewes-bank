package dewes.antonio.cristiano.accountmanager.internal.entities;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

public class Account {

    private Long id;
    private AccountOwner accountOwner;
    private AccountType accountType;
    private Long number;
    private Long agency;
    private BigDecimal amount;
    private String password;
    private ZonedDateTime createdDate;
    private ZonedDateTime lasUpdatedDate;
    private ZonedDateTime fishedDate;
    private Boolean active;
    private String version;

    public Account() {
    }

    public Account(AccountOwner accountOwner, Long agency, Long number, String password) {
        this.accountOwner = accountOwner;
        this.agency = agency;
        this.number = number;
        this.amount = BigDecimal.ZERO;
        this.createdDate = ZonedDateTime.now();
        this.active = true;
        this.version = UUID.randomUUID().toString();
    }

    public Long getId() {
        return id;
    }

    public Account setId(Long id) {
        this.id = id;
        return this;
    }

    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

    public Account setAccountOwner(AccountOwner accountOwner) {
        this.accountOwner = accountOwner;
        return this;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Account setAccountType(AccountType accountType) {
        this.accountType = accountType;
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

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
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
        return active;
    }

    public Account setActive(Boolean active) {
        this.active = active;
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
        return Objects.equals(id, account.id) && Objects.equals(accountOwner, account.accountOwner) && accountType == account.accountType && Objects.equals(number, account.number) && Objects.equals(agency, account.agency) && Objects.equals(amount, account.amount) && Objects.equals(password, account.password) && Objects.equals(createdDate, account.createdDate) && Objects.equals(lasUpdatedDate, account.lasUpdatedDate) && Objects.equals(fishedDate, account.fishedDate) && Objects.equals(active, account.active) && Objects.equals(version, account.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountOwner, accountType, number, agency, amount, password, createdDate, lasUpdatedDate, fishedDate, active, version);
    }
}
