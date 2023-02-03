package org.airbus.builder;

import org.airbus.chainOfResponsibility.Steward;

import java.util.ArrayList;
import java.util.List;

public class Section {
    protected Steward steward;
    protected List<SeatRow> seatRows;
    protected int numberOfSeatRows;
    public List<SeatRow> getSeatRows() {
        return seatRows;
    }

    public Section(){
        seatRows=new ArrayList<>();
        steward=new Steward();
    }

}
