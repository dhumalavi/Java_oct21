package com.aspire.java.oops.generalization;

public class Jio extends Generalizedclass {
	
	public void Hotstar()
	{		
		System.out.println("1 Month Free Subscription");
	}

	@Override
	public void audiocalling() {
		System.out.println("Unlimited calling for 1 Month");		
	}

	@Override
	public void sms() {
		System.out.println("100 sms free for 1 month");		
	}

	@Override
	public void internet() {
		System.out.println("2 gb net for 1 month");		
	}

}
