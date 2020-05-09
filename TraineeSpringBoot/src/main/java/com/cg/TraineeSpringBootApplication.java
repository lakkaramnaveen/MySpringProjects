package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cg.trainee.dao")
public class TraineeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeSpringBootApplication.class, args);
	}

}
