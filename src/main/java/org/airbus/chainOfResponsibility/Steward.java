package org.airbus.chainOfResponsibility;

import org.airbus.Command.App;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Steward extends ResponsibleCrewMember{
    private App app;
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

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
