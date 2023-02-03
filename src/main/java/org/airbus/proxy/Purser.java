package org.airbus.proxy;

import org.airbus.chainOfResponsibility.MedicalEmergencyService;
import org.airbus.chainOfResponsibility.ResponsibleCrewMember;
import org.airbus.chainOfResponsibility.Service;

public class Purser extends ResponsibleCrewMember implements IEntertainmentSystemUser{

    private String name;
    private String passwordForEntertainmentSystem = "1234";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswordForEntertainmentSystem() {
        return passwordForEntertainmentSystem;
    }

    public void setPasswordForEntertainmentSystem(String passwordForEntertainmentSystem) {
        this.passwordForEntertainmentSystem = passwordForEntertainmentSystem;
    }


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
