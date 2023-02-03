package org.airbus.builder;

public class OverheadCompartment {
    private final int seatRowNumber;
    private final BookingClass bookingClass;

    public OverheadCompartment(int seatRowNumber,BookingClass bookingClass){
        this.seatRowNumber=seatRowNumber;
        this.bookingClass=bookingClass;
    }

    public int getSeatRowNumber() {
        return seatRowNumber;
    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }
}
