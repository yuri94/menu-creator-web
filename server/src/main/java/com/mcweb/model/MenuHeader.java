package com.mcweb.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "menu_header")
public class MenuHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "menu_name_id")
    private MenuName menuName;

    @Column(name = "created_date")
    private LocalDate createdDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MenuName getMenuName() {
        return menuName;
    }

    public void setMenuName(MenuName menuName) {
        this.menuName = menuName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
