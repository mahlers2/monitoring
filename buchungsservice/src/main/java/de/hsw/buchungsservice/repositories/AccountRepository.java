package de.hsw.buchungsservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.hsw.buchungsservice.dto.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, String> {
    
}
