package org.parkminsu.spring.config;

import org.parkminsu.spring.animal.Animal;
import org.parkminsu.spring.annotation.AnimalClassfication;
import org.parkminsu.spring.annotation.AnimalName;
import org.parkminsu.spring.service.AnimalService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    private final Animal animal;

    public JavaConfig(@AnimalClassfication(value = AnimalName.CAT) Animal animal) {
        this.animal = animal;
    }

    @Bean("animalService")
    public AnimalService animalService() {
        return new AnimalService(animal);
    }


}
