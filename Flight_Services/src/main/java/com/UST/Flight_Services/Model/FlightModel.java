package com.UST.Flight_Services.Model;

import jakarta.persistence.Id;

public class FlightModel {
    @Id
    Long id;
    String flightNumber;
    String airline;
    String departurLocation;
    String arrivalLocation;
    String departureTime;
    String arrivalTime;
    int duration;
    double price;
    String airlinecode;

}
