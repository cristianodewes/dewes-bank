package dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
@Table(name = "BANK_ACCOUNT")
public class AccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false, updatable = false)
    private AccountOwnerModel accountOwner;
    @Column(name = "ACCOUNT_TYPE", nullable = false, updatable = false)
    private AccountTypeModel accountType;
    @Column(name = "ACCOUNT_NUMBER", unique = true, nullable = false, updatable = false)
    private Long number;
    @Column(name = "AGENCY", nullable = false, updatable = false)
    private Long agency;
    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    private ZonedDateTime createdDate;
    @Column(name = "LAST_UPDATED_DATE")
    private ZonedDateTime lasUpdatedDate;
    @Column(name = "FINISHED_DATE")
    private ZonedDateTime fishedDate;
    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean active;
    @Column(name = "VERSION", nullable = false)
    private String version;

    public Long getId() {
        return id;
    }

    public AccountModel setId(Long id) {
        this.id = id;
        return this;
    }

    public AccountOwnerModel getAccountOwner() {
        return accountOwner;
    }

    public AccountModel setAccountOwner(AccountOwnerModel accountOwner) {
        this.accountOwner = accountOwner;
        return this;
    }

    public AccountTypeModel getAccountType() {
        return accountType;
    }

    public AccountModel setAccountType(AccountTypeModel accountType) {
        this.accountType = accountType;
        return this;
    }

    public Long getNumber() {
        return number;
    }

    public AccountModel setNumber(Long number) {
        this.number = number;
        return this;
    }

    public Long getAgency() {
        return agency;
    }

    public AccountModel setAgency(Long agency) {
        this.agency = agency;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public AccountModel setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AccountModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public AccountModel setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public ZonedDateTime getLasUpdatedDate() {
        return lasUpdatedDate;
    }

    public AccountModel setLasUpdatedDate(ZonedDateTime lasUpdatedDate) {
        this.lasUpdatedDate = lasUpdatedDate;
        return this;
    }

    public ZonedDateTime getFishedDate() {
        return fishedDate;
    }

    public AccountModel setFishedDate(ZonedDateTime fishedDate) {
        this.fishedDate = fishedDate;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public AccountModel setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public AccountModel setVersion(String version) {
        this.version = version;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountModel that = (AccountModel) o;
        return Objects.equals(id, that.id) && Objects.equals(accountOwner, that.accountOwner) && accountType == that.accountType && Objects.equals(number, that.number) && Objects.equals(agency, that.agency) && Objects.equals(amount, that.amount) && Objects.equals(password, that.password) && Objects.equals(createdDate, that.createdDate) && Objects.equals(lasUpdatedDate, that.lasUpdatedDate) && Objects.equals(fishedDate, that.fishedDate) && Objects.equals(active, that.active) && Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountOwner, accountType, number, agency, amount, password, createdDate, lasUpdatedDate, fishedDate, active, version);
    }
}
