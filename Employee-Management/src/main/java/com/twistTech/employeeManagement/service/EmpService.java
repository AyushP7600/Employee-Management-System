package com.twistTech.employeeManagement.service;

import com.twistTech.employeeManagement.model.EmployeeModel;

import java.util.List;
import java.util.Optional;

public interface EmpService {
    String saveEmployeeData(EmployeeModel m);
    String deleteEmployeeDataByID(int id );
    String updateEmployeeData(EmployeeModel m, int id);
    List<EmployeeModel> getEmployeeData() ;

    Optional<EmployeeModel> getEmployeeDataById(int id);
}
