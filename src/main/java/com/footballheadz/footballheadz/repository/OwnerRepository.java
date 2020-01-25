package com.footballheadz.footballheadz.repository;

import com.footballheadz.footballheadz.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
