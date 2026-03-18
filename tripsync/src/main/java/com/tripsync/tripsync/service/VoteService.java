package com.tripsync.tripsync.service;

import com.tripsync.tripsync.model.Vote;
import com.tripsync.tripsync.repository.VoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote createVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public List<Vote> getVotesByPlanId(Long planId) {
        return voteRepository.findByPlanId(planId);
    }
}
