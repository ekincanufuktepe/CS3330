package edu.mu.shopping.user;

import java.util.ArrayList;

import edu.mu.shopping.payment.PaymentMethod;

public class OnlineShopper {
	
	private ArrayList<PaymentMethod> paymentMethodList;
	private String name;
	
	public OnlineShopper(String name) {
		this.setName(name);
		this.paymentMethodList = new ArrayList<PaymentMethod>();
	}
	
	public boolean addPaymentMethod(PaymentMethod paymentMethod) {
		return paymentMethodList.add(paymentMethod);
	}
	
	public PaymentMethod getPaymentMethodAt(int index) {
		if(paymentMethodList.size() > index) {
			System.out.println("You selected payment method: " + paymentMethodList.get(index).toString());
			return paymentMethodList.get(index);
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
