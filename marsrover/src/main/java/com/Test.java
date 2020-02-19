package com;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(new South());
        System.out.println("current direction is " + car.getDirection());
        System.out.println("turn left, new direction is " + car.turnLeft().getDirection());
        System.out.println("turn right, new direction is " + car.turnRight().getDirection());
    }
}
