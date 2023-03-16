package com.Health.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "medication")
public class Medication {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private int medicineId;
    private String dosage;
    private String routeOfAdministration;
    private String frecuency;
    private String duration;
    private LocalDate startDate;
    @OneToOne
    Medicine medicine;

    public Medication(){}
    public Medication(int medicineId, String dosage, String routeOfAdministration, String frecuency, String duration, LocalDate startDate, Medicine medicine){
        this.medicineId = medicineId;
        this.dosage = dosage;
        this.routeOfAdministration = routeOfAdministration;
        this.frecuency = frecuency;
        this.duration = duration;
        this.startDate = startDate;
    }

    public int getMedicineId() {
        return medicineId;
    }
    public String getDosage() {
        return dosage;
    }
    public String getRouteOfAdministration() {
        return routeOfAdministration;
    }
    public String getFrecuency() {
        return frecuency;
    }
    public String getDuration() {
        return duration;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    public void setRouteOfAdministration(String routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }
    public void setFrecuency(String frecuency) {
        this.frecuency = frecuency;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = getStartDate();
    }
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
}
