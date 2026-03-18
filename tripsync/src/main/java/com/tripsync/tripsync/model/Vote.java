package com.tripsync.tripsync.model;

import jakarta.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long planId;

    private Long memberId;

    private String value;

    public Vote() {
    }

    public Vote(Long planId, Long memberId, String value) {
        this.planId = planId;
        this.memberId = memberId;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public Long getPlanId() {
        return planId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getValue() {
        return value;
    }
}
