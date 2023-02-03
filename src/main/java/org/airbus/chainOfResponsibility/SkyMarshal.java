package org.airbus.chainOfResponsibility;

public class SkyMarshal extends ResponsibleCrewMember{
    public void executeResponsibility(Service service){
        if(service instanceof SecurityService){
            System.out.println("sky marshal will execute security service....");
        }
        else {
            super.executeResponsibility(service);
        }
    }
}
