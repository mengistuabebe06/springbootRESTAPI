package com.example.springbootRESTAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.springbootRESTAPI.Entity.Operation;
import com.example.springbootRESTAPI.Entity.User;
import com.example.springbootRESTAPI.Service.UserService;

@Controller
//@SessionAttributes(name=firstname)
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String register(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		return "register";
	}
	
	@PostMapping("/registeruser")
	public String registeruser(@ModelAttribute("user") User user, BindingResult result ,ModelMap model) {
		if(result.hasErrors()) {
			return "register"; 
		}
//		System.err.println("user data"+" " + user);
		model.put("user", user);
		userService.registerUser(user);
		return "home";
	}
	
//	@GetMapping("/cal")
//	public String operations(Model model) {
//		Operation operation = new Operation();
//		model.addAttribute("operation", operation);
//		return "operation";
//	}
//
//	@PostMapping("/operation")
//	public String operationNum(@ModelAttribute("operation") Operation operation, BindingResult result, ModelMap model) {
//		
//				
//		model.put("operation", operation);
//		
//		return "operation";
//	}
}
