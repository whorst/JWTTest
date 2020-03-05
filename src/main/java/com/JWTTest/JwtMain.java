package com.JWTTest;

import com.JWTTest.SpringSecurity.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JwtMain {

	public static void main(String[] args) {
		SpringApplication.run(JwtMain.class, args);
	}
}


