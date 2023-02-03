package org.airbus.proxy;

public class ProxyEntertainmentSystem implements IEntertainmentSystem{

    private final EntertainmentSystem entertainmentSystem;
    private IEntertainmentSystemUser user;
    public ProxyEntertainmentSystem(IEntertainmentSystemUser user){
        entertainmentSystem=new EntertainmentSystem();
        this.user=user;
        entertainmentSystem.setUser(user);
    }
    @Override
    public void selectTitle(String title, String type) {
        entertainmentSystem.selectTitle(title,type);
    }

    @Override
    public void start() {
        if(user instanceof Purser || user instanceof ServiceTechnician){
            entertainmentSystem.start();
        }else {
            System.out.println("access to start system denied....");

        }
    }

    @Override
    public void reset() {
        if(user instanceof Purser || user instanceof ServiceTechnician){
            entertainmentSystem.reset();
        }else {
            System.out.println("access to reset system denied....");

        }
    }

    @Override
    public void shutDown() {
        if(user instanceof Purser || user instanceof ServiceTechnician){
            entertainmentSystem.shutDown();
        }else {
            System.out.println("access to shut down system denied....");
        }
    }

    @Override
    public void addTitle(String title, String type) {
        if(user instanceof ServiceTechnician){
            entertainmentSystem.addTitle(title,type);
        }else {
            System.out.println("access to add Title denied....");

        }
    }

    @Override
    public void removeTitle(String title, String type) {
        if(user instanceof ServiceTechnician){
            entertainmentSystem.removeTitle(title,type);
        }else {
            System.out.println("access to remove Title denied....");

        }
    }

    @Override
    public void analyzeUserBehavior() {
        if(user instanceof ServiceTechnician){
            entertainmentSystem.analyzeUserBehavior();
        }else {
            System.out.println("access to analyse user behaviour denied....");

        }

    }

    public IEntertainmentSystemUser getUser() {
        return user;
    }

    public void setUser(IEntertainmentSystemUser user) {
        this.user = user;
    }

    @Override
    public void logIn() {

    }


}
