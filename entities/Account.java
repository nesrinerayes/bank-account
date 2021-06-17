package com.example.BankAccount.entities;

public class Account {

	//solde du compte
	private double balance;
	// Historique du compte
	private History history;
	
	// constructor
	public Account() {
		this.balance = 0.0; 
		this.history = new History();
	};
	
	// getter and setter
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public History getHistory() {
		return history;
	}
	public void setHistory(History history) {
		this.history = history;
	}
	
	
}
