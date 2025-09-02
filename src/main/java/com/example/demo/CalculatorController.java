package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
	
	CalculatorService ref;
	@Autowired
	public CalculatorController(CalculatorService ref) {
		super();
		this.ref = ref;
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@PostMapping("/calc")
	public String calculate(@RequestParam("num1") double n1,     // for getting from userInterface
											@RequestParam("num2") double n2,
											@RequestParam("operation") String operation,
											Model m) {
			double result = 0;
			
			switch(operation) {
			case "add":
				result = ref.add(n1, n2);
				break;
				
			case "sub":
				result = ref.subtraction(n1, n2);
				break;
				
			case "mul":
				result = ref.multiplication(n1, n2);
				break;
				
			case "div":
				if (n2 != 0) {
					try {
					result = ref.division(n1, n2);
					} catch(Exception e) {
						m.addAttribute("num1", n1);
						m.addAttribute("num2", n2);
						m.addAttribute("result", "Division by zero is not allowed!");
						return "result";
					}
				}
				break;
				
			case "mod":
				result=ref.modulus(n1, n2);
				break;
				
			default:
				m.addAttribute("error", "Invalid operation!");
				return "result";
			}
		m.addAttribute("num1", n1);  // for giving to userInterface
		m.addAttribute("num2", n2);
		m.addAttribute("operation", operation);
		m.addAttribute("result", result);
		
		return "calculate";
	}
}
