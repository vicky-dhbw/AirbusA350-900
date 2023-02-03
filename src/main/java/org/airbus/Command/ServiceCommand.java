package org.airbus.Command;

import org.airbus.chainOfResponsibility.Steward;

public class ServiceCommand implements IServiceCommand{
    private final Steward steward;

    public ServiceCommand(Steward steward){
        this.steward=steward;
    }

    @Override
    public void callCommand() {
        steward.getApp().printCommand();
    }
}
