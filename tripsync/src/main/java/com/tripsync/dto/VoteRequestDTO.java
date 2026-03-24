package com.tripsync.dto;

import com.tripsync.model.VoteValue;

public class VoteRequestDTO {

    private Long memberId;
    private VoteValue voteValue;

    public VoteRequestDTO() {}

    public VoteRequestDTO(Long memberId, VoteValue voteValue) {
        this.memberId = memberId;
        this.voteValue = voteValue;
    }

    public Long getMemberId() {
        return this.memberId;
    }

    public VoteValue getVoteValue() {
        return this.voteValue;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setVoteValue(VoteValue voteValue) {
        this.voteValue = voteValue;
    }
}
