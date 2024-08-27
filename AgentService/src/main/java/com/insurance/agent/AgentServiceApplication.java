package com.insurance.agent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class AgentServiceApplication {

	public static void main(String[] args) {
		System.out.println("This is agent service");
		SpringApplication.run(AgentServiceApplication.class, args);
	}

}
