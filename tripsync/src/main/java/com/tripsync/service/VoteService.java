package com.tripsync.service;

import com.tripsync.model.Vote;
import com.tripsync.repository.VoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote createVote(Vote newVote) {
        Optional<Vote> oldVote = voteRepository
                .findByPlanIdAndMemberId(newVote.getPlanId(), newVote.getMemberId());

        return oldVote.map(vote -> {

            if (!vote.getVoteType().equals(newVote.getVoteType())) {
                vote.setVoteType(newVote.getVoteType());
                return voteRepository.save(vote);
            }

            return vote;

        }).orElseGet(() -> voteRepository.save(newVote));
    }

    public List<Vote> getVotesByPlanId(Long planId) {
        return voteRepository.findByPlanId(planId);
    }
}
