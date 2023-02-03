package org.airbus;

import org.airbus.Command.IServiceCommand;
import org.airbus.Command.ServiceButton;
import org.airbus.Command.ServiceCommand;
import org.airbus.Mediator.AuthorizedPerson;
import org.airbus.Mediator.CabinDoor;
import org.airbus.Mediator.DoorMediator;
import org.airbus.Visitor.ICleanable;
import org.airbus.Visitor.ICleaningProcedure;
import org.airbus.builder.Seat;
import org.airbus.Memento.CabinSmartApp;
import org.airbus.Memento.SmartAppCareTaker;
import org.airbus.builder.SeatRow;
import org.airbus.builder.Toilet;
import org.airbus.builder.USB3Port;
import org.airbus.chainOfResponsibility.*;
import org.airbus.composite.composite;
import org.airbus.proxy.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
       // proxyEntertainmentSystem.logIn(user2.getName(),user2.getPasswordForEntertainmentSystem());

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
        IServiceCommand serviceCommand1=new ServiceCommand(steward2);


        for (Service service:services){
            steward1.executeResponsibility(service);
        }

        ServiceButton button=flightA350_900.getCabin().getBusinessSection().getSeatRows().get(1).getRightOverheadCompartment().getServiceButton();
        button.setCommand(serviceCommand);
        button.pressButton();

        ServiceButton button1=flightA350_900.getCabin().getPremiumEconomySection().getSeatRows().get(1).getOverheadCompartment().getServiceButton();
        button1.setCommand(serviceCommand1);
        button1.pressButton();

        SmartAppCareTaker smartAppCareTaker=new SmartAppCareTaker();
        CabinSmartApp smartApp=new CabinSmartApp();

        smartAppCareTaker.setMemento(smartApp.save());
        smartApp.print();

        smartApp.setTemperatureInCelsius(25);
        smartApp.setAntiJetLagLight(false);

        smartApp.print();
        smartApp.restore(smartAppCareTaker.getMemento());
        smartApp.print();

        //Mediator

        CabinDoor firstDoor = new CabinDoor();
        CabinDoor secondDoor = new CabinDoor();
        DoorMediator doorMediator = new DoorMediator(firstDoor, secondDoor);
        AuthorizedPerson authorizedPerson = new AuthorizedPerson(doorMediator);

        authorizedPerson.enterCabin();
        authorizedPerson.exitCabin();


        //Visitor

        ArrayList<ICleanable> cleaningList = new ArrayList<>();

        List<SeatRow> seatRowsBusiness = flightA350_900.getCabin().getBusinessSection().getSeatRows();
        List<SeatRow> seatRowsPremiumEconomy = flightA350_900.getCabin().getPremiumEconomySection().getSeatRows();
        List<SeatRow> seatRowsEconomy = flightA350_900.getCabin().getEconomySection().getSeatRows();

        Toilet[] toiletsBusiness = flightA350_900.getCabin().getBusinessSection().getToilets();
        Toilet[] toiletsEconomy = flightA350_900.getCabin().getEconomySection().getToilets();




        for (SeatRow seatRow : seatRowsBusiness) {
            cleaningList.addAll(Arrays.asList(seatRow.getSeats()));
            cleaningList.addAll(Arrays.asList(seatRow.getLeftOverheadCompartment()));
            cleaningList.addAll(Arrays.asList(seatRow.getRightOverheadCompartment()));
        }
      /*  for (Toilet toilet : toiletsBusiness) {
            cleaningList.add(toilet);
        }*/

           // cleaningList.addAll(List.of(toiletsBusiness));

        for (SeatRow seatRow : seatRowsPremiumEconomy) {
            cleaningList.addAll(Arrays.asList(seatRow.getSeats()));
            cleaningList.add(seatRow.getLeftOverheadCompartment());
            cleaningList.add(seatRow.getRightOverheadCompartment());
        }
        for (SeatRow seatRow : seatRowsEconomy) {
            cleaningList.addAll(Arrays.asList(seatRow.getSeats()));
            cleaningList.add(seatRow.getLeftOverheadCompartment());
            cleaningList.add(seatRow.getRightOverheadCompartment());
        }

        //cleaningList.addAll(Arrays.asList(toiletsEconomy));

        for (Toilet toilet : toiletsEconomy) {
            cleaningList.add(toilet);
        }
        ICleaningProcedure cleaningProcedure = new CleaningRobot();


        for (ICleanable clean : cleaningList) {
            clean.accept(cleaningProcedure);
        }

    private static List<Service> buildServiceList(){
        List<Service> services=new ArrayList<>();
        services.add(new WishService());
        services.add(new MedicalEmergencyService());
        services.add(new SecurityService());

        return services;
    }
}