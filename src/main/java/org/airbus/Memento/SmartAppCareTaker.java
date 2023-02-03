package org.airbus.Memento;

public class SmartAppCareTaker {
    private SmartAppMemento memento;

    public SmartAppMemento getMemento(){
        return memento;
    }
    public void setMemento(SmartAppMemento memento){
        this.memento=memento;
    }
}
