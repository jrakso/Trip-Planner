package com.tripsync.tripsync.model;

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
    private VoteValue voteValue;

    public Vote() {}

    public Vote(Long planId, Long memberId, VoteValue voteValue) {
        this.planId = planId;
        this.memberId = memberId;
        this.voteValue = voteValue;
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

    public VoteValue getVoteValue() {
        return this.voteValue;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setVoteValue(VoteValue voteValue) {
        this.voteValue = voteValue;
    }
}
