package ru.nsu.manager.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "ru.nsu")
@ComponentScan(basePackages = "ru.nsu")
@EnableJpaRepositories(basePackages = "ru.nsu")
public class TaskManagerConfiguration {
}
