package com.javaex.ex05;

public class Print {
	private int _num;
	private boolean _isTrue;
	private double _floatNum;
	private String _name;
	
	public Print() {
		
	}
	
	public Print(int num, boolean isTrue, double floatNum, String name) {
		this._num = num;
		this._isTrue = isTrue;
		this._floatNum = floatNum;
		this._name = name;
	}
	
	public void print() {
		System.out.printf("%d%n %b%n %.1f%n %s%n", _num, _isTrue, _floatNum, _name);
	}
}
