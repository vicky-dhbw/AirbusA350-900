package org.airbus;

import org.airbus.Command.IServiceCommand;
import org.airbus.Command.ServiceCommand;
import org.airbus.builder.USB3Port;
import org.airbus.chainOfResponsibility.*;
import org.airbus.composite.composite;
import org.airbus.proxy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlightA350_900 flightA350_900=new FlightA350_900();
        composite.Crew();

        IEntertainmentSystemUser user1=new Passenger();

        Purser user2=new Purser();
        user2.setName("purser");
        user2.setPasswordForEntertainmentSystem("1234");


        ServiceTechnician user3=new ServiceTechnician();
        user3.setName("serviceTechnician");
        user3.setPasswordForEntertainmentSystem("12345");
        


        ProxyEntertainmentSystem proxyEntertainmentSystem=new ProxyEntertainmentSystem(user1);

        proxyEntertainmentSystem.setUser(user2);
        proxyEntertainmentSystem.shutDown();
        proxyEntertainmentSystem.setUser(user1);
        proxyEntertainmentSystem.shutDown();
        proxyEntertainmentSystem.setUser(user3);
        proxyEntertainmentSystem.shutDown();
        proxyEntertainmentSystem.logIn(user2.getName(),user2.getPasswordForEntertainmentSystem());

        List<Service> services=buildServiceList();
        ResponsibleCrewMember skyMarshal=new SkyMarshal();
        ResponsibleCrewMember purser=new Purser(skyMarshal);

        Steward steward1=new Steward(purser);
        Steward steward2=new Steward(purser);
        Steward steward3=new Steward(purser);

        flightA350_900.getCabin().getBusinessSection().setSteward(steward1);
        flightA350_900.getCabin().getPremiumEconomySection().setSteward(steward2);
        flightA350_900.getCabin().getEconomySection().setSteward(steward3);

        IServiceCommand serviceCommand=new ServiceCommand(steward1);


        for (Service service:services){
            steward1.executeResponsibility(service);
        }

        flightA350_900.getCabin().getBusinessSection().getSeatRows().get(1).getRightOverheadCompartment()

    }

    private static List<Service> buildServiceList(){
        List<Service> services=new ArrayList<>();
        services.add(new WishService());
        services.add(new MedicalEmergencyService());
        services.add(new SecurityService());

        return services;
    }
}