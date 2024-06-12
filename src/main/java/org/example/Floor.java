package org.example;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    int  floorList;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorList) {
        this.floorList = floorList;
        externalDispatcher = new ExternalDispatcher();
    }

    public int getFloorList() {
        return floorList;
    }

    public void setFloorList(int floorList) {
        this.floorList = floorList;
    }
}
