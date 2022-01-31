package com.kafunelu.dungeon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.kafunelu"})
public class KafuneluDungeonApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafuneluDungeonApplication.class, args);
	}

}
