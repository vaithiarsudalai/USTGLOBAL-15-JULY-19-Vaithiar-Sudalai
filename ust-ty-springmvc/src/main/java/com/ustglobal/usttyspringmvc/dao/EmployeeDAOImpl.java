package com.ustglobal.usttyspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.usttyspringmvc.dto.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Employee authenticate(String email, String password) {
		String jpql = "From Employee where email=:email and password=:pwd";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", password);
		try {
		return (Employee) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean registerEmployee(Employee employee) {
		if (checkEmail(employee.getEmail())) {
			return false;
		}
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		return true;
	}

	public boolean checkEmail(String email) {
		String jpql = "From Employee where email=:email";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		query.setParameter("email", email);
		try {
			Employee employee = (Employee) query.getSingleResult();
			return true;	
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee employee = manager.find(Employee.class, id);
		if (employee == null) {
			return false;
		}
		manager.remove(employee);
		transaction.commit();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Employee emp = manager.find(Employee.class, employee.getId());
		emp.setName(employee.getName());
		emp.setPassword(employee.getPassword());
		emp.setDob(employee.getDob());
		transaction.commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		String jpql = "From Employee";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		List<Employee> employeeList = query.getResultList();
		return employeeList;
	}

}
