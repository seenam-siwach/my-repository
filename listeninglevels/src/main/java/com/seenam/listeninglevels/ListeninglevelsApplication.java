package com.seenam.listeninglevels;

import com.seenam.listeninglevels.entity.Levels;
import com.seenam.listeninglevels.repository.LevelsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ListeninglevelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListeninglevelsApplication.class, args);
	}

	@Bean
	CommandLineRunner init(LevelsRepository levelsRepository) {
		return args -> {
			levelsRepository.save(new Levels("arnav", "Internal"));
			levelsRepository.save(new Levels("arnav", "Focused"));
			levelsRepository.save(new Levels("seenam", "Global"));
			levelsRepository.save(new Levels("seenam", "Internal"));
		};
	}
}
