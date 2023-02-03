package org.airbus.Memento;

public class CabinSmartApp {

    private int temperatureInCelsius;
    private boolean antiJetLagLight;
    public CabinSmartApp(){
        temperatureInCelsius=20;
        antiJetLagLight=true;
    }

    public int getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(int temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public boolean isAntiJetLagLight() {
        return antiJetLagLight;
    }

    public void setAntiJetLagLight(boolean antiJetLagLight) {
        this.antiJetLagLight = antiJetLagLight;
    }
    public SmartAppMemento save(){
        return new SmartAppMemento(temperatureInCelsius,antiJetLagLight);
    }

    public void restore(SmartAppMemento memento){
        temperatureInCelsius= memento.getTemperatureInCelsius();
        antiJetLagLight= memento.isAntiJetLagLight();
    }

    public void print(){
        System.out.println();
        System.out.println("{ temperature in celsius: "+ temperatureInCelsius+ ", anti jet lag light: "+ antiJetLagLight+" }");
    }

}
