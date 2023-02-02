package org.airbus.builder;

public class RowCreator {

    public static void createRow(Section section, int[] rowNumbers, SeatColumn[] seatColumns){
        for (int rowNumber : rowNumbers) {
            System.out.println("creating row with rowNumber: "+rowNumber);
            section.seatRows.add(new SeatRow(section, rowNumber, seatColumns));
            System.out.println();
        }
    }
}
