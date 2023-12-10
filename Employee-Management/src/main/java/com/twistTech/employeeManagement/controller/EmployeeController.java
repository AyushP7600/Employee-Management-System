package com.twistTech.employeeManagement.controller;

import com.twistTech.employeeManagement.model.EmployeeModel;
import com.twistTech.employeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @PostMapping("/sendEmployeeData")
    public String saveEmployeeData(@RequestBody EmployeeModel model)
    {
        return service.saveEmployeeData(model);

    }
    @DeleteMapping("/deleteEmpData/{id}")
    public String deleteEmployeeData(@PathVariable int id)
    {
        return service.deleteEmployeeDataByID(id);

    }
    @GetMapping("/getData")
    public List<EmployeeModel> get()
    {
        return service.getEmployeeData();
    }

    @GetMapping("/getEmployeeData/{id}")
    public Optional<EmployeeModel> get(@PathVariable int id)
    {
        return service.getEmployeeDataById(id);
    }
    @PutMapping("/updateEmployeeData/{id}")
    public String updateData(@RequestBody EmployeeModel model , @PathVariable int id)
    {
        return service.updateEmployeeData(model,id);
    }


}
