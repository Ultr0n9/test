package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		int z = 500;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		SpringApplication.run(TestApplication.class, args);
	}

}
