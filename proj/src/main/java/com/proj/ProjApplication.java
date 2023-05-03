package com.proj;

import java.util.Date;import javax.enterprise.inject.Instance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjApplication.class, args);
		System.out.println("HEllo world");
		
	}

	@Bean
    CommandLineRunner runner(){
	return args ->{};
	}
}
