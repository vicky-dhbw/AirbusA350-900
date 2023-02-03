package org.airbus.chainOfResponsibility;

public class Steward extends ResponsibleCrewMember{
    public Steward(ResponsibleCrewMember successor){
        setSuccessor(successor);
    }
    public Steward(){

    }
    public void executeResponsibility(Service service){
        if(service instanceof WishService){
            System.out.println("steward will execute the wish service....");
        }
        else {
            super.executeResponsibility(service);
        }
    }
}
