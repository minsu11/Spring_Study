package org.parkminsu.spring.service;

import org.parkminsu.spring.animal.Animal;


public class AnimalService {
    private Animal animal;

    public AnimalService(Animal animal) {
        this.animal = animal;
    }

    public void printSpeed(int speed) {
        animal.speed(speed);
    }
}
