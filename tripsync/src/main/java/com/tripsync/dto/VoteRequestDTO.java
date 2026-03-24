package com.tripsync.dto;

import com.tripsync.model.VoteType;

public class VoteRequestDTO {

    private Long memberId;
    private VoteType voteType;

    public VoteRequestDTO() {}

    public VoteRequestDTO(Long memberId, VoteType voteType) {
        this.memberId = memberId;
        this.voteType = voteType;
    }

    public Long getMemberId() {
        return this.memberId;
    }

    public VoteType getVoteType() {
        return this.voteType;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }
}
