package com.example.BankAccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankAccount.BankAccountApplication;
import com.example.BankAccount.entities.Account;
import com.example.BankAccount.entities.History;
import com.example.BankAccount.entities.Operation;
import com.example.BankAccount.services.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	 /**
	    * Add - Put an operation to account according to type
	    * @return - An account with operation
	    */
	@PutMapping("/")
	public Account makeOperation(@RequestBody Operation operation) {
		
		if ( operation.getType().equals("deposit")) {
		return accountService.makeDeposit(BankAccountApplication.account, operation);
		} else if (operation.getType().equals("retreive")) {
			return accountService.retreive(BankAccountApplication.account, operation);
		}
		return null;
	}
	
	/**
	    * Read - Get a History of an account
	    * @return - History of an account
	    */
	@GetMapping("/")
	public History getHistory() {
		return accountService.getHistory(BankAccountApplication.account);
	}
}
