package com.springboot.employeemanagement.service;

import com.springboot.employeemanagement.dao.EmployeeDAO;
import com.springboot.employeemanagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author erandaka_b
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> findAll() {
        return this.employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return this.employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        this.employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        this.employeeDAO.deleteById(id);
    }
}
