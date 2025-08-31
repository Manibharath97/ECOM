package com.codesnippet.ecom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codesnippet.ecom.service.CreditCardService;
import com.codesnippet.ecom.service.GpayService;
import com.codesnippet.ecom.service.PaymentService;

@Configuration
public class PaymentConfig {

	@Bean
	public PaymentService creditCardPaymentService() {
		return new CreditCardService();
	}
	
	@Bean
	public PaymentService gpayPaymentService() {
		return new GpayService();
	}
}
