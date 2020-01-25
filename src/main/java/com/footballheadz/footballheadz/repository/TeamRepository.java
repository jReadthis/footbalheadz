package com.footballheadz.footballheadz.repository;

import com.footballheadz.footballheadz.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
