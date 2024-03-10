package com.robert_neat.note_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.robert_neat.note_api")
public class NoteApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(NoteApiApplication.class, args);
	}
}
