package com.tripsync.repository;

import com.tripsync.model.Vote;
import com.tripsync.model.VoteType;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    List<Vote> findByPlanId(Long planId);

    List<Vote> findByPlanIdAndVoteType(Long planId, VoteType voteType);

    Optional<Vote> findByPlanIdAndMemberId(Long planId, Long memberId);
}
