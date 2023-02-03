package org.airbus.Visitor;

public class Touchscreen {
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
