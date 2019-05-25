package com.springboot.employeemanagement.service;

import com.springboot.employeemanagement.entity.Employee;

import java.util.List;

/**
 * @author erandaka_b
 */
public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
