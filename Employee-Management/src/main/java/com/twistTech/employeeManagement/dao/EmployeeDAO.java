package com.twistTech.employeeManagement.dao;

import com.twistTech.employeeManagement.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<EmployeeModel,Integer > {
}
