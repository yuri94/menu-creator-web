package com.mcweb.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import liquibase.pro.packaged.C;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private  String name;

    @Column
    private double price;

    @Column
    private double weight;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
