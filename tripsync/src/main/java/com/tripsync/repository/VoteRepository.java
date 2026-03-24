package com.tripsync.repository;

import com.tripsync.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    List<Vote> findByPlanId(Long planId);

    List<Vote> findByPlanIdAndVoteValue(Long planId, String voteValue);

    Optional<Vote> findByPlanIdAndMemberId(Long planId, Long memberId);
}
