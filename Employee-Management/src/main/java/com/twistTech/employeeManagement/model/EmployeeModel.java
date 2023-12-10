package com.twistTech.employeeManagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employee_data")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String Name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private String DOB;
    private String contact;
    private String companyName;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private String JoiningDate;
    private String Designation;
    private String Project;
    private String Manager;
    private double salary;

    public EmployeeModel() {
    }

    public EmployeeModel(int empId, String name, String DOB, String contact, String companyName, String joiningDate, String designation, String project, String manager, double salary) {
        this.empId = empId;
        Name = name;
        this.DOB = DOB;
        this.contact = contact;
        this.companyName = companyName;
        JoiningDate = joiningDate;
        Designation = designation;
        Project = project;
        Manager = manager;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJoiningDate() {
        return JoiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        JoiningDate = joiningDate;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
