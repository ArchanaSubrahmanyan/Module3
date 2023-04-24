package com.ust.mvc;

//https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping
	public String respond(Model model) {
		
		
		return "register";   //name of the view file
	}
}
