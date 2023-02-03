package org.airbus.builder;

import org.airbus.Command.ServiceButton;

public class OverheadCompartment {
    private final int seatRowNumber;
    private final BookingClass bookingClass;
    private final ServiceButton serviceButton;

    public OverheadCompartment(int seatRowNumber,BookingClass bookingClass){
        this.seatRowNumber=seatRowNumber;
        this.bookingClass=bookingClass;
        serviceButton=new ServiceButton(seatRowNumber,bookingClass);
    }

    public int getSeatRowNumber() {
        return seatRowNumber;
    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }

    public ServiceButton getServiceButton() {
        return serviceButton;
    }

}
