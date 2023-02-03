package org.airbus.Mediator;

public class Door2 implements IDoor{
    private Mediator mediator;
    private boolean open;

    public Door2(Mediator mediator) {
        this.mediator = mediator;
        open = false;
    }

    public void open() {
        System.out.println("Door2 is open");
        open = true;
        mediator.notifyDoors();
    }


    public void close() {
        System.out.println("Door2 is closed");
        open = false;
        mediator.notifyDoors();
    }

    public boolean isOpen() {
        return open;
    }
}
