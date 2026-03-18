package com.tripsync.tripsync.service;

import com.tripsync.tripsync.model.Plan;
import com.tripsync.tripsync.repository.PlanRepository;
import com.tripsync.tripsync.repository.VoteRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanService {

    private final PlanRepository planRepository;
    private final VoteRepository voteRepository;

    public PlanService(PlanRepository planRepository, VoteRepository voteRepository) {
        this.planRepository = planRepository;
        this.voteRepository = voteRepository;
    }

    public Plan createPlan(Plan plan) {
        return planRepository.save(plan);
    }

    public List<Plan> getPlansByTripId(Long tripId) {
        return planRepository.findByTripId(tripId);
    }

    public Optional<Plan> getWinningPlan(Long tripId) {
        List <Plan> plans = planRepository.findByTripId(tripId);

        Plan bestPlan = null;
        int maxVotes = -1;

        for (Plan plan : plans) {
            int yesVotes = voteRepository
                    .findByPlanIdAndVoteValue(plan.getId(), "YES")
                    .size();

            if (yesVotes > maxVotes && yesVotes != 0) {
                maxVotes = yesVotes;
                bestPlan = plan;
            }
        }

        return Optional.ofNullable(bestPlan);
    }
}
