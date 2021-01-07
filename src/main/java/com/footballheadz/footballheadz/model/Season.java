package com.footballheadz.footballheadz.model;

import javax.persistence.*;

@Entity
@Table(name="seasons")
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
