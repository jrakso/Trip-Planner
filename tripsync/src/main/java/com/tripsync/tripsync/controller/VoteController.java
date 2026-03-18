package com.tripsync.tripsync.controller;

import com.tripsync.tripsync.model.Vote;
import com.tripsync.tripsync.service.VoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {

    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping
    public Vote createVote(@RequestBody Vote vote) {
        return voteService.createVote(vote);
    }

    @GetMapping("/plans/{planId}")
    public List<Vote> getVotesByPlanId(@PathVariable Long planId) {
        return voteService.getVotesByPlanId(planId);
    }
}
