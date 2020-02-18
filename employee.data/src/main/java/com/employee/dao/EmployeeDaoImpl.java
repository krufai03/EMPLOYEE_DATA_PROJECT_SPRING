package com.employee.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void saveEmployee(Employee newEmployee) {
		
		Session currentSession =
				sessionFactory.getCurrentSession();
		
		currentSession.save(newEmployee);
		

	}

	public Employee getById(int employeeId) {

		Session currentSession =
				sessionFactory.getCurrentSession();
		
				Employee savedEmployee=
		currentSession.get(Employee.class, employeeId);
				
		return savedEmployee;
	}

	public Employee getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
