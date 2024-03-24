package com.davidkozhe.barebonesbackend.employee;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String lastName;
    private String firstName;
    private boolean spring1;
    private boolean spring2;
    private boolean spring3;
    private boolean fall1;
    private boolean fall2;
    private boolean fall3;
    private int startYear;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getSpring1() {
        return spring1;
    }
    public Boolean getSpring2() {
        return spring2;
    }
    public Boolean getSpring3() {
        return spring3;
    }

    public void setSpring1(Boolean spring1) {
        this.spring1 = spring1;
    }
    public void setSpring2(Boolean spring2) {
        this.spring2 = spring2;
    }
    public void setSpring3(Boolean spring3) {
        this.spring3 = spring3;
    }

    public Boolean getFall1() {
        return fall1;
    }
    public Boolean getFall2() {
        return fall2;
    }
    public Boolean getFall3() {
        return fall3;
    }

    public void setFall1(Boolean fall1) {
        this.fall1 = fall1;
    }
    public void setFall2(Boolean fall2) {
        this.fall2 = fall2;
    }
    public void setFall3(Boolean fall3) {
        this.fall3 = fall3;
    }

    public int getStartYear() {
        return startYear;
    }
    public void setStartYear(int startYear){
        this.startYear = startYear;
    }
}
