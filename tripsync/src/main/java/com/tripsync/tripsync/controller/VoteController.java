package com.tripsync.tripsync.controller;

import com.tripsync.tripsync.dto.VoteRequestDTO;
import com.tripsync.tripsync.dto.VoteResponseDTO;
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
    public VoteResponseDTO createVote(@PathVariable Long planId, @RequestBody VoteRequestDTO request) {
        Vote vote = new Vote(
            planId,
            request.getMemberId(),
            request.getVoteValue()
        );

        Vote saved = voteService.createVote(vote);

        return new VoteResponseDTO(
            saved.getId(),
            saved.getPlanId(),
            saved.getMemberId(),
            saved.getVoteValue()
        );
    }

    @GetMapping
    public List<VoteResponseDTO> getVotesByPlanId(@PathVariable Long planId) {
        List<Vote> votes = voteService.getVotesByPlanId(planId);

        return votes.stream().map(vote -> new VoteResponseDTO(
            vote.getId(),
            vote.getPlanId(),
            vote.getMemberId(),
            vote.getVoteValue()
        )).toList();
    }
}
