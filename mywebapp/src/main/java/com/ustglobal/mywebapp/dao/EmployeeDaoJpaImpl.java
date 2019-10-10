package com.ustglobal.mywebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.mywebapp.dto.EmployeeInfoBean;

public class EmployeeDaoJpaImpl implements EmployeeDAO {

	EntityManagerFactory factory = null;
	EntityManager manager = null;
	EntityTransaction transaction = null;
	EmployeeInfoBean employee = null;
	
	@Override
	public EmployeeInfoBean searchEmployee(int id) {
		factory = Persistence.createEntityManagerFactory("employee");
		manager = factory.createEntityManager();
		try {
			employee = manager.find(EmployeeInfoBean.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return employee;
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employee) {
		factory = Persistence.createEntityManagerFactory("employee");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean deleteEmployee(int i) {
		factory = Persistence.createEntityManagerFactory("employee");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		try {
			transaction.begin();
			employee = manager.find(EmployeeInfoBean.class, i);
			manager.remove(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EmployeeInfoBean login(int empId, String password) {
		factory = Persistence.createEntityManagerFactory("employee");
		manager = factory.createEntityManager();
		
		String jpaQuery = "from EmployeeInfoBean where empId =:id and password =:pwd";
		Query query = manager.createQuery(jpaQuery);
		query.setParameter("id", empId);
		query.setParameter("pwd", password);
		try {
			employee = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBean employee) {
		factory = Persistence.createEntityManagerFactory("employee");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
