package com.javaex.ex06;

public class MoneyConverter {
	static double ratio;

	static {
		ratio = 0.00072; // 1원당 달러
	}
	
	public MoneyConverter() {
		
	}
	
	public void convertWonToDollar(double won) {
		double dollar = won * ratio;
		
		System.out.printf("%,.0f원은 %,.1f달러입니다.%n", won, dollar);
	}
	
	public void convertDollarToWon(double dollar) {
		double won = dollar / ratio;
		
		System.out.printf("%,.1f달러는 %,.0f원입니다.%n", dollar, won);
	}
}
