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
	
	//getter, setter 작성
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	
	public String getPhone() {
		return _phone;
	}
	
	public void setPhone(String phone) {
		this._phone = phone;
	}
	
	public String getSchool() {
		return _school;
	}
	
	public void setSchool(String school) {
		this._school = school;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s \t 핸드폰:%s \t 학교:%s%n", _name, _phone, _school);
	}
}
