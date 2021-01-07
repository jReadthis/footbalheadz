package com.footballheadz.footballheadz.service.impl;

import com.footballheadz.footballheadz.model.Owner;
import com.footballheadz.footballheadz.repository.OwnerRepository;
import com.footballheadz.footballheadz.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    @Override
    public Optional<Owner> findById(int id) {
        return ownerRepository.findById(id);
    }

    @Override
    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }
}
