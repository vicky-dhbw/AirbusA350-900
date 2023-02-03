package org.airbus.Mediator;

public class DoorMediator {
    private CabinDoor firstDoor;
    private CabinDoor secondDoor;

    public DoorMediator(CabinDoor firstDoor, CabinDoor secondDoor) {
        this.firstDoor = firstDoor;
        this.secondDoor = secondDoor;
    }

    public void openFirstDoor() {
        firstDoor.setOpen(true);
        secondDoor.setOpen(false);
    }

    public void openSecondDoor() {
        firstDoor.setOpen(false);
        secondDoor.setOpen(true);
    }



}
