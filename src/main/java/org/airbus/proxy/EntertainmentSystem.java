package org.airbus.proxy;

public class EntertainmentSystem implements IEntertainmentSystem {

    private IEntertainmentSystemUser user;


    @Override
    public void selectTitle(String title, String type) {
        System.out.println("Selected title: " + title + " of type " + type);
    }

    @Override
    public void start() {
        System.out.println("starting entertainment system...");
    }

    @Override
    public void reset() {
        System.out.println("resetting entertainment system...");
    }

    @Override
    public void shutDown() {
        System.out.println("shutting down entertainment system....");
    }

    @Override
    public void addTitle(String title, String type) {
        System.out.println("Title added: " + title + " of type " + type);
    }

    @Override
    public void removeTitle(String title, String type) {
        System.out.println("title removed: " + title + " of type " + type);
    }

    @Override
    public void analyzeUserBehavior() {
        System.out.println("user behavior analyzed....");
    }

    @Override
    public void logIn() {

    }

    public IEntertainmentSystemUser getUser() {
        return user;
    }

    public void setUser(IEntertainmentSystemUser user) {
        this.user = user;
    }
}


