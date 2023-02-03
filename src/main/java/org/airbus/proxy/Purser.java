package org.airbus.proxy;

import org.airbus.chainOfResponsibility.MedicalEmergencyService;
import org.airbus.chainOfResponsibility.ResponsibleCrewMember;
import org.airbus.chainOfResponsibility.Service;

public class Purser extends ResponsibleCrewMember implements IEntertainmentSystemUser{

    public Purser(ResponsibleCrewMember successor){
        setSuccessor(successor);
    }
    public Purser(){

    }
    public void executeResponsibility(Service service){
        if(service instanceof MedicalEmergencyService){
            System.out.println("Purser will execute the medical emergency service....");
        }
        else {
            super.executeResponsibility(service);
        }
    }
}
