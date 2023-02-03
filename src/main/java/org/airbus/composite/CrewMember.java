package org.airbus.composite;

import org.airbus.Mediator.Mediator;

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



    private Mediator mediator;

    public CrewMember(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void enter() {
        System.out.println(name + " enters the plane");
        mediator.enter();
    }

    public void exit() {
        System.out.println(name + " exits the plane");
        mediator.exit();
    }



}
