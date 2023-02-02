package org.airbus.composite;

public class composite {
    public static void Crew(){
     ICrewMember firtOfficer = new Pilot("First Officer");
     ICrewMember purser = new CrewMember("Purser");

     ICrewMember captain = new Pilot("Captain");
     captain.add(firtOfficer);
     captain.add(purser);

     ICrewMember flightAttendant01 = new CrewMember("Flight Attendant01");
     ICrewMember flightAttendant02 = new CrewMember("Flight Attendant02");
     ICrewMember flightAttendant03 = new CrewMember("Flight Attendant03");
     ICrewMember flightAttendant04 = new CrewMember("Flight Attendant04");
     ICrewMember flightAttendant05 = new CrewMember("Flight Attendant05");
     ICrewMember flightAttendant06 = new CrewMember("Flight Attendant06");

        purser.add(flightAttendant01);
        purser.add(flightAttendant02);
        purser.add(flightAttendant03);
        purser.add(flightAttendant04);
        purser.add(flightAttendant05);
        purser.add(flightAttendant06);

        purser.print();
    }
}
