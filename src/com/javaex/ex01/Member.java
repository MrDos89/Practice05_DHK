package com.javaex.ex01;

public class Member {
	// field
	private String _id;
	private String _name;
	private int _point;
	
	// Constructor
	public Member() {
		
	}
	
	// getter, setter
	public String getID() {
		return _id;
	}
	
	public void setID(String id) {
		this._id = id;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		this._name = name;
	}
	
	public int getPoint() {
		return _point;
	}
	
	public void setPoint(int point) {
		this._point = point;
	}
	
	public void showInfo() {
		System.out.printf("회원정보: %s(%s), %d점%n", _name, _id, _point);
	}
}
