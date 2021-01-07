package com.footballheadz.footballheadz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.footballheadz.footballheadz.service"})
@EntityScan("com.footballheadz.footballheadz.model")
@EnableJpaRepositories("com.footballheadz.footballheadz.repository")
public class FootballheadzApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballheadzApplication.class, args);
        System.out.println("Server started...");
    }

}
