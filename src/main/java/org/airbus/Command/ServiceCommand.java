package org.airbus.Command;

import org.airbus.chainOfResponsibility.Steward;

public class ServiceCommand {
    private final Steward steward;

    public ServiceCommand(Steward steward){
        this.steward=steward;
    }
    public void callCommand(){
       // steward.getApp().s
    }
}
