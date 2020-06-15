package com.repetenita.web.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.repetenita.web.startup")
public class StartupApplication {
	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(StartupApplication.class);
		sa.run(args);
	}
}