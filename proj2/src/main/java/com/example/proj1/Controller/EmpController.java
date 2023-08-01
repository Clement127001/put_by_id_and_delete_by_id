package com.example.proj1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

import com.example.proj1.Repository.EmpRepository;
import java.util.List;

import com.example.proj1.Model.Employee;

@RestController
@RequestMapping("/api")
public class EmpController {

    @Autowired
    EmpRepository empRepository;

    @PutMapping("/update_user/{id}")

    public ResponseEntity<Employee> updateUser(@PathVariable("id") Long id, @RequestBody Employee emp) {

        Optional<Employee> emp2 = empRepository.findById(id);

        if (emp2.isPresent()) {
            Employee emp3 = emp2.get();

            emp3.setEmpName(emp.getEmpName());
            emp3.setAge(emp.getAge());
            emp3.setDesignation(emp.getDesignation());
            emp3.setExperience(emp.getExperience());
            emp3.setSalary(emp.getSalary());
            emp3.setManagerId(emp.getManagerId());

            return new ResponseEntity<Employee>(empRepository.save(emp3), HttpStatus.OK);
        }

        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete_user/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id) {

        Optional<Employee> emp1 = empRepository.findById(id);

        if (emp1.isPresent()) {

            empRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }

        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
