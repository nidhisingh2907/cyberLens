package com.ethics.cyberlens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class CyberlensApplication {
	public static void main(String[] args) {
		Postgres.setup();
		SpringApplication.run(CyberlensApplication.class, args);
	}
}