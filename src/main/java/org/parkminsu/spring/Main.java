package org.parkminsu.spring;

import org.parkminsu.spring.service.AnimalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.parkminsu.spring");
        AnimalService animal = context.getBean("animalService", AnimalService.class);
        animal.printSpeed(5);

    }
}