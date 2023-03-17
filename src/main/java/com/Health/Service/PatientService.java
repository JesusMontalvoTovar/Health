package com.Health.Service;

import com.Health.Model.Doctor;
import com.Health.Model.Patient;
import com.Health.Repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientService {
    @Autowired
    private IPatientRepository patientRepository;

    public PatientService(IPatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAll()

    {
        List<Patient> patients = new ArrayList<>();
        var _patients = patientRepository.findAll();

        _patients.forEach( patient ->
        {
            patients.add(
                    new Patient(patient.getId(), patient.getName(), patient.getLastname(), patient.getSsn(), patient.getBirthdate(),
                            patient.getTemperature(),patient.getBlood_pressure(), patient.getWeight(), patient.getHeight())
            );
        });

        return patients;
    }

    public Patient getById(int id)
    {
        return null;
    }

    public Patient save(Patient newPatient)

    {
        return patientRepository.save(newPatient);
    }

    public Patient update(Patient patient)
    {
        return null;
    }
}
