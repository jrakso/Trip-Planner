package com.tripsync.service;

import com.tripsync.model.Group;
import com.tripsync.repository.GroupRepository;
import com.tripsync.repository.MemberRepository;
import com.tripsync.model.Member;
import com.tripsync.exception.NotFoundException;

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
                .orElseThrow(() -> new NotFoundException("Group not found"));

        Member member = new Member(memberName, group.getId());

        return memberRepository.save(member);
    }
}
