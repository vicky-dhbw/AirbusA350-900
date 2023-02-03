package org.airbus.chainOfResponsibility;

public class ResponsibleCrewMember {
    private ResponsibleCrewMember successor;

    public void executeResponsibility(Service service){
        if(getSuccessor()!=null){
            getSuccessor().executeResponsibility(service);
        }
        else{
            System.out.println("unable to execute Service, no body seems to be responsible");
        }
    }
    public boolean isResponsible(Service service){

        return true;
    }

    public ResponsibleCrewMember getSuccessor() {
        return successor;
    }

    public void setSuccessor(ResponsibleCrewMember successor) {
        this.successor = successor;
    }
}
