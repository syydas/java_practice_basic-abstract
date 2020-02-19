package com;

public class Car implements ChooseDirection{
    private Direction direction;

    public Car(Direction direction) {
        this.direction = direction;
    }

    public char getDirection() {
        return direction.getDirection();
    }

    public Direction turnLeft() {
        return this.direction.turnLeft();
    }

    public Direction turnRight() {
        return this.direction.turnRight();
    }
}
