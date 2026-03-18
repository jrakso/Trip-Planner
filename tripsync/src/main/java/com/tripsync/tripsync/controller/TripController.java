package com.tripsync.tripsync.controller;

import com.tripsync.tripsync.model.Trip;
import com.tripsync.tripsync.service.TripService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trips")
public class TripController {
  
  private final TripService tripService;

  public TripController(TripService tripService) {
    this.tripService = tripService;
  }

  @PostMapping
  public Trip createTrip(@RequestBody Trip trip) {
    return tripService.createTrip(trip);
  }
}
