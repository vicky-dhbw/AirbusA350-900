package org.airbus.builder;

import java.util.ArrayList;
import java.util.List;

public class Section {

    protected List<SeatRow> seatRows;
    protected int numberOfSeatRows;
    public List<SeatRow> getSeatRows() {
        return seatRows;
    }

    public Section(){
        seatRows=new ArrayList<>();
    }

}
