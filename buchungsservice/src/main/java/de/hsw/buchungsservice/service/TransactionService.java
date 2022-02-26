package de.hsw.buchungsservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import de.hsw.buchungsservice.dto.Transaction;
import de.hsw.buchungsservice.dto.TransactionRequest;
import de.hsw.buchungsservice.repositories.TransactionRepository;

/**
 * Service für normale Kontobuchungen
 */
@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    public Transaction getTransaction(int id) {
        return transactionRepository.findById(id).orElseThrow();
    }

    public Transaction addTransaction(String id, TransactionRequest request) {
        // TODO muss noch umgesetzt werden
        return null;
    }

    public List<Transaction> getTransactions(Date start, Date end) {
        // TODO muss noch umgesetzt werden
        return null;
    }
}
