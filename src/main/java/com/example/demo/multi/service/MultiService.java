package com.example.demo.multi.service;

import org.springframework.stereotype.Service;

@Service
public class MultiService {
	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}
}
