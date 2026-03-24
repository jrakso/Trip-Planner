package com.tripsync.model;

import jakarta.persistence.*;

@Entity
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String inviteCode;

    public Group() {}

    public Group(String name, String inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }
}