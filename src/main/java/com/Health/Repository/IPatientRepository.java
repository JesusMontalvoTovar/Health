package com.Health.Repository;

import com.Health.Model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface IPatientRepository extends CrudRepository<Patient,Integer> {

}
