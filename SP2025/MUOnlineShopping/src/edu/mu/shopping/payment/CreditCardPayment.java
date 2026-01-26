package edu.mu.shopping.payment;

public class CreditCardPayment implements PaymentMethod {

	private Double cardLimit;
	private Double cardBalance = 0.0;
	
	public CreditCardPayment(Double cardLimit) {
		this.cardLimit = cardLimit;
	}
	
	@Override
	public boolean authorizePayment(Double amount) {
		if(amount > 5000) {
			System.out.println("Payment not authorized!");
			return false;
		}
		System.out.println("Payment authorized!");
		return true;
	}

	@Override
	public void processPayment(Double amount) {	
		if((cardLimit.doubleValue() - cardBalance.doubleValue()) > amount.doubleValue()) {
			cardBalance += amount.doubleValue();
			System.out.println("Your current balance is: " + cardBalance.doubleValue());
		}
		else {
			System.out.println("You have reached your card limit!");
		}
	}

	@Override
	public String toString() {
		return "CreditCardPayment [cardLimit=" + cardLimit + ", cardBalance=" + cardBalance + "]";
	}
	
	

}
