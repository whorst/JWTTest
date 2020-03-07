package com.JWTTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class JwtMain {

	public static void main(String[] args) {
		SpringApplication.run(JwtMain.class, args);
	}
}


