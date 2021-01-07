package com.footballheadz.footballheadz.controller;

import com.footballheadz.footballheadz.model.Owner;
import com.footballheadz.footballheadz.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Owner>> findAll() {
        return new ResponseEntity<>(ownerService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Owner> findById(@PathVariable("id") int id) {
        return ownerService.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    Owner saveOwner(@RequestBody Owner owner){
        return ownerService.saveOwner(owner);
    }

}
