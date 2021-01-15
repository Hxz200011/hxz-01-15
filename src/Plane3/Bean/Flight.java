package Plane3.Bean;

import sun.dc.pr.PRError;

import java.util.SplittableRandom;

public class Flight {
    private String id;
    private String flightid;//航班号
    private String planeType;//飞机型号
    private String departureAirport;//飞机出发点
    private String destinationAirPort;//飞机到达的目的地
    private String departureTime;//飞机的飞行时间
    private int currentseatsNumber;//总座位数


    public Flight(String id, String flightid, String planeType, String departureAirport, String destinationAirPort, String departureTime, int currentseatsNumber) {
        this.id = id;
        this.flightid = flightid;
        this.planeType = planeType;
        this.departureAirport = departureAirport;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
        this.currentseatsNumber = currentseatsNumber;
    }

    public Flight(String flightid, String planeType, int currentseatsNumber, String departureAirport, String destinationAirPort, String departureTime) {
        this.id = id;
        this.flightid = flightid;
        this.planeType = planeType;
        this.departureAirport = departureAirport;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
        this.currentseatsNumber = currentseatsNumber;
    }

    public Flight(String id, String flightid, String planeType, int currentseatsNumber, String departureAirport, String destinationAirPort, String departureTime) {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCurrentseatsNumber() {
        return currentseatsNumber;
    }

    public void setCurrentseatsNumber(int currentseatsNumber) {
        this.currentseatsNumber = currentseatsNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                ", flightid='" + flightid + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", currentseatsNumber=" + currentseatsNumber +
                '}';
    }
}
