package com.Health.Controller;

import com.Health.Application.PatientApplication;
import com.Health.Repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    private PatientApplication patientApplication;
    private IPatientRepository patientRepository;

    @Autowired
    public PatientController(IPatientRepository patientRepository, PatientApplication patientApplication) {
        this.patientRepository = patientRepository;
        this.patientApplication = patientApplication;
    }


    @GetMapping(value = "/")
    public void hello()
    {
        patientApplication.prueba();

    }
    @PostMapping(value = "/add")
    public void addPatient()
    {
         patientApplication.addPatient();
    }
}
