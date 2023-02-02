package org.airbus.adapter;

public class ThreePinAdapter extends ThreePinDevice implements IDevice{
    @Override
    public void twoPinPlugIn() {
        threePinPlugIn();
    }

    @Override
    public void usb3PlugIn() {

    }
}
