package com.springboot.employeemanagement.dao;

import com.springboot.employeemanagement.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author erandaka_b
 */
@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    // field for entitymanager
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        // get the current hibernate session
        Session session = entityManager.unwrap(Session.class);

        // create a query and execute query
        Query<Employee> theQuery = session.createQuery("from Employee", Employee.class);

        // return results
        return theQuery.getResultList();
    }

    @Override
    public Employee findById(int id) {
        // get the current session
        Session currentSession = entityManager.unwrap(Session.class);

        // create query and get result
        Employee employee = currentSession.get(Employee.class,id);

        // return result
        return employee;
    }

    @Override
    public void saveEmployee(Employee employee) {

        // get the current session
        Session currentSession = entityManager.unwrap(Session.class);

        // save employee
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public void deleteById(int id) {

        // get the current session
        Session currentSession = entityManager.unwrap(Session.class);

        // delete employee by id
        Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
        theQuery.setParameter("employeeId", id);
        theQuery.executeUpdate();

    }
}
