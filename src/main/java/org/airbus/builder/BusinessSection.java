package org.airbus.builder;

import org.airbus.Configuration;

import java.util.List;

public class BusinessSection extends Section {

    public void setNumberOfSeatRows(int numberOfSeatRows) {
        this.numberOfSeatRows=numberOfSeatRows;
        toilets=new Toilet[Configuration.INSTANCE.numberOfToiletsInBusinessSection];
        for(int i=0;i<Configuration.INSTANCE.numberOfToiletsInBusinessSection;i++){
            toilets[i]=new Toilet();
        }

    }

    public Toilet[] getToilets() {
        return toilets;
    }

    public List<SeatRow> getSeatRows() {
        return super.getSeatRows();
    }
}
