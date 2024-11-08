package com.javaex.ex02;

public class Goods {
	private String name;
	private int price;
	
	//basic constructor를 부르는 객체가 있으니 있어야 됨
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
//	private void setName(String name) {
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
}
