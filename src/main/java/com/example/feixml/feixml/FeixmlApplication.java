package com.example.feixml.feixml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeixmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeixmlApplication.class, args);
	}

}
