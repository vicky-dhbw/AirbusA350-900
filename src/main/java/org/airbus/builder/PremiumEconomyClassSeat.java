package org.airbus.builder;

public class PremiumEconomyClassSeat extends Seat {
    public PremiumEconomyClassSeat(int rowNumber, SeatColumn seatColumn) {
        super(rowNumber, seatColumn);
        System.out.println("premium economy class seat created with ID: "+rowNumber+seatColumn);
    }
}
