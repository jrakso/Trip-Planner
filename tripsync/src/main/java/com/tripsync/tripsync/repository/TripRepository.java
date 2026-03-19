package com.tripsync.tripsync.repository;

import com.tripsync.tripsync.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {}
