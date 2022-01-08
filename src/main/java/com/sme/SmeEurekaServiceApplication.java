package com.sme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmeEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmeEurekaServiceApplication.class, args);
	}

}
