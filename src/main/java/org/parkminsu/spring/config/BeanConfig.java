package org.parkminsu.spring.config;

import org.parkminsu.spring.animal.object.Cat;
import org.parkminsu.spring.animal.object.Dog;
import org.parkminsu.spring.annotation.AnimalClassfication;
import org.parkminsu.spring.annotation.AnimalName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("catBean")
    @AnimalClassfication(value = AnimalName.CAT)
    public Cat cat() {
        return new Cat();
    }

    @Bean("dogBean")
    @AnimalClassfication(value = AnimalName.DOG)
    public Dog dog() {
        return new Dog();
    }


}
