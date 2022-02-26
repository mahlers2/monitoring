package de.hsw.buchungsservice.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * DTO fuer einen Account
 */
@RedisHash("Account")
public class Account implements Serializable {
    
    @Id
    private String iban;
    private String customerId;
    private int balance;
    private String creationDate;
    private boolean clearingAccount;
    private boolean capableForTransaction;

    public Account(String iban, String customerId, int balance, String creationDate, boolean clearingAccount,
            boolean capableForTransaction) {
        this.iban = iban;
        this.customerId = customerId;
        this.balance = balance;
        this.creationDate = creationDate;
        this.clearingAccount = clearingAccount;
        this.capableForTransaction = capableForTransaction;
    }

    public String getiban() {
        return iban;
    }

    public void setiban(String iban) {
        this.iban = iban;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isClearingAccount() {
        return clearingAccount;
    }

    public void setClearingAccount(boolean clearingAccount) {
        this.clearingAccount = clearingAccount;
    }

    public boolean isCapableForTransaction() {
        return capableForTransaction;
    }

    public void setCapableForTransaction(boolean capableForTransaction) {
        this.capableForTransaction = capableForTransaction;
    }
}
