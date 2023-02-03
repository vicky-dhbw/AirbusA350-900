package org.airbus.builder;

import org.airbus.Configuration;

public class Cabin {

    private final Section businessSection;
    private final Section premiumEconomySection;
    private final Section economySection;
    private Cabin(Builder builder){
        businessSection= builder.businessSection;
        premiumEconomySection= builder.premiumEconomySection;
        economySection= builder.economySection;
    }
    public Section getBusinessSection() {
        return businessSection;
    }

    public Section getPremiumEconomySection() {
        return premiumEconomySection;
    }

    public Section getEconomySection() {
        return economySection;
    }

    public void print(){
        System.out.println("printing cabin layout......");
        System.out.println();
        SeatPrinter.printSeatInSection(businessSection);
        SeatPrinter.printSeatInSection(premiumEconomySection);
        SeatPrinter.printSeatInSection(economySection);
    }

    public static class Builder{
        private Section businessSection;
        private Section premiumEconomySection;
        private Section economySection;

        public Builder businessSection(int[] rowNumbers, SeatColumn[] seatColumns){
            businessSection=new BusinessSection();
            businessSection.setBookingClass(BookingClass.B);
            System.out.println("creating BUSINESS section ------");
            RowCreator.createRow(businessSection,rowNumbers,seatColumns);

            return this;
        }
        public Builder premiumEconomySection(int[] rowNumbers,SeatColumn[] seatColumns){
            premiumEconomySection=new PremiumEconomySection();
            premiumEconomySection.setBookingClass(BookingClass.P);
            System.out.println("creating PREMIUM ECONOMY section ------");
            RowCreator.createRow(premiumEconomySection,rowNumbers,seatColumns);

            return this;
        }
        public Builder economySection(int[] rowNumbers1,SeatColumn[] seatColumns1,
                                      int[] rowNumbers2,SeatColumn[] seatColumns2,
                                      int[] rowNumbers3,SeatColumn[] seatColumns3,
                                      int[] rowNumbers4,SeatColumn[] seatColumns4,
                                      int[] rowNumbers5,SeatColumn[] seatColumns5)
        {
            economySection=new EconomySection();
            economySection.setBookingClass(BookingClass.E);
            System.out.println("creating ECONOMY section ------");
            RowCreator.createRow(economySection,rowNumbers1,seatColumns1);
            RowCreator.createRow(economySection,rowNumbers2,seatColumns2);
            RowCreator.createRow(economySection,rowNumbers3,seatColumns3);
            RowCreator.createRow(economySection,rowNumbers4,seatColumns4);
            RowCreator.createRow(economySection,rowNumbers5,seatColumns5);

            return this;
        }

        public Cabin build(){
            return new Cabin(this);
        }
    }

}
