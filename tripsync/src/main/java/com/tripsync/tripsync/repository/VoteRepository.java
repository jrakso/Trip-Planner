package com.tripsync.tripsync.repository;

import com.tripsync.tripsync.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
