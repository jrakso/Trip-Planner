package com.tripsync.tripsync.repository;

import com.tripsync.tripsync.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}
