package org.airbus.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<IDoor> doors = new ArrayList<>();

    public void addDoor(IDoor door) {
        doors.add(door);
    }

    public void enter() {
        doors.get(0).close();
        doors.get(1).open();
    }

    public void exit() {
        doors.get(0).open();
        doors.get(1).close();
    }

    public void notifyDoors() {
        if (doors.get(0).isOpen()) {
            doors.get(1).close();
        } else {
            doors.get(1).open();
        }
    }
}
