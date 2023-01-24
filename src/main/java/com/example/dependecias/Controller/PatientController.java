package com.example.dependecias.Controller;

import com.example.dependecias.Model.Patient;
import com.example.dependecias.Service.PatientServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
//    @Autowired
    private final PatientServiceImp service;// = new PatientService();
    @GetMapping
    public List<Patient> findAll(){
        return service.findAll();

    }
    @GetMapping("/{id}")
    public Patient findById(@PathVariable("id") Integer id){
       return service.findById(id);
    }

    @PostMapping
    public Patient save(@RequestBody Patient patient){
        return service.save(patient);
    }

    @PutMapping
    public Patient update(@RequestBody Patient patient){
        return service.update(patient);
    }

    @DeleteMapping("{id}")
    public void delate(@PathVariable("id") Integer id){
        service.delete(id);
    }

}
