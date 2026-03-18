package com.tripsync.tripsync.controller;

import com.tripsync.tripsync.model.Vote;
import com.tripsync.tripsync.service.VoteService;
import org.springframework.web.bind.annotation.*;

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
}
