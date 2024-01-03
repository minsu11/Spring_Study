package org.parkminsu.spring.config;

import org.parkminsu.spring.animal.object.Cat;
import org.parkminsu.spring.animal.object.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("catBean")
    public Cat cat() {
        return new Cat();
    }

    @Bean("dogBean")
    public Dog dog() {
        return new Dog();
    }


}
