package com.ayush.payglocal.springbootdemorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.ayush.payglocal.springbootdemorestapi.model")
@SpringBootApplication
public class SpringBootDemoRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoRestapiApplication.class, args);
	}

}
