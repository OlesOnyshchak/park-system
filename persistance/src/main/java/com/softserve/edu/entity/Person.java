package com.softserve.edu.entity;

import com.softserve.edu.entity.util.UserStatus;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @Column(name = "User_Id")
    private String id;

    @Column(name = "User_Name")
    private String name;

    @Column(name = "User_Surname")
    private String surname;

    @Column(name = "User_Status")
    @Enumerated(value = EnumType.STRING)
    private UserStatus userStatus;

    public Person(String id, String name, String surname, UserStatus userStatus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.userStatus = userStatus;
    }

    private Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
