package com.Health.Model;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String name;
    private String lastName;
    private String associateDegree;
    private String speciality;
    private String email;
    private long phone;

    public Doctor(){}
    public Doctor(Integer id, String name, String lastName, String associateDegree, String speciality, String email, long phone){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.associateDegree = associateDegree;
        this.speciality = speciality;
        this.email = email;
        this.phone = phone;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAssociateDegree() {
        return associateDegree;
    }
    public String getSpeciality() {
        return speciality;
    }
    public String getEmail() {
        return email;
    }
    public long getPhone() {
        return phone;
    }


    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAssociateDegree(String associateDegree) {
        this.associateDegree = associateDegree;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }




}
