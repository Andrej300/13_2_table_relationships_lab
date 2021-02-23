package com.codeclan.example.relationshipslab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column (name = "firstName")
    private String firstName;

    @Column (name = "lastName")
    private String lastName;

    @Column (name = "employeeNumber")
    private String employeeNumber;

    @JsonIgnoreProperties({"employees"})
    @ManyToOne(mappedBy = "department_id", fetch = FetchType.LAZY)
    private List<Project> projects;


    public Employee(String firstName, String lastName, String employeeNumber) {
        this.projects = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
    }

    public Employee(){}

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}

