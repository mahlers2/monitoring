package de.hsw.buchungsservice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.hsw.buchungsservice.dto.Transaction;
import de.hsw.buchungsservice.service.TransactionService;

/**
 * REST-Controller fuer Transactions
 */

@RestController
@RequestMapping(path = "api/customer/{id}")
public class TransactionsController {

    @Autowired
    TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>> getTransactions(@RequestParam Date start, @RequestParam Date end) {
        // TODO Errorhandling
        ResponseEntity<List<Transaction>> responseEntity;
        responseEntity = ResponseEntity.ok(transactionService.getTransactions(start, end));
        return responseEntity;
    }
}
