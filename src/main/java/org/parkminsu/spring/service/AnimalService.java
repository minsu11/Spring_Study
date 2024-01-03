package org.parkminsu.spring.service;

import org.parkminsu.spring.animal.Animal;


public class AnimalService {
    private Animal animal;

    public AnimalService() {
    }

    public void printSpeed(int speed) {
        animal.speed(speed);
    }
}
