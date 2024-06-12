package org.example;

public class ElevatorCar {
    public Integer id;
    Display display;
    ElevatorState elevatorState;
    InternalButtons internalButton ;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;


    public boolean moveToNextFloor(int targetFloor , Direction direction){
        int startPoint=currentFloor;
        if(direction.equals(Direction.UP)) {
            for (int i = startPoint; i <= targetFloor; i++) {
                this.currentFloor = i;
                setdisplay();
                showDisplay();
            }
            return true;
        }
        if(direction.equals(Direction.DOWN)){
            for (int i = startPoint; i >= targetFloor; i--) {
                this.currentFloor = i;
                setdisplay();
                showDisplay();
            }
            return true;
        }
        return false;

    }

    private void showDisplay() {
        this.display.showDisplay();
    }

    private void setdisplay() {
        this.display.setFloor(this.currentFloor);
        this.display.setDirection(elevatorDirection);
    }
}
