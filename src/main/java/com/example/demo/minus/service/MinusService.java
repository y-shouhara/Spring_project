package com.example.demo.minus.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {
	public String subtraction(int num1, int num2) {
		String result = String.valueOf(num1 - num2);
		return result;
	}
}
