package com.example.springbootRESTAPI.Entity;


public class Operation {
	
	private int num1;
	private int num2;
	private String sign;
	
	public Operation() {
		super();
	}

	public Operation(int num1, int num2, String sign) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.sign = sign;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
}
