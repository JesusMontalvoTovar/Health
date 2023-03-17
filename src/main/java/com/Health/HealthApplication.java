package com.Health;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.Health.Model"})  // scan JPA entities
public class HealthApplication {
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}


	public static void main(String[] args) {
		SpringApplication.run(HealthApplication.class, args);
	}

}
