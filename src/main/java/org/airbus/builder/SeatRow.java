package org.airbus.builder;

import org.airbus.builder.*;

public class SeatRow {

    private final Seat[] seats;
    private int numberOfColumns;
    private int seatRowNumber;
    private SeatColumn[] seatColumnNames;
    private final OverheadCompartment rightOverheadCompartment;
    private final OverheadCompartment leftOverheadCompartment;
    public Seat[] getSeats() {
        return seats;
    }

    public SeatRow(Section section, int seatRowNumber, SeatColumn[] seatColumnNames){
        rightOverheadCompartment=new OverheadCompartment(seatRowNumber,section.getBookingClass());
        leftOverheadCompartment=new OverheadCompartment(seatRowNumber,section.getBookingClass());

        this.seatRowNumber=seatRowNumber;

        if(section instanceof BusinessSection){
            seats=new BusinessClassSeat[seatColumnNames.length];

            for(int i=0;i<seatColumnNames.length;i++){
                seats[i]=new BusinessClassSeat(seatRowNumber,seatColumnNames[i]);
            }

        } else if (section instanceof PremiumEconomySection) {
            seats=new PremiumEconomyClassSeat[seatColumnNames.length];

            for(int i=0;i<seatColumnNames.length;i++){
                seats[i]=new PremiumEconomyClassSeat(seatRowNumber,seatColumnNames[i]);
            }

        } else if (section instanceof EconomySection) {
            seats=new EconomyClassSeat[seatColumnNames.length];

            for(int i=0;i<seatColumnNames.length;i++){
                seats[i]=new EconomyClassSeat(seatRowNumber,seatColumnNames[i]);
            }

        }else {
            seats=null;
            System.out.println("no seats row created");
        }


    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public SeatColumn[] getSeatColumnNames() {
        return seatColumnNames;
    }

    public void setSeatColumnNames(SeatColumn[] seatColumnNames) {
        this.seatColumnNames = seatColumnNames;
    }


    public int getSeatRowNumber() {
        return seatRowNumber;
    }

    public void setSeatRowNumber(int seatRowNumber) {
        this.seatRowNumber = seatRowNumber;
    }

    public OverheadCompartment getOverheadCompartment() {
        return rightOverheadCompartment;
    }

    public OverheadCompartment getLeftOverheadCompartment() {
        return leftOverheadCompartment;
    }
}
