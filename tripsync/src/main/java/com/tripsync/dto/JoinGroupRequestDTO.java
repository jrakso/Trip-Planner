package com.tripsync.dto;

public class JoinGroupRequestDTO {
  
    private String name;

    public JoinGroupRequestDTO() {}

    public JoinGroupRequestDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
