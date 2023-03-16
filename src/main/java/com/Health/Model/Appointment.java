package com.Health.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Component
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private Integer patientId;
    private LocalDate date;
    private LocalTime hour;
    private String visitReason;
    private String visitPlace;
    private int status;
    private String doctorNotes;

    @OneToOne
   private Doctor doctor;
    @OneToOne
    private Medication medication;
    public Appointment(){}
    public Appointment(Integer patientId, LocalDate date, LocalTime hour, String visitReason, String visitPlace, int status, String doctorNotes, Doctor doctor, Medication medication){
        this.patientId = patientId;
        this.date = date;
        this.hour = hour;
        this.visitReason = visitReason;
        this.visitPlace = visitPlace;
        this.status = status;
        this.doctorNotes = doctorNotes;
        this.doctor = doctor;
        this.medication = medication;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public LocalDate date() {
        return date;
    }
    public LocalTime getHour() {
        return hour;
    }
    public String getVisitReason() {
        return visitReason;
    }
    public String getVisitPlace() {
        return visitPlace;
    }
    public int getStatus() {
        return status;
    }
    public String getDoctorNotes() {
        return doctorNotes;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public Medication getMedication() {
        return medication;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setHour(LocalTime hour) {
        this.hour = hour;
    }
    public void setVisitReason(String visitReason) {
        this.visitPlace = visitReason;
    }
    public void setVisitPlace(String visitPlace) {
        this.visitPlace = visitPlace;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public void setMedication(Medication medication) {
        this.medication = medication;
    }

}
