package com.example.cashcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//scanBasePackages configure the packages to be scanned
@SpringBootApplication(scanBasePackages = "com.example.cashcard")
public class CashcardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CashcardApplication.class, args);
	}

}
