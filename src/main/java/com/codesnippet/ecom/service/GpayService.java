package com.codesnippet.ecom.service;

public class GpayService implements PaymentService{

	@Override
	public void processPayment(double amount) {
		System.out.println("Gpay payment processing");
	}

}
