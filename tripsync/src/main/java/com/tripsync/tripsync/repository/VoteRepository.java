package com.tripsync.tripsync.repository;

import com.tripsync.tripsync.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    List<Vote> findByPlanId(Long planId);
}
