package org.airbus.proxy;

public interface IEntertainmentSystem {
    void selectTitle(String title, String type);
    void start();
    void reset();
    void shutDown();
    void addTitle(String title, String type);
    void removeTitle(String title, String type);
    void analyzeUserBehavior();
    void logIn();

}
