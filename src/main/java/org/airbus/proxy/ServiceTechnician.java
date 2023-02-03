package org.airbus.proxy;

public class ServiceTechnician implements IEntertainmentSystemUser{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswordForEntertainmentSystem() {
        return passwordForEntertainmentSystem  = "1234";
    }

    public void setPasswordForEntertainmentSystem(String passwordForEntertainmentSystem) {
        this.passwordForEntertainmentSystem = passwordForEntertainmentSystem;
    }

    private String name;
    private String passwordForEntertainmentSystem;
}
