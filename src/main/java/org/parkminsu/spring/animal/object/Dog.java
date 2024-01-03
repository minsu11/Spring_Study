package org.parkminsu.spring.animal.object;

import org.parkminsu.spring.animal.Animal;

public class Dog implements Animal {
    private int speed;

    private final String name = "dog";

    public Dog() {
    }

    @Override
    public void speed(int speed) {
        this.speed = speed;
        System.out.println(this.speed);
    }
}
