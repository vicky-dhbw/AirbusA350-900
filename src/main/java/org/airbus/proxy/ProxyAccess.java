package org.airbus.proxy;

public class ProxyAccess implements IAccess {

    private Employee employee;
    private RealAccess realAccess;

    public ProxyAccess(Employee employee) {
        this.employee = employee;
        this.realAccess = new RealAccess(employee);
    }


    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void grantAccess() {
        if (employee.getRole() >= 6) {
            realAccess.grantAccess();
        } else {
            System.out.println("Access denied for employee: " + employee.getName());
        }
    }

}

