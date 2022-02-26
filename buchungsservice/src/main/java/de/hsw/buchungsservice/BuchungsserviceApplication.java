package de.hsw.buchungsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import de.hsw.buchungsservice.dto.Account;
import de.hsw.buchungsservice.dto.Depottransaction;
import de.hsw.buchungsservice.dto.Transaction;

import de.hsw.buchungsservice.repositories.AccountRepository;
import de.hsw.buchungsservice.repositories.DepottransactionRepository;
import de.hsw.buchungsservice.repositories.TransactionRepository;

@SpringBootApplication
public class BuchungsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuchungsserviceApplication.class, args);
	}

	@Component
	public final class RedisRunner
			implements CommandLineRunner {

		private AccountRepository accountRepository;
		private DepottransactionRepository depottransactionRepository;
		private TransactionRepository transactionRepository;

		@Autowired
		public RedisRunner(AccountRepository accountRepository, DepottransactionRepository depottransactionRepository,
				TransactionRepository transactionRepository) {
			this.accountRepository = accountRepository;
			this.depottransactionRepository = depottransactionRepository;
			this.transactionRepository = transactionRepository;
		}

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			accountRepository.save(new Account("123456", "123", 1, "creationDate", true, true));
			accountRepository.save(new Account("456789", "456", 20, "creationDate", false, true));
			accountRepository.save(new Account("123789", "789", 1000, "creationDate", false, true));
			accountRepository.save(new Account("456123", "101", 15, "creationDate", true, true));

			// accountRepository.save(new Account(iban, customerId, balance, creationDate,
			// clearingAccount, capableForTransaction))

			depottransactionRepository.save(new Depottransaction(357, "accountId", 5, null));
			depottransactionRepository.save(new Depottransaction(159, "accountId", 80, null));
			depottransactionRepository.save(new Depottransaction(852, "accountId", 100, null));

			// depottransactionRepository.save(new Depottransaction(transactionId,
			// accountId, amount, timestamp));

			transactionRepository.save(new Transaction(987, "123", "789", 1, null, "usage"));
			transactionRepository.save(new Transaction(654, "456", "101", 2, null, "usage"));
			transactionRepository.save(new Transaction(321, "789", "123", 3, null, "usage"));

			// transactionRepository.save(new Transaction(transactionId, senderId,
			// receiverId, amount, timestamp, usage));

		}
	}

	// AccountRepository.deleteAll();
	// DepottransactionRepository.deleteAll();
	// TransactionRepository.deleteAll();

}
