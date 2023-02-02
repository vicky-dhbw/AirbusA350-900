package org.airbus.builder;

import org.airbus.Configuration;

public class BusinessSection extends Section {

    private Toilet[] toilets;

    public void setNumberOfSeatRows(int numberOfSeatRows) {
        this.numberOfSeatRows=numberOfSeatRows;
        toilets=new Toilet[Configuration.INSTANCE.numberOfToiletsInBusinessSection];
    }

    public Toilet[] getToilets() {
        return toilets;
    }
}
