package com.tripsync.tripsync.service;

import com.tripsync.tripsync.model.Group;
import com.tripsync.tripsync.repository.GroupRepository;
import com.tripsync.tripsync.repository.MemberRepository;
import com.tripsync.tripsync.model.Member;

import org.springframework.stereotype.Service;

@Service
public class GroupService {

  private final GroupRepository groupRepository;

  private final MemberRepository memberRepository;

  public GroupService(GroupRepository groupRepository, MemberRepository memberRepository) {
    this.groupRepository = groupRepository;
    this.memberRepository = memberRepository;
  }

  public Group createGroup(String name) {
    String inviteCode = "ABC123";  // Temporary

    Group group = new Group(name, inviteCode);

    return groupRepository.save(group);
  }

  public Member joinGroup(String inviteCode, String memberName) {
    Group group = groupRepository.findByInviteCode(inviteCode)
      .orElseThrow(() -> new RuntimeException("Group not found"));

    Member member = new Member(memberName, group.getId());

    return memberRepository.save(member);
  }
   
}
