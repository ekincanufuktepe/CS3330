package edu.mu.shopping;

import edu.mu.shopping.payment.CreditCardPayment;
import edu.mu.shopping.payment.PayPalPayment;
import edu.mu.shopping.user.OnlineShopper;

public class Main {

	public static void main(String[] args) {
		
		OnlineShopper user = new OnlineShopper("Ekin");
		Double amount = 2000.0;
		
		CreditCardPayment card = new CreditCardPayment(5000.0);
		user.addPaymentMethod(card);
		if(user.getPaymentMethodAt(0).authorizePayment(amount)) {
			user.getPaymentMethodAt(0).processPayment(amount);
		}
		
		user.addPaymentMethod(new PayPalPayment());
		if(user.getPaymentMethodAt(1).authorizePayment(amount)) {
			user.getPaymentMethodAt(1).processPayment(amount);
		}
		
//		if(card.authorizePayment(amount)) {
//			card.processPayment(amount);
//		}
//		
//		PayPalPayment paypal = new PayPalPayment();
//		if(paypal.authorizePayment(amount)) {
//			paypal.processPayment(amount);
//		}

	}

}
