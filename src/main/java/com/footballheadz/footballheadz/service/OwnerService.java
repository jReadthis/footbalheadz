package com.footballheadz.footballheadz.service;

import com.footballheadz.footballheadz.model.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    List<Owner> findAll();

    Optional<Owner> findById(int id);

    Owner saveOwner(Owner owner);

}
