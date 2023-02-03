package org.airbus.Command;

import org.airbus.builder.BookingClass;

public class ServiceButton {
    private int seatRowNumber;
    private BookingClass bookingClass;

    public ServiceButton(int seatRowNumber,BookingClass bookingClass){
        this.seatRowNumber=seatRowNumber;
        this.bookingClass=bookingClass;
    }

    public int getSeatRowNumber() {
        return seatRowNumber;
    }

    public void setSeatRowNumber(int seatRowNumber) {
        this.seatRowNumber = seatRowNumber;
    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(BookingClass bookingClass) {
        this.bookingClass = bookingClass;
    }
}
