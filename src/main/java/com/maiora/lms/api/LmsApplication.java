package com.maiora.lms.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.maiora.lms.api"})
@EntityScan("com.maiora.lms.api.model")
@EnableJpaRepositories("com.maiora.lms.api.repository")
public class LmsApplication extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
		return builder.sources(LmsApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

	
}
