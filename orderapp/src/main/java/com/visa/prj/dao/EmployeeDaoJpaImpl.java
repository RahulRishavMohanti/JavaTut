package com.visa.prj.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Employee;
@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao {
	@PersistenceContext
	EntityManager em;
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		em.persist(e);
	}

}
