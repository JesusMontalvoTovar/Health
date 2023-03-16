package com.Health.Application;

import com.Health.Model.Patient;
import com.Health.Repository.IPatientRepository;

import java.util.Optional;

public class PatientApplication {

    private IPatientRepository patientRepository = new IPatientRepository() {
        @Override
        public <S extends Patient> S save(S entity) {
            return null;
        }

        @Override
        public <S extends Patient> Iterable<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public Optional<Patient> findById(Integer integer) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Integer integer) {
            return false;
        }

        @Override
        public Iterable<Patient> findAll() {
            return null;
        }

        @Override
        public Iterable<Patient> findAllById(Iterable<Integer> integers) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public void delete(Patient entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Integer> integers) {

        }

        @Override
        public void deleteAll(Iterable<? extends Patient> entities) {

        }

        @Override
        public void deleteAll() {

        }
    };

    public void prueba()
    {
        Patient patient = new Patient();
        patient.setName("Alize");
        patientRepository.save(patient);
    }
}
