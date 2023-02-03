package org.airbus.Observer;

import java.util.List;

public class SmokeDetector {
    private List<ISmokeDetectorListener> listeners;
    private final int toiletID;

    public SmokeDetector(int toiletID){
        this.toiletID=toiletID;
    }

    public int getToiletID() {
        return toiletID;
    }


}
