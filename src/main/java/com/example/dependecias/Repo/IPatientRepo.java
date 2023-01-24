package com.example.dependecias.Repo;

import com.example.dependecias.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient,Integer> {

}
