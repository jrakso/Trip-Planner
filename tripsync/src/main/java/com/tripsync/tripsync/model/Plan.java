package com.tripsync.tripsync.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private BigDecimal price;

    private String link;

    private String type;

    private Long tripId;

    private Long createdByMemberId;

    public Plan() {
    }

    public Plan(String title, String description, BigDecimal price,
                String link, String type,
                Long tripId, Long createdByMemberId) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.link = link;
        this.type = type;
        this.tripId = tripId;
        this.createdByMemberId = createdByMemberId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getLink() {
        return link;
    }

    public String getType() {
        return type;
    }

    public Long getTripId() {
        return tripId;
    }

    public Long getCreatedByMemberId() {
        return createdByMemberId;
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

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public void setCreatedByMemberId(Long createdByMemberId) {
        this.createdByMemberId = createdByMemberId;
    }
}
