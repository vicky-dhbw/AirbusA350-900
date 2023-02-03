package org.airbus.composite;

import java.util.ArrayList;
import java.util.List;

public class CrewMember implements ICrewMember{
    private final String name;
    private final List<ICrewMember> crewMembers = new ArrayList<>();

    public CrewMember(String name) {
        this.name = name;
    }

    public void add(ICrewMember crewMember) {crewMembers.add(crewMember);    }

    public void remove(ICrewMember crewMember) {crewMembers.remove(crewMember);}

    public ICrewMember getChild(int i) {
        return crewMembers.get(i);
    }

    public String getName() {
        return name;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CrewMember: name = ").append(name);
        System.out.println(stringBuilder);
        for (ICrewMember crewMember : crewMembers) {
            crewMember.print();
        }
    }

}
