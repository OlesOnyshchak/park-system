package com.softserve.edu.entity;

import com.softserve.edu.entity.util.UserStatus;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Person_Id")
    private Integer id;

    @Column(name = "Person_Name")
    private String name;

    @Column(name = "Person_Surname")
    private String surname;

    @Column(name = "Person_Login")
    private String login;

    @Column(name = "Person_Password")
    private String password;

    @Column(name = "Person_Status")
    @Enumerated(value = EnumType.STRING)
    private UserStatus userStatus;

    @ManyToMany(mappedBy="personSet")
    private Set<Job> jobId;

    public Person(String name, String surname, UserStatus userStatus) {
        this.name = name;
        this.surname = surname;
        this.userStatus = userStatus;
    }

    public Person() {}

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Job> getJobId() {
        return jobId;
    }

    public void setJobId(Set<Job> jobId) {
        this.jobId = jobId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
