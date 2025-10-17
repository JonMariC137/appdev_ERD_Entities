package com.example.appdevf2.erd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.appdevf2.repository")
@EntityScan(basePackages = "com.example.appdevf2.entity")
@ComponentScan(basePackages = "com.example.appdevf2")  // also needed for services/controllers
public class ErdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErdApplication.class, args);
	}

}
