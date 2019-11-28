package com.basic.rest.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicRestWebServerApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(BasicRestWebServerApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		springApplication.run(args);
	}

}
