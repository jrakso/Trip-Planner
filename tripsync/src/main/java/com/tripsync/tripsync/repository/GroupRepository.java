package com.tripsync.tripsync.repository;

import com.tripsync.tripsync.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
  
}
