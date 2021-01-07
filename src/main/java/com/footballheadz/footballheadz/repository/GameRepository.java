package com.footballheadz.footballheadz.repository;

import com.footballheadz.footballheadz.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

    List<Game> findAll();

    Optional<Game> findById(Integer id);

    Game save(Game game);

}
