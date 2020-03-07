package com.w.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemoApplication.class, args);
	}
	
	
	@RequestMapping("/users")
	String getMessage() {
		return "Hello User...";
	}
	
	@RequestMapping("/admin")
	String getMessageAdmin() {
		return "Hello Admin...";
	}
	
	@RequestMapping("/")
	String getMessagePublic() {
		return "Hello everyone out there in the public...";
	}
	
	
	

}
