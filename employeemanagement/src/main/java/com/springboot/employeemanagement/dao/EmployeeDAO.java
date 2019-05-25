package com.springboot.employeemanagement.dao;

import com.springboot.employeemanagement.entity.Employee;

import java.util.List;

/**
 * @author erandaka_b
 */
public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteById(int id);
}
