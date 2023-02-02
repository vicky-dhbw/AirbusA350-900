package org.airbus;

import org.airbus.builder.SeatColumn;

public enum Configuration {
    INSTANCE;
    public final int rowsInBusinessSection =8;
    public final int columnInBusinessSection =6;
    public final int rowsInPremiumEconomySection =3;
    public final int columnInPremiumEconomySection =7;

    public final int[] businessSectionRowNumbers=getRowsArray(1,8);
    public final SeatColumn[] seatColumnsInPremiumSection={SeatColumn.A,SeatColumn.C,SeatColumn.D,SeatColumn.E,SeatColumn.G,SeatColumn.J};
    public final int[] premiumEconomySectionRowNumbers={12,14,15};
    public final SeatColumn[] seatColumnsInBusinessSection={SeatColumn.A,SeatColumn.C,SeatColumn.D,SeatColumn.G,SeatColumn.H,SeatColumn.K};

    public final int[] economySectionRowNumbers0={16};
    public final SeatColumn[] seatColumnsInEconomySection0={SeatColumn.A,SeatColumn.B,SeatColumn.D,SeatColumn.E,SeatColumn.G,SeatColumn.J,SeatColumn.K};
    public final int[] economySectionRowNumbers1={27};
    public final SeatColumn[] seatColumnsInEconomySection1={SeatColumn.B,SeatColumn.C,SeatColumn.D,SeatColumn.E,SeatColumn.G,SeatColumn.H,SeatColumn.J};

    public final int[] economySectionRowNumbers2=getRowsArray(18,26);
    public final SeatColumn[] seatColumnsInEconomySection2={SeatColumn.A,SeatColumn.B,SeatColumn.C,SeatColumn.D,SeatColumn.E,SeatColumn.G,SeatColumn.H,SeatColumn.J,SeatColumn.K};
    public final int[] economySectionRowNumbers3=getRowsArray(28,41);
    public final int[] economySectionRowNumbers4={42};
    public final SeatColumn[] seatColumnsInEconomySection4={SeatColumn.D,SeatColumn.E,SeatColumn.G};
    public final int numberOfToiletsInBusinessSection=3;
    public final int numberOfToiletsInEconomySection=6;
    public int[] getRowsArray(int from,int to){
        int[] rowNumbers=new int[(to-from)+1];
        for(int i=from;i<=to;i++){
            rowNumbers[i-from]=i;
        }
        return rowNumbers;
    }

}
