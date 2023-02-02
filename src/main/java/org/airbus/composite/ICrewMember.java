package org.airbus.composite;

public interface ICrewMember {
    void add(ICrewMember crewMember);
    void remove(ICrewMember crewMember);
    ICrewMember getChild(int i);
    String getName();
    void print();
}
