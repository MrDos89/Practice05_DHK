package com.javaex.ex07;

public class FriendInfo {
	String _name;
	String _phone;
	String _school;
	
	public FriendInfo() {
		
	}
	
	public FriendInfo(String name, String phone, String school) {
		this._name = name;
		this._phone = phone;
		this._school = school;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s \t 핸드폰:%s \t 학교:%s%n", _name, _phone, _school);
	}
}
