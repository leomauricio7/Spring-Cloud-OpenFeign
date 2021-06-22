package com.github.leomauricio7.client2.openfeigin2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Openfeigin2Application {

	public static void main(String[] args) {
		SpringApplication.run(Openfeigin2Application.class, args);
	}

}
