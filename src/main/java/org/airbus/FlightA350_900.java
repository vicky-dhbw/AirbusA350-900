package org.airbus;

import org.airbus.builder.Cabin;

public class FlightA350_900 {
    private Cabin cabin;

    public FlightA350_900(){
        cabin=new Cabin.Builder()
                .businessSection( Configuration.INSTANCE.businessSectionRowNumbers,Configuration.INSTANCE.seatColumnsInBusinessSection)

                .premiumEconomySection(Configuration.INSTANCE.premiumEconomySectionRowNumbers,Configuration.INSTANCE.seatColumnsInPremiumSection)

                .economySection(Configuration.INSTANCE.economySectionRowNumbers0,Configuration.INSTANCE.seatColumnsInEconomySection0
                        ,Configuration.INSTANCE.economySectionRowNumbers1,Configuration.INSTANCE.seatColumnsInEconomySection1
                        ,Configuration.INSTANCE.economySectionRowNumbers2,Configuration.INSTANCE.seatColumnsInEconomySection2
                        ,Configuration.INSTANCE.economySectionRowNumbers3,Configuration.INSTANCE.seatColumnsInEconomySection2
                        ,Configuration.INSTANCE.economySectionRowNumbers4,Configuration.INSTANCE.seatColumnsInEconomySection4
                )
                .build();
        cabin.print();
    }

    public Cabin getCabin() {
        return cabin;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

}
