package com.footballheadz.footballheadz.repository;

import com.footballheadz.footballheadz.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Integer> {
}
