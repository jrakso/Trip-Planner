package com.tripsync.controller;

import com.tripsync.dto.PlanRequestDTO;
import com.tripsync.dto.PlanSummaryDTO;
import com.tripsync.model.Plan;
import com.tripsync.service.PlanService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trips/{tripId}/plans")
public class PlanController {

    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @PostMapping
    public Plan createPlan(@PathVariable Long tripId, @RequestBody PlanRequestDTO request) {
        Plan plan = new Plan(
            request.getTitle(),
            request.getDescription(),
            request.getPrice(),
            request.getLink(),
            request.getType(),
            tripId,
            request.getCreatedByMemberId()
        );
        return planService.createPlan(plan);
    }

    @GetMapping
    public List<Plan> getPlansByTripId(@PathVariable Long tripId) {
        return planService.getPlansByTripId(tripId);
    }

    @GetMapping("/winning")
    public Plan getWinningPlan(@PathVariable Long tripId) {
        return planService.getWinningPlan(tripId)
                .orElse(null);
    }

    @GetMapping("/summary")
    public List<PlanSummaryDTO> getPlanSummaries(@PathVariable Long tripId) {
        return planService.getPlanSummaries(tripId);
    }
}
