package com.footballheadz.footballheadz.repository;

import com.footballheadz.footballheadz.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
