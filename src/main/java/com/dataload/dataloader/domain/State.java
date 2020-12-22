package com.dataload.dataloader.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String pincodeRegex;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<City> city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPincodeRegex() {
        return pincodeRegex;
    }

    public void setPincodeRegex(String pincodeRegex) {
        this.pincodeRegex = pincodeRegex;
    }

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }
// getter and setter methods
}