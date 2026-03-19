package com.tripsync.tripsync.model;

import jakarta.persistence.*;

@Entity
public class Member {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long groupId;

    public Member() {}

    public Member(String name, Long groupId) {
        this.name = name;
        this.groupId = groupId;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
