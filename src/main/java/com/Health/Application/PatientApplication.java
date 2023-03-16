package com.Health.Application;

import com.Health.Model.Patient;
import com.Health.Repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientApplication {
    @Autowired
    private  IPatientRepository patientRepository;

    @Autowired
    public PatientApplication(IPatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void prueba()
    {
        List<Patient> patient;

        patient = (List<Patient>) patientRepository.findAll();
        System.out.println(patient.get(0).getName());
        System.out.println(patient);
    }
}
