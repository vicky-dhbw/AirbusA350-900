package org.airbus.builder;

import org.airbus.Observer.SmokeDetector;
import org.airbus.Visitor.ICleanable;
import org.airbus.Visitor.ICleaningProcedure;

public class Toilet implements ICleanable {
    private boolean isClean;
    private final SmokeDetector smokeDetector;

    public Toilet(){
        smokeDetector=new SmokeDetector(this.getClass().hashCode());
    }

    public void accept(ICleaningProcedure cleaningProcedure) {
        cleaningProcedure.clean(this);
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean isClean) {
        this.isClean = isClean;
    }

    public SmokeDetector getSmokeDetector() {
        return smokeDetector;
    }
    public String createSmoke(){
        return "airsmoke";
    }
}
