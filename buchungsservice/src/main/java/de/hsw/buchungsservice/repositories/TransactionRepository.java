package de.hsw.buchungsservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.hsw.buchungsservice.dto.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
    
}
