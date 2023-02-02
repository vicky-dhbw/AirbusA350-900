package org.airbus.builder;

public class USB3Port implements ICharge {

    @Override
    public void charge() {
        System.out.println("charging gadget....");
    }
}
