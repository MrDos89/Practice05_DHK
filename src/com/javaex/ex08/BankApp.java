package com.javaex.ex08;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		
		while(true) {
			if(bank.init() == true) {
				break;
			}
		}
	}

}
