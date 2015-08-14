package com.softserve.edu.entity;

import com.softserve.edu.entity.util.JobType;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Job {

    @Id
    @Column(name="Job_Id")
    @GeneratedValue
    private Integer id;

    @Column(name="Job_Name")
    private String name;

    @Column(name = "Job_Type")
    @Enumerated(value = EnumType.STRING)
    private JobType jobType;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="JOB_PERSON",
            joinColumns={@JoinColumn(name="Job_Id")},
            inverseJoinColumns={@JoinColumn(name="Person_Id")})
    private Set<Person> personSet;

    @Column(name="Job_Quantity")
    private Integer quantity;

    @OneToMany(mappedBy="job")
    private Set<Plant> plantSet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<Plant> getPlantSet() {
        return plantSet;
    }

    public void setPlantSet(Set<Plant> plantSet) {
        this.plantSet = plantSet;
    }
}
