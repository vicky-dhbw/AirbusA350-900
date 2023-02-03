package org.airbus.adapter;

public class TwoPinDevice extends Device implements IPinPlugIn{

    @Override
    public void twoPinPlugIn() {
        System.out.println("device working over two pin plug....");
    }
}
