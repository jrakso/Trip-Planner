package com.tripsync.tripsync.controller;

import com.tripsync.tripsync.dto.VoteRequestDTO;
import com.tripsync.tripsync.model.Vote;
import com.tripsync.tripsync.service.VoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plans/{planId}/votes")
public class VoteController {

    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping
    public Vote createVote(@PathVariable Long planId, @RequestBody VoteRequestDTO request) {
        Vote vote = new Vote(
                planId,
                request.getMemberId(),
                request.getVoteValue()
        );
        return voteService.createVote(vote);
    }

    @GetMapping
    public List<Vote> getVotesByPlanId(@PathVariable Long planId) {
        return voteService.getVotesByPlanId(planId);
    }
}
