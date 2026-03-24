package com.tripsync.model;

import jakarta.persistence.*;

@Entity
@Table(
    uniqueConstraints = @UniqueConstraint(columnNames = {"planId", "memberId"})
)
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long planId;

    private Long memberId;

    @Enumerated(EnumType.STRING)
    private VoteType voteType;

    public Vote() {}

    public Vote(Long planId, Long memberId, VoteType voteType) {
        this.planId = planId;
        this.memberId = memberId;
        this.voteType = voteType;
    }

    public Long getId() {
        return this.id;
    }

    public Long getPlanId() {
        return this.planId;
    }

    public Long getMemberId() {
        return this.memberId;
    }

    public VoteType getVoteType() {
        return this.voteType;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }
}
