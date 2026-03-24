package com.tripsync.service;

import com.tripsync.model.Plan;
import com.tripsync.model.VoteType;
import com.tripsync.repository.PlanRepository;
import com.tripsync.repository.VoteRepository;
import com.tripsync.dto.PlanSummaryDTO;
import com.tripsync.exception.NotFoundException;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public Plan getWinningPlan(Long tripId) {
        List <Plan> plans = planRepository.findByTripId(tripId);

        Plan bestPlan = null;
        int maxVotes = 0;

        for (Plan plan : plans) {
            int yesVotes = voteRepository
                    .findByPlanIdAndVoteType(plan.getId(), VoteType.YES)
                    .size();

            if (yesVotes > maxVotes) {
                maxVotes = yesVotes;
                bestPlan = plan;
            }
        }

        if (bestPlan == null) {
            throw new NotFoundException("No winning plan found");
        }

        return bestPlan;
    }

    public List<PlanSummaryDTO> getPlanSummaries(Long tripId) {
        List<Plan> plans = planRepository.findByTripId(tripId);
        List<PlanSummaryDTO> result = new ArrayList<>();
        
        for (Plan plan : plans) {
            int yesVotes = voteRepository
                    .findByPlanIdAndVoteType(plan.getId(), VoteType.YES)
                    .size();

            int noVotes = voteRepository
                    .findByPlanIdAndVoteType(plan.getId(), VoteType.NO)
                    .size();

            PlanSummaryDTO dto = new PlanSummaryDTO(
                plan.getId(), 
                plan.getTitle(),
                yesVotes,
                noVotes
            );

            result.add(dto);
        }

        return result;
    }
}
