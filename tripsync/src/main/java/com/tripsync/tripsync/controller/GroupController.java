package com.tripsync.tripsync.controller;

import com.tripsync.tripsync.model.Group;
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
  public Group createGroup(@RequestBody Group request) {
    return groupService.createGroup(request.getName());
  }
}
