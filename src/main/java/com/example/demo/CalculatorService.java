package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiplication(double num1, double num2) {
		return num1 * num2;
	}
	
	public double division(double num1 , double num2) throws Exception {
		if(num2 == 0) {
			throw new ArithmeticException("Division by ZERO is not allowed!");
		}
		return num1 / num2;
	}
	public double modulus(double num1, double num2) {
		return num1%num2;
	}
}
