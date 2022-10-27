package dewes.antonio.cristiano.accountmanager.adapter.datasources.services.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
@Table(name = "BANK_ACCOUNT")
public class AccountModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", updatable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false, updatable = false)
    private UserModel user;
    @Column(name = "ACCOUNT_NUMBER", unique = true, nullable = false, updatable = false)
    private Long number;
    @Column(name = "AGENCY", nullable = false, updatable = false)
    private Long agency;
    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;
    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    private ZonedDateTime createdDate;
    @Column(name = "LAST_UPDATED_DATE")
    private ZonedDateTime lasUpdatedDate;
    @Column(name = "FINISHED_DATE")
    private ZonedDateTime fishedDate;
    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean isActive;
    @Column(name = "VERSION", nullable = false)
    private String version;

    public Long getId() {
        return id;
    }

    public AccountModel setId(Long id) {
        this.id = id;
        return this;
    }

    public UserModel getUser() {
        return user;
    }

    public AccountModel setUser(UserModel user) {
        this.user = user;
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
        return isActive;
    }

    public AccountModel setActive(Boolean active) {
        isActive = active;
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
        AccountModel account = (AccountModel) o;
        return Objects.equals(id, account.id) && Objects.equals(user, account.user) && Objects.equals(number, account.number) && Objects.equals(agency, account.agency) && Objects.equals(amount, account.amount) && Objects.equals(createdDate, account.createdDate) && Objects.equals(lasUpdatedDate, account.lasUpdatedDate) && Objects.equals(fishedDate, account.fishedDate) && Objects.equals(isActive, account.isActive) && Objects.equals(version, account.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, number, agency, amount, createdDate, lasUpdatedDate, fishedDate, isActive, version);
    }
}
