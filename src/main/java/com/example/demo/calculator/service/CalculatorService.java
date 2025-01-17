package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public String computation(int num1, int num2, String operations) {
		String result = "";
		try {
			if (operations.equals("addition")) {
				result = String.valueOf(num1 + num2);
			} else if (operations.equals("subtraction")) {
				result = String.valueOf(num1 - num2);
			} else if (operations.equals("multiplication")) {
				result = String.valueOf(num1 * num2);
			} else if (operations.equals("division")) {
				result = String.valueOf(num1 / num2);
			}
		} catch (ArithmeticException e) {
			result = "ゼロ除算はできません";
		}
		return result;
	}
}
