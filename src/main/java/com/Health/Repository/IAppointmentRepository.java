package com.Health.Repository;

import com.Health.Model.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepository extends CrudRepository<Appointment,Integer> {
}
