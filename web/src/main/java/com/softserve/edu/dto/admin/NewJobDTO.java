package com.softserve.edu.dto.admin;

public class NewJobDTO {

    private String name;
    private String type;
    private String description;
    private Integer personQuantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPersonQuantity() {
        return personQuantity;
    }

    public void setPersonQuantity(Integer personQuantity) {
        this.personQuantity = personQuantity;
    }
}
