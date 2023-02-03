package org.airbus.builder;

import org.airbus.Visitor.ICleanable;
import org.airbus.Visitor.ICleaningProcedure;

public class Seat implements ICleanable {
    protected final String seatID;
    protected final TwoPinSocket twoPinSocket;
    public String getSeatID() {
        return seatID;
    }

    public Seat(int rowNumber, SeatColumn seatColumn){
        this.seatID=Integer.toString(rowNumber)+seatColumn.toString();
        twoPinSocket=new TwoPinSocket();
    }

    public TwoPinSocket getTwoPinSocket() {
        return twoPinSocket;
    }


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
