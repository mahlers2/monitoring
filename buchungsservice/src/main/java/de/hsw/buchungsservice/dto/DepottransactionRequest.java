package de.hsw.buchungsservice.dto;

import java.io.Serializable;
import java.security.Timestamp;

import org.springframework.data.redis.core.RedisHash;

/**
 * DTO fuer die DepottransactionRequest
 */
@RedisHash("DepottransactionRequest")
public class DepottransactionRequest implements Serializable {
    
    private int transactionId;
    private int amount;
    private Timestamp timestamp;

    public DepottransactionRequest(int transactionId, int amount, Timestamp timestamp) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
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
