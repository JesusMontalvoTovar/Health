package com.Health.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private String name;
    private String activeIngredient;
    private String dosageForm;
    private String dosagePotency;
    private String manufacturer;
    private LocalDate dateOfExpiry;

    public Medicine(){}
    public Medicine(String name, String activeIngredient, String dosageForm, String manufacturer, LocalDate dateOfExpiry){
        this.name =name;
        this.activeIngredient = activeIngredient;
        this.dosageForm = dosageForm;
        this.manufacturer = manufacturer;
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getName() {
        return name;
    }
    public String getActiveIngredient() {
        return activeIngredient;
    }
    public String getDosageForm() {
        return dosageForm;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }
    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }
}
