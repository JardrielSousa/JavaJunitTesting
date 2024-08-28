package com.course.unity.test;

public class SimpleCalc {
	public double sum(double num , double num2) {
		return num + num2;
	}
	
	public double sub(double num , double num2){
		return num - num2;
	}
	
	public double multiplication(double num,double num2) {
		return num * num2;
	}
	
	public double division(double num , double num2) {
		if(num == 0 || num2 == 0) throw new ArithmeticException("Impossible to divide by zero!");
		return num/num2;
	}
	
	public double squareRoot(double number) {
		return Math.sqrt(number);
	}
}
