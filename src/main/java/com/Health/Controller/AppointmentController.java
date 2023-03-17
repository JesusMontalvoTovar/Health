package com.Health.Controller;

import com.Health.Model.Appointment;
import com.Health.Repository.IAppointmentRepository;
import com.Health.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;
    IAppointmentRepository appointmentRepository;

    public AppointmentController(IAppointmentRepository appointmentRepository,AppointmentService appointmentService) {
        this.appointmentRepository = appointmentRepository;
        this.appointmentService = appointmentService;
    }

    @GetMapping("appointments")
    public ResponseEntity<List<Appointment>> getAll() {

        return new ResponseEntity<>(appointmentService.getAll(), HttpStatus.OK);
    }

    @GetMapping("appointments/{id}")
    public ResponseEntity<Appointment> getById(@PathVariable int id) {

        Optional<Appointment> appointment = Optional.ofNullable(appointmentService.getById(id));
        if (appointment.isPresent()) {
            return new ResponseEntity<>(appointment.get(), HttpStatus.OK);
        } else {
            //throw new RecordNotFoundException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = "appointments/new",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Appointment> create(@RequestBody Appointment newAppointment) {

        Appointment appointment = appointmentService.save(newAppointment);
        if (appointment == null) {
            //throw new ServerException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(appointment, HttpStatus.CREATED);
        }
    }

    @PutMapping(path = "appointments/update",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Appointment> update(@RequestBody Appointment existingAppointment) {

        Appointment appointment = appointmentService.update(existingAppointment);
        if (appointment == null) {
            //throw new ServerException();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(appointment, HttpStatus.CREATED);
        }
    }
}
