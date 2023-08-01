package com.example.proj1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "empName")
    private String empName;

    @Column(name = "age")
    private int age;

    @Column(name = "designation")
    private String designation;

    @Column(name = "experience")
    private int experience;

    @Column(name = "salary")
    private Long salary;

    @Column(name = "managerId")
    private Long managerId;

    public Employee() {
    }

    public Employee(Long id, String empName, int age, String designation, int experience, Long salary, Long managerId) {
        this.id = id;
        this.empName = empName;
        this.age = age;
        this.designation = designation;
        this.experience = experience;
        this.salary = salary;
        this.managerId = managerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", empName=" + empName + ", age=" + age + ", designation=" + designation
                + ", experience=" + experience + ", salary=" + salary + ", managerId=" + managerId + "]";
    }

}
