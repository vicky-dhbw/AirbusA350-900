package org.airbus.builder;

public class SeatPrinter {
    public static void printSeatInSection(Section section){
        for(SeatRow seatRow:section.seatRows){
            for (Seat seat:seatRow.getSeats()){
                System.out.print(seat.getSeatID()+" ");
            }
            System.out.println();
        }
    }
}
