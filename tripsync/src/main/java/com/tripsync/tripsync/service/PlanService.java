package com.tripsync.tripsync.service;

import com.tripsync.tripsync.model.Plan;
import com.tripsync.tripsync.repository.PlanRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public Plan createPlan(Plan plan) {
        return planRepository.save(plan);
    }

    public List<Plan> getPlansByTripdId(Long tripId) {
        return planRepository.findByTripId(tripId);
    }
}