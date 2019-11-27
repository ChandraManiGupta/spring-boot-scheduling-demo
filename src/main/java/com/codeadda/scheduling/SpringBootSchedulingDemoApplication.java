package com.codeadda.scheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootSchedulingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulingDemoApplication.class, args);
	}

}