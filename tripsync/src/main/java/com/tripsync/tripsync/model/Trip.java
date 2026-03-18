package com.tripsync.tripsync.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Trip {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  private String destination;

  private LocalDate startDate;

  private LocalDate endDate;

  private Long groupId;

  public Trip() {
  }

  public Trip(String title,
              String destination,
              LocalDate startDate,
              LocalDate endDate,
              Long groupId) {
    this.title = title;
    this.destination = destination;
    this.startDate = startDate;
    this.endDate = endDate;
    this.groupId = groupId;
  }

  public String getTitle() {
    return this.title;
  }

  public String getDestination() {
    return this.destination;
  }

  public LocalDate getStartDate() {
    return this.startDate;
  }

  public LocalDate getEndDate() {
    return this.endDate;
  }

  public Long getGroupId() {
    return this.groupId;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }
}
