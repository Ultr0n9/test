package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		int x = 100;
		int y= 200;
		int z = 500;
		float i=12;
		int f=890;

		SpringApplication.run(TestApplication.class, args);
	}

}
