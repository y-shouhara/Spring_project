package com.example.demo.fizzBuzz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {
	private final FizzBuzzService fizzBuzzService;

	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}

	@GetMapping("fizzBuzz")
	public String fizzBuzz(Model model) {
		System.out.println("来たよ");
		List<String> fizzBuzzList = new ArrayList<String>();

		fizzBuzzList = fizzBuzzService.fizzBuzz(3, 5);
		model.addAttribute("fizzBuzzList", fizzBuzzList);
		return "fizzBuzz.html";
	}

}
