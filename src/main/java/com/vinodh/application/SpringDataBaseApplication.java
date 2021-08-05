package com.vinodh.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vinodh.service.UserDetailService;

@SpringBootApplication
@ComponentScan(basePackages = "com.vinodh.*")
@EntityScan("com.vinodh.model")	
@EnableJpaRepositories(basePackages = "com.vinodh.repository")
public class SpringDataBaseApplication {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(UserDetailService.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringDataBaseApplication.class, args);
		logger.info("application started successfully.....");
	}

}
