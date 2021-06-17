package com.example.BankAccount.entities;

import java.util.ArrayList;
import java.util.List;

public class History {
	
	// Liste des opérations efféctuée dans l'historique
	private List<Operation> operation;

	// Constructeur
	public History() {
		this.operation = new ArrayList<Operation>(); 
	}

	//Getter and Setter
	public List<Operation> getOperation() {
		return operation;
	}

	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}
	
	
	

}
