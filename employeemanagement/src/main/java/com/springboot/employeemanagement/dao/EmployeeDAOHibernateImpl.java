package com.springboot.employeemanagement.dao;

import com.springboot.employeemanagement.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public List<Employee> findAll() {

        // get the current hibernate session
        Session session = entityManager.unwrap(Session.class);

        // create a query and execute query
        Query<Employee> theQuery = session.createQuery("from Employee", Employee.class);

        // return results
        return theQuery.getResultList();
    }
}
