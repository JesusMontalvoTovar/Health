package com.Health.Service;

import com.Health.Model.Appointment;
import com.Health.Model.Doctor;
import com.Health.Repository.IDoctorRepository;
import com.Health.Repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DoctorService {

    @Autowired
    private IDoctorRepository doctorRepository;

    public DoctorService(IDoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAll()

    {
        List<Doctor> doctors = new ArrayList<>();
        var docs = doctorRepository.findAll();

        docs.forEach( doctor ->
        {
            doctors.add(
                    new Doctor(doctor.getName(), doctor.getLastName(), doctor.getAssociateDegree(), doctor.getSpeciality(), doctor.getEmail(), doctor.getPhone())

            );
        });

        return doctors;
    }

    public Doctor getById(int id)
    {
        return null;
    }

    public Doctor save(Doctor newDoctor)
    {
        return null;
    }

    public Doctor update(Doctor doctor)
    {
        return null;
    }
}
