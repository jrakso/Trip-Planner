package com.tripsync.tripsync.controller;

import com.tripsync.tripsync.dto.GroupRequestDTO;
import com.tripsync.tripsync.dto.JoinGroupRequestDTO;
import com.tripsync.tripsync.model.Group;
import com.tripsync.tripsync.model.Member;
import com.tripsync.tripsync.service.GroupService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
public class GroupController {
 
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping
    public Group createGroup(@RequestBody GroupRequestDTO request) {
        return groupService.createGroup(request.getName());
    }

    @PostMapping("/{inviteCode}/join")
    public Member joinGroup(@PathVariable String inviteCode, @RequestBody JoinGroupRequestDTO request) {
        return groupService.joinGroup(inviteCode, request.getName());
    }
}
