package org.airbus.Command;

import org.airbus.builder.BookingClass;
import org.airbus.chainOfResponsibility.Steward;

public class ServiceCommand implements IServiceCommand{
    private final Steward steward;

    public ServiceCommand(Steward steward){
        this.steward=steward;
    }

    @Override
    public void callCommand(int seatRowNumber, BookingClass bookingClass) {
        steward.getApp().setServiceRowNumber(seatRowNumber);
        steward.getApp().setBookingClass(bookingClass);
        steward.getApp().printCommand();
    }
}
