package com.example.springbootRESTAPI.CalController;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springbootRESTAPI.Entity.Operation;
import com.example.springbootRESTAPI.Service.UserService;



@Controller
public class OperaionController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/cal")
	public String operationCal(Model model) {
		Operation operation = new Operation();
		model.addAttribute("operation", operation);
		return "operation";
	}
	
//	@PostMapping("/operationCal")
	@RequestMapping(value="/operationCal", params="add", method = RequestMethod.POST)
	public String add(@ModelAttribute("operation") Operation operation, ModelMap model) {
		model.addAttribute("result", userService.add(operation));
		return "operation";
	}
	@RequestMapping(value = "/operationCal", params="sub", method = RequestMethod.POST)
	public String sub(@ModelAttribute("operation") Operation operation, ModelMap model) {
		model.addAttribute("result", userService.sub(operation));
		return "operation";
	}
	
	@RequestMapping(value = "/operationCal", params = "mul", method = RequestMethod.POST)
	public String mul(@ModelAttribute("operation") Operation operation, ModelMap model) {
		model.addAttribute("result", userService.mul(operation));
		return "operation";
	}
	@RequestMapping(value = "/operationCal", params = "div", method = RequestMethod.POST)
	public String div(@ModelAttribute("operation") Operation operation, ModelMap model) {
		model.addAttribute("result", userService.div(operation));
		return "operation";
	}
}
