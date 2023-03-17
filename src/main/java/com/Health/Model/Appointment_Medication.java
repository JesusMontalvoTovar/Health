package com.Health.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import static jakarta.persistence.GenerationType.IDENTITY;

@Component
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "appointment_medication")
public class Appointment_Medication {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @OneToOne
    private Medication medication;

    public  Appointment_Medication(){}
    public  Appointment_Medication(Medication medication){
        this.medication = medication;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }
}
