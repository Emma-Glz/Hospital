package com.example.dependecias.Service;

import com.example.dependecias.Model.Patient;

import java.util.List;

public interface IPatientService {
    Patient save(Patient patient);

    Patient update(Patient patient);

    List<Patient> findAll();

    Patient findById(Integer id);

    void delete(Integer id);
}
