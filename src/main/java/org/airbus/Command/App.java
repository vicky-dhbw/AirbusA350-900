package org.airbus.Command;

import org.airbus.builder.BookingClass;

public class App {
    private int serviceRowNumber;
    private BookingClass bookingClass;

    public BookingClass getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(BookingClass bookingClass) {
        this.bookingClass = bookingClass;
    }

    public int getServiceRowNumber() {
        return serviceRowNumber;
    }

    public void setServiceRowNumber(int serviceRowNumber) {
        this.serviceRowNumber = serviceRowNumber;
    }

    public void printCommand(){
        System.out.println("call from row number: "+serviceRowNumber+ " of booking class: "+bookingClass);
    }
}
