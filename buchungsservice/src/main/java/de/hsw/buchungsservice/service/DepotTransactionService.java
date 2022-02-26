package de.hsw.buchungsservice.service;

import org.springframework.stereotype.Service;

import de.hsw.buchungsservice.dto.Depottransaction;
import de.hsw.buchungsservice.dto.DepottransactionRequest;
import de.hsw.buchungsservice.repositories.DepottransactionRepository;

/**
 * Service fuer die Depotbuchung
 */
@Service
public class DepotTransactionService {
    
    private DepottransactionRepository depottransactionRepository;

    public Depottransaction getTransaction(int id) {
        return depottransactionRepository.findById(id).orElseThrow();
    }

    public Depottransaction addTransaction(String id, DepottransactionRequest request) {
        //TODO muss noch umgesetzt werden
        return null;
    }
}
