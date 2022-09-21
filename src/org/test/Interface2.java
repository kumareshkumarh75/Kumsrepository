package org.test;

public class Interface2 implements  InterfaceFullyAbstract {

	@Override
	public void login() {
		System.out.println("kumaresh");
	}

	@Override
	public void signup() {
		System.out.println("kumar");
	}

	@Override
	public void flightsearch() {
		System.out.println("flight");
		
	}
	public static void main(String[] args) {
		Interface2 ir=new Interface2();
		ir.flightsearch();
		ir.login();
		ir.signup();
				
				
				
	}

}
