package com.Health.Repository;

import com.Health.Model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface IPatientRepository extends CrudRepository<Patient,Integer> {


}
