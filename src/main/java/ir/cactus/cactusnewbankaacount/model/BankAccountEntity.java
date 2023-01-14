package ir.cactus.cactusnewbankaacount.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Setter
@Getter
@Table(name = "bank_account", schema = "bankaccount")
public class BankAccountEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "account_number")
    private String accountNumber;
    @Basic
    @Column(name = "account_type")
    private String accountType;
    @Basic
    @Column(name = "account_customer_id")
    private int accountCustomerId;
    @Basic
    @Column(name = "account_limit")
    private int accountLimit;
    @Basic
    @Column(name = "account_open_date")
    private String accountOpenDate;
    @Basic
    @Column(name = "account_balance")
    private int accountBalance;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccountEntity that = (BankAccountEntity) o;
        return Objects.equals(accountNumber, that.accountNumber) && Objects.equals(accountType, that.accountType) && Objects.equals(accountCustomerId, that.accountCustomerId) && Objects.equals(accountLimit, that.accountLimit) && Objects.equals(accountOpenDate, that.accountOpenDate) && Objects.equals(accountBalance, that.accountBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountType, accountCustomerId, accountLimit, accountOpenDate, accountBalance);
    }
}
