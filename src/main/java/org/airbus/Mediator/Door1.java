package org.airbus.Mediator;

public class Door1 implements IDoor {
    private Mediator mediator;
    private boolean open;

    public Door1(Mediator mediator) {
        this.mediator = mediator;
        open = false;
    }

    public void open() {
        System.out.println("Door1 is open");
        open = true;
        mediator.notifyDoors();
    }

    public void close() {
        System.out.println("Door 1 is closed");
        open = false;
        mediator.notifyDoors();
    }

    public boolean isOpen() {
        return open;
    }



}
