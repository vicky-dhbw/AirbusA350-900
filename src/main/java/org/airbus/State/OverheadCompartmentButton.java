package org.airbus.State;

public class OverheadCompartmentButton {

    private OverheadCompartmentStatus status;

    public OverheadCompartmentButton() {
        status = OverheadCompartmentStatus.CLOSED;
    }

    public void press() {
        if (status == OverheadCompartmentStatus.CLOSED) {
            status = OverheadCompartmentStatus.OPEN;
        } else {
            status = OverheadCompartmentStatus.CLOSED;
        }
    }
    }
