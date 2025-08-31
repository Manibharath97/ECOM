package com.codesnippet.ecom.service;

public class CreditCardService implements PaymentService{

	@Override
	public void processPayment(double amount) {
		System.out.println("CreditCard payment processing");
	}

}
