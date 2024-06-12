package org.example;

public class Display {
    int floor;
    Direction direction;
    public Display(int floor , Direction direction){
        this.floor=floor;
        this.direction=direction;
    }
    public void showDisplay(){
        System.out.println(this.floor);
        System.out.println(this.direction);
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
