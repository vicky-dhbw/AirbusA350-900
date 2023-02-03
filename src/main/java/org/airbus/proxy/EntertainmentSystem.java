package org.airbus.proxy;

public class EntertainmentSystem implements IAccess {

    public void entertainmentSystem() {
        System.out.println("Entertainment System");

    Employee employee01 = new Employee("John", 6);
    ProxyAccess proxyAccess = new ProxyAccess(employee01);
    proxyAccess.grantAccess();

    Employee employee02 = new Employee("Vicky", 3);
    proxyAccess.setEmployee(employee02);
    proxyAccess.grantAccess();



    }
}
