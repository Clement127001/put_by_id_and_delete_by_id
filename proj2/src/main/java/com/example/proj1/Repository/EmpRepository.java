package com.example.proj1.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.proj1.Model.Employee;

public interface EmpRepository extends CrudRepository<Employee, Long> {

}