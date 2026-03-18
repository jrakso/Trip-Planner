package com.tripsync.tripsync.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Group {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String inviteCode;

  public Group() {
  }

  public Group(String name, String inviteCode) {
    this.name = name;
    this.inviteCode = inviteCode;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getInviteCode() {
    return inviteCode;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setInviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
  }
}