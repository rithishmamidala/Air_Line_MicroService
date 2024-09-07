package com.UST.Flight_Services.FlightService;

import com.UST.Flight_Services.Repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class FlightService {

    @Autowired
    private FlightRepo flightRepository;
}
