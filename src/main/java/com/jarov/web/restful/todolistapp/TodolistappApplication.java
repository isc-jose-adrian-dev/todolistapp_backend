package com.jarov.web.restful.todolistapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TodolistappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistappApplication.class, args);
	}

}
