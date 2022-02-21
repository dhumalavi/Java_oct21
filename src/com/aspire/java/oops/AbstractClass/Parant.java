package com.aspire.java.oops.AbstractClass;

abstract public class Parant {
	
	public void OpenBrowser()
	
	{
		System.out.println("Open Chrome Browser");
	}
	
	abstract public void EnterUrl();
	
	abstract public void EnterLoginId();
	abstract public void EnterPasswerd();
	abstract public void AddItemToCart();
	abstract public void Payment();
	abstract public void Logout();

}
