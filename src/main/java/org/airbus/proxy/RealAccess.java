package org.airbus.proxy;

public class RealAccess {
    private final Employee employee;

    public RealAccess(Employee employee) {
        this.employee = employee;
    }
    public void grantAccess() {
        System.out.println("Access granted to employee: " + employee.getName());
    }


}
