package com.footballheadz.footballheadz.model;

import javax.persistence.*;

@Entity
@Table(name="moves")
public class Move {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

}
