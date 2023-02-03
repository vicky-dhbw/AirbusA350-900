package org.airbus;

import org.airbus.builder.USB3Port;
import org.airbus.composite.composite;
import org.airbus.proxy.*;

public class Main {
    public static void main(String[] args) {

        FlightA350_900 flightA350_900=new FlightA350_900();
        composite.Crew();

        IEntertainmentSystemUser user1=new Passenger();
        IEntertainmentSystemUser user2=new Purser();
        IEntertainmentSystemUser user3=new ServiceTechnician();

        ProxyEntertainmentSystem proxyEntertainmentSystem=new ProxyEntertainmentSystem(user1);
        proxyEntertainmentSystem.reset();


        proxyEntertainmentSystem.setUser(user2);
        proxyEntertainmentSystem.shutDown();
        proxyEntertainmentSystem.setUser(user1);
        proxyEntertainmentSystem.shutDown();
        proxyEntertainmentSystem.setUser(user3);
        proxyEntertainmentSystem.shutDown();

    }
}