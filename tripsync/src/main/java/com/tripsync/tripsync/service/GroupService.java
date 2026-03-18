package com.tripsync.tripsync.service;

import com.tripsync.tripsync.model.Group;
import com.tripsync.tripsync.repository.GroupRepository;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

  private final GroupRepository groupRepository;

  public GroupService(GroupRepository groupRepository) {
    this.groupRepository = groupRepository;
  }

  public Group createGroup(String name) {
    String inviteCode = "ABC123";  // Temporary

    Group group = new Group(name, inviteCode);

    return groupRepository.save(group);
  }
   
}
