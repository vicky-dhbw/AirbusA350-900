package org.airbus.Visitor;

import org.airbus.builder.OverheadCompartment;
import org.airbus.builder.Seat;
import org.airbus.builder.Toilet;

public class CleaningRobot implements ICleaningProcedure {

    public void clean(Seat seat) {
        System.out.println("Cleaning the seat");
        seat.setClean(true);
    }

    public void clean(Touchscreen touchscreen) {
        System.out.println("Cleaning the touchscreen");
        touchscreen.setClean(true);
    }

    public void clean(OverheadCompartment overheadCompartment) {
        System.out.println("Cleaning the overhead compartment");
        overheadCompartment.setClean(true);
    }

    public void clean(Toilet toilet) {
        System.out.println("Cleaning the toilet");
        toilet.setClean(true);
    }

}
