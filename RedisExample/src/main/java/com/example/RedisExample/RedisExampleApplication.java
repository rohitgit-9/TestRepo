package com.example.RedisExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisExampleApplication.class, args);
		System.out.println("test12");
	}

}
