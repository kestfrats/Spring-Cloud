package com.kestsoft.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4WordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4WordsApplication.class, args);
	}

}

