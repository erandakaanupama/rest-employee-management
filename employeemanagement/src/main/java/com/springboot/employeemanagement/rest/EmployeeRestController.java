package com.springboot.employeemanagement.rest;

import com.springboot.employeemanagement.dao.EmployeeDAO;
import com.springboot.employeemanagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author erandaka_b
 */
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeDAO.findAll();
    }
}
