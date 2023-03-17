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

    private LocalDate date;
    private LocalTime hour;
    private String visitReason;
    private String visitPlace;
    private int status;
    private String doctorNotes;

    @OneToOne
    private Patient patient;
    @OneToOne
    private Doctor doctor;


    public Appointment(){}
    public Appointment( LocalDate date, LocalTime hour, String visitReason, String visitPlace, int status, String doctorNotes, Patient patient, Doctor doctor){

        this.date = date;
        this.hour = hour;
        this.visitReason = visitReason;
        this.visitPlace = visitPlace;
        this.status = status;
        this.doctorNotes = doctorNotes;
        this.patient = patient;
        this.doctor = doctor;
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


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
