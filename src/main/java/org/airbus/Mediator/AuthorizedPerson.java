package org.airbus.Mediator;

import org.airbus.composite.CrewMember;

public class AuthorizedPerson {
    private DoorMediator doorMediator;

    public AuthorizedPerson(DoorMediator doorMediator) {
        this.doorMediator = doorMediator;
    }

    public void enterCabin() {
        doorMediator.openFirstDoor();
        System.out.println("First door is open, second door is closed");
        System.out.println("Authorized person entering cabin");
        doorMediator.openSecondDoor();
        System.out.println("Second door is open, first door is closed");
        System.out.println("Authorized person entering sleeping compartment");
    }

    public void exitCabin() {
        doorMediator.openSecondDoor();
        System.out.println("Second door is open, first door is closed");
        System.out.println("Authorized person exiting sleeping compartment");
        doorMediator.openFirstDoor();
        System.out.println("First door is open, second door is closed");
        System.out.println("Authorized person exiting cabin");
    }

}
