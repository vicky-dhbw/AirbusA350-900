package org.airbus.builder;

public class BusinessClassSeat extends Seat {

    private final USB3Port usb3Port;
    public BusinessClassSeat(int rowNumber, SeatColumn seatColumn) {
        super(rowNumber, seatColumn);
        usb3Port=new USB3Port();
        System.out.println("business class seat created with ID: "+rowNumber+seatColumn);
    }

    public USB3Port getUsb3Port() {
        return usb3Port;
    }
}
