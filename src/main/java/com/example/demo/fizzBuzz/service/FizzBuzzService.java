package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
	public List<String> fizzBuzz(int fizz, int buzz) {
		List<String> fizzBuzzList = new ArrayList<String>();
		int fizzBuzz = fizz * buzz;

		for (int i = 0; i <= 100; i++) {
			if (i % fizzBuzz == 0) {
				fizzBuzzList.add("FizzBuzz");
			} else if (i % buzz == 0) {
				fizzBuzzList.add("Buzz");
			} else if (i % fizz == 0) {
				fizzBuzzList.add("Fizz");
			} else {
				fizzBuzzList.add(String.valueOf(i));
			}
		}

		return fizzBuzzList;
	}
}
