package org.airbus.proxy;

public class Employee {
    private final String name;
    private final int role;

    public Employee(String name, int role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getRole() {
        return role;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ Employee : ");
        stringBuilder.append("name = ").append(name).append(",");
        stringBuilder.append("role = ").append(role).append(" }");
        return stringBuilder.toString();
    }
}