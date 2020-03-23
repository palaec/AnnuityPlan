package com.lendico.annuityplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({ "com.lendico.controller,com.lendico.service", "controller", "service" })
public class AnnuityplanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnuityplanApplication.class, args);
	}

}
