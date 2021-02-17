package com.poc.MoviesInfoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class MoviesInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesInfoServiceApplication.class, args);
	}

}
