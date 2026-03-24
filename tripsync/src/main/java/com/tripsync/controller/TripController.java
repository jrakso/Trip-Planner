package com.tripsync.controller;

import com.tripsync.dto.TripRequestDTO;
import com.tripsync.model.Trip;
import com.tripsync.service.TripService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trips")
public class TripController {
  
    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @PostMapping
    public Trip createTrip(@RequestBody TripRequestDTO request) {
        Trip trip = new Trip(
            request.getTitle(),
            request.getDestination(),
            request.getStartDate(),
            request.getEndDate(),
            request.getGroupId()
        );
        return tripService.createTrip(trip);
    }
}
