package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rk")
public class controllerclass {
	
	@GetMapping("/ok")
	public String wel () {
		System.out.println("inside");
		return "welcome to my first API";
	}

}
