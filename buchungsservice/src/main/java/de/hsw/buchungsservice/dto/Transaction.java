package de.hsw.buchungsservice.dto;

import java.io.Serializable;
import java.security.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * DTO fuer eine normale Buchung
 */
@RedisHash("Transaction")
public class Transaction implements Serializable {
    
    @Id
    private int transactionId;
    private String senderId;
    private String receiverId;
    private int amount;
    private Timestamp timestamp;
    private String usage;

    public Transaction(int transactionId, String senderId, String receiverId, int amount, Timestamp timestamp,
            String usage) {
        this.transactionId = transactionId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.usage = usage;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getreceiverId() {
        return receiverId;
    }

    public void setreceiverId(String receiverId) {
        this.receiverId = receiverId;
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

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
