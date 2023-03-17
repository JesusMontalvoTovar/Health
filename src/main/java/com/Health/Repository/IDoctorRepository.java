package com.Health.Repository;

import com.Health.Model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepository extends CrudRepository<Doctor,Integer> {
}
