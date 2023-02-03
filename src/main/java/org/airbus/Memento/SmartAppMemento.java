package org.airbus.Memento;

public class SmartAppMemento {
    private int temperatureInCelsius;
    private boolean antiJetLagLight;
    public SmartAppMemento(int temperatureInCelsius,boolean antiJetLagLight){
        this.temperatureInCelsius=temperatureInCelsius;
        this.antiJetLagLight=antiJetLagLight;
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
}
