package dev.updooters.updoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.updooters"})
@EntityScan(basePackages = {"dev.updooters.entities"})
@EnableJpaRepositories(basePackages = {"dev.updooters.repos"})
public class UpdootApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdootApplication.class, args);
	}

}
