package org.airbus.adapter;

public class ThreePinAdapter extends ThreePinDevice implements IPinPlugIn{
    @Override
    public void twoPinPlugIn() {
        threePinPlugIn();
    }
}
