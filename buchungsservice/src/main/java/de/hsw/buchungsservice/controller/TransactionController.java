package de.hsw.buchungsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.hsw.buchungsservice.dto.Transaction;
import de.hsw.buchungsservice.dto.TransactionRequest;
import de.hsw.buchungsservice.service.TransactionService;

/**
 * REST-Controller fuer den TransactionService
 */

@RestController
@RequestMapping(path = "api/account/{iban}/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<Transaction> getTransaction(@RequestParam int id) {
        // TODO Errorhandling
        ResponseEntity<Transaction> responseEntity;
        responseEntity = ResponseEntity.ok(transactionService.getTransaction(id));
        return responseEntity;
    }

    @PostMapping
    public ResponseEntity<Transaction> addTransaction(@PathVariable String iban,
            @RequestBody TransactionRequest request) {
        // TODO Errorhandling
        Transaction newTransaction = transactionService.addTransaction(iban, request);
        ResponseEntity<Transaction> responseEntity;
        responseEntity = ResponseEntity.ok(transactionService.getTransaction(newTransaction.getTransactionId()));
        return responseEntity;
    }
}
