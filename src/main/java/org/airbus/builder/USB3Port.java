package org.airbus.builder;

import org.airbus.adapter.*;

public class USB3Port{
    public void charge(IUSBPlugIn usbPlugInDevice) {
        usbPlugInDevice.usb3PlugIn();
    }
}
