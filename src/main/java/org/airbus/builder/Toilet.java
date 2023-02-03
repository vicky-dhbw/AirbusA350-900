package org.airbus.builder;

import org.airbus.Visitor.ICleanable;
import org.airbus.Visitor.ICleaningProcedure;

public class Toilet implements ICleanable {
    private boolean isClean;

    public void accept(ICleaningProcedure cleaningProcedure) {
        cleaningProcedure.clean(this);
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean isClean) {
        this.isClean = isClean;
    }
}
