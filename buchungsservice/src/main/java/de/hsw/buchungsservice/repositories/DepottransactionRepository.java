package de.hsw.buchungsservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.hsw.buchungsservice.dto.Depottransaction;

@Repository
public interface DepottransactionRepository extends CrudRepository<Depottransaction, Integer> {
    
}
