package com.aspire.java.oops.AbstractClass;

public class Child extends Parant{


	public void EnterUrl() {
		
		System.out.println("Enter Url");
		
	}

	@Override
	public void EnterLoginId() {
		System.out.println("Enter Login Id");		
	}

	@Override
	public void EnterPasswerd() {
		System.out.println("Enter Password");		
	}

	@Override
	public void AddItemToCart() {
		System.out.println("Add mobile to Cart");		
	}

	@Override
	public void Payment() {
		System.out.println("Make A Payment");		
	}

	@Override
	public void Logout() {
		System.out.println("Logout");		
	}
	
	
	

}
