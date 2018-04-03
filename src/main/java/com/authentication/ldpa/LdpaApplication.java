package com.authentication.ldpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class LdpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdpaApplication.class, args);
	}
}
