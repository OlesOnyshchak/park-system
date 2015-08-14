package com.softserve.edu.entity;

import com.softserve.edu.entity.util.PlantType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Plant {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;;
    private PlantType plantType;


    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
