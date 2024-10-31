package com.example.Springboot_Cronjob_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class SpringbootCronjobDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCronjobDemoApplication.class, args);
	}

}
