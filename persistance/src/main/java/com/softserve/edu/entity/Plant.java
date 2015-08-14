package com.softserve.edu.entity;

import com.softserve.edu.entity.util.PlantType;

import javax.persistence.*;

@Entity
public class Plant {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;;
    private PlantType plantType;

    @ManyToOne
    @JoinColumn(name="Job_Id")
    private Job job;

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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
