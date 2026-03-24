package com.tripsync.dto;

import java.math.BigDecimal;

public class PlanRequestDTO {

    private String title;
    private String description;
    private BigDecimal price;
    private String link;
    private String type;
    private Long createdByMemberId;

    public PlanRequestDTO() {}

    public PlanRequestDTO(String title, String description, BigDecimal price,
                        String link, String type,
                        Long tripId, Long createdByMemberId) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.link = link;
        this.type = type;
        this.createdByMemberId = createdByMemberId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public String getLink() {
        return this.link;
    }

    public String getType() {
        return this.type;
    }

    public Long getCreatedByMemberId() {
        return this.createdByMemberId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCreatedByMemberId(Long createdByMemberId) {
        this.createdByMemberId = createdByMemberId;
    }
}
