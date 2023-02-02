package org.airbus.adapter;

public class USBXTAdapter extends USBXTDevice implements IDevice{
    @Override
    public void twoPinPlugIn() {

    }

    @Override
    public void usb3PlugIn() {
        usbXTPlugIn();
    }
}
