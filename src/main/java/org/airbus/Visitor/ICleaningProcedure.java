package org.airbus.Visitor;

import org.airbus.builder.OverheadCompartment;
import org.airbus.builder.Seat;
import org.airbus.builder.Toilet;

public interface ICleaningProcedure {
    void clean(Seat seat);
    void clean(Touchscreen touchscreen);
    void clean(OverheadCompartment overheadCompartment);
    void clean(Toilet toilet);

}
