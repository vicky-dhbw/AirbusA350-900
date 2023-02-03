package org.airbus.Command;

import org.airbus.builder.BookingClass;

public interface IServiceCommand {
    void callCommand(int seatRowNumber, BookingClass bookingClass);
}
