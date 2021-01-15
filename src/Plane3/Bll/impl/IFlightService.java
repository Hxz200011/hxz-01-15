package Plane3.Bll.impl;

import Bean.Flight;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {
    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights() throws SQLException;
    Flight getFlightByDepartureTime(String departureTime) throws SQLException;
    Flight getFlightByDepartureAirPort(String DepartureAirPort);
    Flight getFlightByDestinationAirPort(String DestinationAirPort);
    void updateFlight(Flight flight);

}
