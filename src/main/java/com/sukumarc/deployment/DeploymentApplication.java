package com.sukumarc.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentApplication.class, args);
	}

}

@RestController
class TestController {
   @RequestMapping(value = "/test")
   public String test() {
      return "Hello Sukumar";
   }   
}
