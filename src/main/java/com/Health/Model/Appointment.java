package com.Health.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    private Integer patientId;
    private Integer doctorId;
    private LocalDate date;
    private LocalTime hour;
    private String visitReason;
    private String visitPlace;
    private int status;
    private String doctorNotes;

    public Appointment(){}
    public Appointment(Integer patientId, Integer doctorId, LocalDate date, LocalTime hour, String visitReason, String visitPlace, int status, String doctorNotes){
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.hour = hour;
        this.visitReason = visitReason;
        this.visitPlace = visitPlace;
        this.status = status;
        this.doctorNotes = doctorNotes;
    }

    public Integer getPatientId() {
        return patientId;
    }
    public Integer getDoctorId() {
        return doctorId;
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

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
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

}
