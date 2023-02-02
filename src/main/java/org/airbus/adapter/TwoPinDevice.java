package org.airbus.adapter;

public class TwoPinDevice implements IDevice{
    @Override
    public void twoPinPlugIn() {
        System.out.println("two pin device working...");
    }
}
