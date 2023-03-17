package com.Health.Service;

import com.Health.Model.Appointment;
import com.Health.Repository.IAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppointmentService {

    @Autowired
    private  IAppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(IAppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;

    }

    public List<Appointment> getAll()
    {
        return null;
    }

    public Appointment getById(int id)
    {
        return null;
    }

    public Appointment save(Appointment newAppointment)
    {
        return null;
    }

    public Appointment update(Appointment appointment)
    {
        return null;
    }
}
