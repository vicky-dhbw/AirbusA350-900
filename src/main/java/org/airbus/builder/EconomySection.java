package org.airbus.builder;

import org.airbus.Configuration;

public class EconomySection extends Section {

    private Toilet[] toilets;
    public void setNumberOfSeatRows(int numberOfSeatRows) {
        this.numberOfSeatRows=numberOfSeatRows;
        toilets=new Toilet[Configuration.INSTANCE.numberOfToiletsInEconomySection];
        for(int i=0;i<Configuration.INSTANCE.numberOfToiletsInEconomySection;i++){
            toilets[i]=new Toilet();
        }
    }

    public Toilet[] getToilets() {
        return toilets;
    }
}
