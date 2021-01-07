package com.footballheadz.footballheadz.repository;

import com.footballheadz.footballheadz.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

    List<Owner> findAll();

    Optional<Owner> findById(Integer id);

    Owner save(Owner owner);

}
