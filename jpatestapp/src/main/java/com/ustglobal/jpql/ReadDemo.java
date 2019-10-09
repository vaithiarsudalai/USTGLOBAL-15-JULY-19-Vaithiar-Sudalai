package com.ustglobal.jpql;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpatestapp.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			String jpql1 = "from Movie";
			Query query1 = entityManager.createQuery(jpql1);
			List<Movie> resultList1 = query1.getResultList();
			for (Movie movie : resultList1) {
				System.out.println(movie);
				System.out.println("**************************");
			}

			String jpql = "select name from Movie";
			Query query = entityManager.createQuery(jpql);
			List<String> resultList = query.getResultList();
			for (String name : resultList) {
				System.out.println(name);
				System.out.println("******************************");
			}

			String jpql3 = "update Movie set name = :name where id = :id";
			transaction.begin();
			Query query2 = entityManager.createQuery(jpql3);
//			query2.setParameter("name", "Rocky");
//			query2.setParameter("id", 102);
			int count = query2.executeUpdate();
			transaction.commit();
			if (count > 0) {
				System.out.println("Updated");
			} else {
				System.out.println("Failed");
			}
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
