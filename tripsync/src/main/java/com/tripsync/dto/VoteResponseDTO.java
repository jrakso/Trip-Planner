package com.tripsync.dto;

import com.tripsync.model.VoteValue;

public class VoteResponseDTO {

    private Long id;
    private Long planId;
    private Long memberId;
    private VoteValue voteValue;

    public VoteResponseDTO() {}

    public VoteResponseDTO(Long id, Long planId, Long memberId, VoteValue voteValue) {
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

    public VoteValue getVoteValue() {
        return this.voteValue;
    }
}
