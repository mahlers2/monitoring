package de.hsw.buchungsservice.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * DTO TransactionRequest
 */
@RedisHash("TransactionRequest")
public class TransactionRequest implements Serializable {
    
    @Id
    private String receiverId;
    private int amount;
    private String usage;
    
    public TransactionRequest(String receiverId, int amount, String usage) {
        this.receiverId = receiverId;
        this.amount = amount;
        this.usage = usage;
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

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
