package edu.mu.shopping.payment;

public class PayPalPayment implements PaymentMethod {

	private Double balance = 0.0;
	@Override
	public boolean authorizePayment(Double amount) {
		System.out.println("PayPal payment authorized");
		return true;
	}

	@Override
	public void processPayment(Double amount) {
		System.out.println("Payment processed!");
		balance += amount.doubleValue();
		System.out.println("PayPal balance is: " + balance);
	}

	@Override
	public String toString() {
		return "PayPalPayment [balance=" + balance + "]";
	}

	
}
