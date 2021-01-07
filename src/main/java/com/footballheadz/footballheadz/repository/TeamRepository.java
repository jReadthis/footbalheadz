package com.footballheadz.footballheadz.repository;

import com.footballheadz.footballheadz.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    List<Team> findAll();

    Optional<Team> findById(Integer id);

    Team save(Team team);
}
