package org.airbus.builder;

public class Seat {
    protected final String seatID;
    protected final TwoPinSocket twoPinSocket;
    public String getSeatID() {
        return seatID;
    }

    public Seat(int rowNumber, SeatColumn seatColumn){
        this.seatID=Integer.toString(rowNumber)+seatColumn.toString();
        twoPinSocket=new TwoPinSocket();
    }

    public TwoPinSocket getTwoPinSocket() {
        return twoPinSocket;
    }
}
