package com.javaex.ex08;

import java.util.Scanner;

public class Bank {
	private String _accountNo;
	private double _money; 
	Scanner sc;
	
	Bank() {
		sc = new Scanner(System.in);
		
		String firstAccountNum = "";
		int firstNum = (int)(Math.random()*999) + 1;
		
		if(firstNum < 10) {
			firstAccountNum = String.format("00%d", firstNum);
		} else if (firstNum < 100) {
			firstAccountNum = String.format("0%d", firstNum);
		} else {
			firstAccountNum = String.format("%d", firstNum);
		}
		
		String secondAccountNum = "";
		int secondNum = (int)(Math.random()*999) + 1;
		
		if(secondNum < 10) {
			secondAccountNum = String.format("0000%d", secondNum);
		} else if (secondNum < 100) {
			secondAccountNum = String.format("000%d", secondNum);
		} else if (secondNum < 1000) {
			secondAccountNum = String.format("00%d", secondNum);
		} else if (secondNum < 10000) {
			secondAccountNum = String.format("0%d", secondNum);
		} else {
			secondAccountNum = String.format("%d", secondNum);
		}
		
		String thirdAccountNum = "";
		int thirdNum = (int)(Math.random()*999) + 1;
		
		if(thirdNum < 10) {
			thirdAccountNum = String.format("00000%d", thirdNum);
		} else if (thirdNum < 100) {
			thirdAccountNum = String.format("0000%d", thirdNum);
		} else if (thirdNum < 1000) {
			thirdAccountNum = String.format("000%d", thirdNum);
		} else if (thirdNum < 10000) {
			thirdAccountNum = String.format("00%d", thirdNum);
		} else if (thirdNum < 100000) {
			thirdAccountNum = String.format("0%d", thirdNum);
		} else {
			thirdAccountNum = String.format("%d", thirdNum);
		}
		
		_accountNo = firstAccountNum +"-"+ secondAccountNum +"-"+ thirdAccountNum;
		
		System.out.println(_accountNo + " 계좌가 개설되었습니다.");
		System.out.println();
	}
	
	public boolean init() {
		System.out.println("------------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("------------------------------------");
		
		System.out.print("선택>");
		int selectIdx = sc.nextInt();
		
		switch(selectIdx)
		{
			case 1:
				increaseBudget();
				break;
			case 2:
				decreaseBudget();
				break;
			case 3:
				checkBudget();
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시입력해주세요");
				break;
		}
		
		if(selectIdx == 4) {
			sc.close();
			return true;
		} else {
			return false;
		}
	}
	
	private void increaseBudget() {
		System.out.print("예금액>");
		double money = sc.nextDouble();
		
		this._money += money;
	}
	
	private void decreaseBudget() {
		System.out.print("출금액>");
		double money = sc.nextDouble();
		
		if(money > this._money || money < 0) {
			System.out.println("입력한 금액이 잘못되었습니다. 다시 입력해주세요.");
			return;
		}
		
		this._money -= money;
	}
	
	private void checkBudget() {
		System.out.print("잔고액>");
		System.out.println(this._money);
	}
}
