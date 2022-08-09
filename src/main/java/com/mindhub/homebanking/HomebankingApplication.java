
package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApplication {
	public HomebankingApplication() {
	}
	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepositories clientRepository, AccountRepository accountRepository) {
		return (args) -> {
			Client client1 = new Client("Santiago", "Argento", "santiargento03@gmail.com");
			Client client2 = new Client("Fernando", "Alonso", "fernandoalonso14@gmail.com");
			Account account1 = new Account("1241234", 1.2345213E7);
			clientRepository.save(client1);
			clientRepository.save(client2);
			accountRepository.save(account1);
		};
	}
}

