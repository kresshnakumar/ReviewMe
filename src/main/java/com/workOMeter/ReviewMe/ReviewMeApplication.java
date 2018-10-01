package com.workOMeter.ReviewMe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({
	"com.workOMeter.login.Controller",
	"com.ReviewMe.serviceImpl"
})
public class ReviewMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewMeApplication.class, args);
	}
}
