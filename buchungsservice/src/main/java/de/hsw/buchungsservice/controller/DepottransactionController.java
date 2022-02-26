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

import de.hsw.buchungsservice.dto.Depottransaction;
import de.hsw.buchungsservice.dto.DepottransactionRequest;
import de.hsw.buchungsservice.service.DepotTransactionService;

/**
 * REST-Controller fuer den DepottransactionService
 */

@RestController
@RequestMapping(path = "api/account/{iban}/depottransaction")
public class DepottransactionController {

    @Autowired
    private DepotTransactionService depotTransactionService;

    @GetMapping
    public ResponseEntity<Depottransaction> getTransaction(@RequestParam int id) {
        // TODO Errorhandling
        ResponseEntity<Depottransaction> responseEntity;
        responseEntity = ResponseEntity.ok(depotTransactionService.getTransaction(id));
        return responseEntity;
    }

    @PostMapping
    public ResponseEntity<Depottransaction> addTransaction(@PathVariable String iban,
            @RequestBody DepottransactionRequest request) {
        // TODO Errorhandling
        Depottransaction newTrDepottransaction = depotTransactionService.addTransaction(iban, request);
        ResponseEntity<Depottransaction> responseEntity;
        responseEntity = ResponseEntity
                .ok(depotTransactionService.getTransaction(newTrDepottransaction.getTransactionId()));
        return responseEntity;
    }
}