package com.UST.Flight_Services.Repository;

import com.UST.Flight_Services.Model.FlightModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<FlightModel,Long> {
}
