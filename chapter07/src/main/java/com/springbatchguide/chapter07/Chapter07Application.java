package com.springbatchguide.chapter07;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class Chapter07Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter07Application.class, args);
	}

}
