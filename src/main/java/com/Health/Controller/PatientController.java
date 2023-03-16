package com.Health.Controller;

import com.Health.Application.PatientApplication;
import com.Health.Repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PatientApplication patientApplication;
    private IPatientRepository patientRepository;

    @Autowired
    public PatientController(IPatientRepository patientRepository, PatientApplication patientApplication) {
        this.patientRepository = patientRepository;
        this.patientApplication = patientApplication;
    }

    @RequestMapping(value = "/" )
    public String index()
    {
        return "Home Index";
    }
    @GetMapping(value = "/hello")
    public String hello()
    {
        patientApplication.prueba();
        return "guadamos primer paciente";

    }
}
