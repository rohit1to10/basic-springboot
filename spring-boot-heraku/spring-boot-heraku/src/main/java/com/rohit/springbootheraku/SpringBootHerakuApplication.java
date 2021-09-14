package com.rohit.springbootheraku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class SpringBootHerakuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHerakuApplication.class, args);
	}

}
