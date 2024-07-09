package com.ashay.experiments.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class BackendApplication {

	private final Random random = new Random();

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}


	@GetMapping("/randomWithDelay")
	public String getRandomNumber() {
		var delay = random.nextInt(500);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Random number is " + delay;
	}

}
