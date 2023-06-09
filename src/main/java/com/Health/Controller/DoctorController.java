package com.Health.Controller;

import com.Health.Model.Doctor;
import com.Health.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    public DoctorController(DoctorService doctorService)
    {
        this.doctorService = doctorService;

    }

    @GetMapping("doctors")
    public ResponseEntity<List<Doctor>> getAll()
    {
        return new ResponseEntity<>(doctorService.getAll(), HttpStatus.OK);
    }
    @GetMapping("doctors/{id}")
    public ResponseEntity<Doctor> getById(@PathVariable int id) {

        Optional<Doctor> doctor = Optional.ofNullable(doctorService.getById(id));
        if (doctor.isPresent()) {
            return new ResponseEntity<>(doctor.get(), HttpStatus.OK);
        } else {
            //throw new RecordNotFoundException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = "add")
    public ResponseEntity<Doctor> create(@RequestBody Doctor newDoctor) {

        Doctor doctor = doctorService.save(newDoctor);
        if (doctor == null) {
            //throw new ServerException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(doctor, HttpStatus.CREATED);
        }
    }

    @PutMapping(path = "update",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Doctor> update(@RequestBody Doctor existingDoctor) {

        Doctor doctor = doctorService.update(existingDoctor);
        if (doctor == null) {
            //throw new ServerException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(doctor, HttpStatus.CREATED);
        }
    }

}
