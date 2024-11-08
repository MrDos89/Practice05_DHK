package com.javaex.ex09;

public class StringUtil {
	private String resultString = "";
	
	
	public StringUtil() {
		
	}
	
	public StringUtil(String ... strings) {
		for(String str : strings) {
			resultString += str;
		}
	}
	
	public String getResult() {
		return resultString;
	}
}
