package com.tripsync.tripsync.controller;

import com.tripsync.tripsync.model.Plan;
import com.tripsync.tripsync.service.PlanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plans")
public class PlanController {

    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @PostMapping
    public Plan createPlan(@RequestBody Plan plan) {
        return planService.createPlan(plan);
    }

    @GetMapping("/trips/{tripId}")
    public List<Plan> getPlansByTripId(@PathVariable Long tripId) {
        return planService.getPlansByTripId(tripId);
    }
}
