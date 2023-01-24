package com.example.dependecias.Service;

import com.example.dependecias.Model.Patient;
import com.example.dependecias.Repo.IPatientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//estereotipo
@RequiredArgsConstructor
public class PatientServiceImp implements IPatientService {
    private final IPatientRepo repo;
    @Override
    public Patient save(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public Patient update(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public List<Patient> findAll() {
        return repo.findAll();
    }

    @Override
    public Patient findById(Integer id) {
        return repo.findById(id).orElse(new Patient());
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
//    @Autowired
//    private final PatientRepo repo;// = new PatientRepo();
//    public String sayHello(Patient patient){
//      return repo.sayHello(patient);
//    }


}
