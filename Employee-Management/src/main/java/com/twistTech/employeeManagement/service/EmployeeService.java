package com.twistTech.employeeManagement.service;

import com.twistTech.employeeManagement.dao.EmployeeDAO;
import com.twistTech.employeeManagement.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService implements EmpService {
    @Autowired
    EmployeeDAO dao;

    @Override
    public String saveEmployeeData(EmployeeModel m) {
        String DOB = String.valueOf(m.getDOB());
        DOB.replace("-","/");
        System.out.println(DOB);



        dao.save(m);
        return "Employee data saved";
    }

    @Override
    public String deleteEmployeeDataByID(int id) {
        dao.deleteById(id);
        return "Employee data deleted";
    }

    @Override
    public String updateEmployeeData(EmployeeModel m, int id) {

        m.setEmpId(id);

        if(dao.existsById(m.getEmpId()))
        {
            dao.save(m);
            return "Employee data updated";
        }
        return " failed" ;


    }

    @Override
    public List<EmployeeModel> getEmployeeData() {
        return dao.findAll();
    }

    @Override
    public Optional<EmployeeModel> getEmployeeDataById(int id) {

       return dao.findById(id);
    }
}
