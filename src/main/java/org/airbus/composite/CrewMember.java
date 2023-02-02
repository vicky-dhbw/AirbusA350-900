package org.airbus.composite;

public class CrewMember implements ICrewMember{
    private final String name;


    public CrewMember(String name) {
        this.name = name;
    }

    public void add(ICrewMember crewMember) {}

    public void remove(ICrewMember crewMember) {}

    public ICrewMember getChild(int i) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{CrewMember: name=" + name + "}");
        System.out.println(stringBuilder.toString());
    }

}
