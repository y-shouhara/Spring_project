package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {
	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("calculator")
	public String showCalculator() {
		return "calculator.html";
	}

	@GetMapping("computation")
	public String getComputation(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
			@RequestParam("operations") String operations, Model model) {
		String result = calculatorService.computation(num1, num2, operations);
		model.addAttribute("result", result);
		return "calculator.html";
	}

}
