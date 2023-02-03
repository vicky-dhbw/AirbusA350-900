package org.airbus.builder;

import org.airbus.chainOfResponsibility.Steward;

import java.util.ArrayList;
import java.util.List;

public class Section {

    protected Steward steward;
    protected List<SeatRow> seatRows;
    protected int numberOfSeatRows;
    protected BookingClass bookingClass;

    public BookingClass getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(BookingClass bookingClass) {
        this.bookingClass = bookingClass;
    }

    public List<SeatRow> getSeatRows() {
        return seatRows;
    }

    public Section(){
        seatRows=new ArrayList<>();
    }
    public Steward getSteward() {
        return steward;
    }

    public void setSteward(Steward steward) {
        this.steward = steward;
    }

}
