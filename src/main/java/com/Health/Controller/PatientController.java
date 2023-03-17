package com.Health.Controller;

import com.Health.Model.Patient;
import com.Health.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("patients")
    public ResponseEntity<List<Patient>> getAll() {

        return new ResponseEntity<>(patientService.getAll(), HttpStatus.OK);
    }

    @GetMapping("patients/{id}")
    public ResponseEntity<Patient> getById(@PathVariable int id) {

        Optional<Patient> patient = Optional.ofNullable(patientService.getById(id));
        if (patient.isPresent()) {
            return new ResponseEntity<>(patient.get(), HttpStatus.OK);
        } else {
            //throw new RecordNotFoundException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = "add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Patient> create(@RequestBody Patient newPatient) {

        Patient patient = patientService.save(newPatient);
        if (patient == null) {
            //throw new ServerException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(patient, HttpStatus.CREATED);
        }
    }

    @PutMapping(path = "update",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Patient> update(@RequestBody Patient existingPatient) {

        Patient patient = patientService.update(existingPatient);
        if (patient == null) {
            //throw new ServerException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(patient, HttpStatus.CREATED);
        }
    }
}
