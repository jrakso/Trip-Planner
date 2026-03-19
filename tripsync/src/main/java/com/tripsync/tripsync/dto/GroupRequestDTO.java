package com.tripsync.tripsync.dto;

public class GroupRequestDTO {
  
    private String name;
    private String inviteCode;

    public GroupRequestDTO() {}

    public GroupRequestDTO(String name, String inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
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
