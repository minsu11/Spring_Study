package org.parkminsu.spring.animal.object;

import org.parkminsu.spring.animal.Animal;

public class Cat implements Animal {
    private int speed;
    private final String name = "cat";

    @Override
    public void speed(int speed) {
        this.speed = speed;
        System.out.println(name + "속도 : " + this.speed);

    }
}
