package com.footballheadz.footballheadz.repository;

import com.footballheadz.footballheadz.model.Move;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovesRepository extends JpaRepository<Move, Integer> {
}
