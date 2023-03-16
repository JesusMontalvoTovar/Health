package com.Health.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String name;

    private String lastname;

    private Integer ssn;

    private LocalDate birthdate;

    private Double temperature;

    private Double blood_pressure;

    private Double weight;

    private Double height;

    public Patient() {

    }

    public Patient(Integer id, String name, String lastname, Integer ssn, LocalDate birthdate, Double temperature, Double blood_pressure, Double weight, Double height) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthdate = birthdate;
        this.temperature = temperature;
        this.blood_pressure = blood_pressure;
        this.weight = weight;
        this.height = height;
    }

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(Double blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}