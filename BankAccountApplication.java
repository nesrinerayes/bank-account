package com.example.BankAccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.BankAccount.entities.Account;

@SpringBootApplication
public class BankAccountApplication {

	public static Account account;
	
	public static void main(String[] args) {
		SpringApplication.run(BankAccountApplication.class, args);
		account = new Account();
	}

}
