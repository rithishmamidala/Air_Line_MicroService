package com.UST.AirlinesService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirlinesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesServiceApplication.class, args);
	}

}
