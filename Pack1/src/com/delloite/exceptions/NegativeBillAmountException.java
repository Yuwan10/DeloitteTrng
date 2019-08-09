package com.delloite.exceptions;

public class NegativeBillAmountException extends Exception {

	public NegativeBillAmountException() {

	}

	public NegativeBillAmountException(String message) {
		super(message);
		
	}

}
