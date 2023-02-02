package org.airbus.builder;

public class EconomyClassSeat extends Seat {
    public EconomyClassSeat(int rowNumber, SeatColumn seatColumn) {
        super(rowNumber, seatColumn);
        System.out.println("economy class seat created with ID: "+rowNumber+seatColumn);
    }
}
