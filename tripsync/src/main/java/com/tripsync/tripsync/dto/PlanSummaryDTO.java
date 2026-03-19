package com.tripsync.tripsync.dto;

public class PlanSummaryDTO {

    private Long planId;
    private String title;
    private int yesVotes;
    private int noVotes;

    public PlanSummaryDTO(Long planId, String title, int yesVotes, int noVotes) {
        this.planId = planId;
        this.title = title;
        this.yesVotes = yesVotes;
        this.noVotes = noVotes;
    }

    public Long getPlanId() {
        return this.planId;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYesVotes() {
        return this.yesVotes;
    }

    public int getNoVotes() {
        return this.noVotes;
    }
}
