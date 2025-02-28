package edu.mu.shopping.payment;

public interface PaymentMethod {
	
	public boolean authorizePayment(Double amount);
	public void processPayment(Double amount);

}
