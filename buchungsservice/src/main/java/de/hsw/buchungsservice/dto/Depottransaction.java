package de.hsw.buchungsservice.dto;

import java.io.Serializable;
import java.security.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * DTO fuer eine Depotbuchung
 */
@RedisHash("Depottransaction")
public class Depottransaction implements Serializable {
    
    @Id
    private int transactionId;
    private String accountId;
    private int amount;
    private Timestamp timestamp;
    
    public Depottransaction(int transactionId, String accountId, int amount, Timestamp timestamp) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
