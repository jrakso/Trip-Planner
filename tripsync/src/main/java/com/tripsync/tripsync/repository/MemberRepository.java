package com.tripsync.tripsync.repository;

import com.tripsync.tripsync.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {}
