package com.remorides.remorides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.remorides.remorides")
@SpringBootApplication
public class RemoridesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoridesApplication.class, args);
	}

}
