package com.UST.Flight_Services.Controller;

import com.UST.Flight_Services.FlightService.FlightService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightService flightSerevice;

    @PostMapping("/addFlight")



}
