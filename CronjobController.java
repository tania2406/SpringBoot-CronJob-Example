package com.example.Springboot_Cronjob_demo;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CronjobController {

	@RequestMapping("/test")
	public String test()
	{
		return "This is cron job test";
	}

	@Scheduled(fixedDelay=2000)// or use another class with @Configuration 
	public void testing()
	{
		System.out.println("action logged "+LocalDateTime.now());
	}

	@Scheduled(cron="*/2 * * * * *")   // note there must be 6 fields 
	public void testing1()
	{
		System.out.println("action taken "+LocalDateTime.now());
	}
	@Scheduled(cron="${job.cron.tania}") // check the application.properties file 
	public void tania()
	{
		System.out.println("hello cron job testing");

	}
}
