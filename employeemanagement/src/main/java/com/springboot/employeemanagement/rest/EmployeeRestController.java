package com.springboot.employeemanagement.rest;

//import com.springboot.employeemanagement.dao.EmployeeDAO;
import com.springboot.employeemanagement.entity.Employee;
import com.springboot.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author erandaka_b
 */
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

//    @Autowired
//    private EmployeeService employeeService;
//
//    @GetMapping("/employees")
//    public List<Employee> getEmployees(){
//        return employeeService.findAll();
//    }
//
//    // get employee
//    @GetMapping("/employees/{employeeId}")
//    public Employee getEmployee(@PathVariable int employeeId){
//        return employeeService.findById(employeeId);
//    }
//
//    // add an employee
//    @PostMapping("/employees")
//    public Employee addEmployee(@RequestBody Employee employee){
//        employee.setId(0);
//        this.employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    //update employee
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee){
//        this.employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    // delete an employee
//    @DeleteMapping("/employees/{employeeId}")
//    public String deleteEmployee(@PathVariable int employeeId){
//        Employee tmpEmployee = employeeService.findById(employeeId);
//        this.employeeService.deleteEmployee(employeeId);
//
//        return "deleted employee id: " + employeeId;
//    }
}
