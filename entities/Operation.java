package com.example.BankAccount.entities;

import java.util.Date;

public class Operation {

	// Le montant du compte
	private double amount;
	// La date de l'opération
	private Date date;
	// Type de l'opération (dépot ou retrait)
	private String type;
	
	//Constructeur
	public Operation(double amount, String type) {
		this.amount = amount;
		this.type = type;
		this.date = new Date();
	}	
	
	//Getter and setter
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
