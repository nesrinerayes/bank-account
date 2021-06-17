package com.example.BankAccount.services;

import org.springframework.stereotype.Service;

import com.example.BankAccount.controller.AccountController;
import com.example.BankAccount.entities.Account;
import com.example.BankAccount.entities.History;
import com.example.BankAccount.entities.Operation;

@Service
public class AccountService {

	
	// Fonction faire un dépôt sur le compte
	/*
	 * @params Account, operation
	 * @Return account 
	 */
	public Account makeDeposit(Account account, Operation operation) {
		double newBalance = account.getBalance() + operation.getAmount();
		account.setBalance(newBalance);
		account.setHistory(this.addOperationToHistory(account.getHistory(), operation));
		return account;
	}
	
	// Fonction faire un retrait sur le compte
		/*
		 * @params Account, operation
		 * @Return account 
		 */
	
	public Account retreive(Account account, Operation operation) {
		double newBalance = account.getBalance() - operation.getAmount();
		account.setBalance(newBalance);
		account.setHistory(this.addOperationToHistory(account.getHistory(), operation));
		return account;
	}
	
	// Fonction récupérer historique du compte
		/*
		 * @params Account
		 * @Return account 
		 */
	
	public History getHistory(Account account) {
		return account.getHistory();
		
	}
	
	// Fonction ajouter une opération àl'historique
			/*
			 * @params History, Operation
			 * @Return History 
			 */
		
	private History addOperationToHistory(History history, Operation operation) {
	
		history.getOperation().add(operation);
		return history;
	}
}
