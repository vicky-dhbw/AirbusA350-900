package org.airbus.builder;

import org.airbus.Command.ServiceButton;
import org.airbus.State.OverheadCompartmentStatus;
import org.airbus.Visitor.ICleanable;
import org.airbus.Visitor.ICleaningProcedure;

public class OverheadCompartment implements ICleanable {
    private final int seatRowNumber;
    private final BookingClass bookingClass;
    private final ServiceButton serviceButton;
    private boolean isClean;
    private OverheadCompartmentStatus status = OverheadCompartmentStatus.CLOSED;

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



    public void accept(ICleaningProcedure cleaningProcedure) {
        cleaningProcedure.clean(this);
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean isClean) {
        this.isClean = isClean;
    }


    public OverheadCompartmentStatus getStatus() {
        return status;
    }

    public void setStatus(OverheadCompartmentStatus status) {
        this.status = status;
    }

    public void open() {
        this.status = OverheadCompartmentStatus.OPEN;
    }

    public void close() {
        this.status = OverheadCompartmentStatus.CLOSED;
    }



}
