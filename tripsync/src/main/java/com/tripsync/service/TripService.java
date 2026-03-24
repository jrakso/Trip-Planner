package com.tripsync.service;

import com.tripsync.model.Trip;
import com.tripsync.repository.TripRepository;

import org.springframework.stereotype.Service;

@Service
public class TripService {
  
    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Trip createTrip(Trip trip) {
        return tripRepository.save(trip);
    }
}
