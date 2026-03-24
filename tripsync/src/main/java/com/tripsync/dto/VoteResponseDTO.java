package com.tripsync.dto;

import com.tripsync.model.VoteType;

public class VoteResponseDTO {

    private Long id;
    private Long planId;
    private Long memberId;
    private VoteType voteValue;

    public VoteResponseDTO() {}

    public VoteResponseDTO(Long id, Long planId, Long memberId, VoteType voteValue) {
        this.id = id;
        this.planId = planId;
        this.memberId = memberId;
        this.voteValue = voteValue;
    }

    public Long getId() {
        return id;
    }

    public Long getPlanId() {
        return planId;
    }

    public Long getMemberId() {
        return this.memberId;
    }

    public VoteType getVoteValue() {
        return this.voteValue;
    }
}
