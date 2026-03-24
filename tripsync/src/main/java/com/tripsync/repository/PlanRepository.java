package com.tripsync.repository;

import com.tripsync.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanRepository extends JpaRepository<Plan, Long> {

    List<Plan> findByTripId(Long tripId);
}
