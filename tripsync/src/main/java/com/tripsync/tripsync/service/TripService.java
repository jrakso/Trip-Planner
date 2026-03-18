package com.tripsync.tripsync.service;

import com.tripsync.tripsync.model.Trip;
import com.tripsync.tripsync.repository.TripRepository;

import org.springframework.stereotype.Service;

public class TripService {
  
  private final TripRepository tripRepository;

  public TripService(TripRepository tripRepository) {
    this.tripRepository = tripRepository;
  }

  public Trip createTrip(Trip trip) {
    return tripRepository.save(trip);
  }
}
