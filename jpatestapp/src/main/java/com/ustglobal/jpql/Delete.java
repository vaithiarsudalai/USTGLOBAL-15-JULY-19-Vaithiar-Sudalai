package com.ustglobal.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		Scanner sc = new Scanner(System.in);

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			System.out.println("Enter id for Deletion");
			int idForDelete = Integer.parseInt(sc.nextLine());

			String jpql = "delete from Movie where id = :id";
			transaction.begin();
			Query query = entityManager.createQuery(jpql);
			query.setParameter("id", idForDelete);
			int count = query.executeUpdate();
			transaction.commit();
			if (count > 0) {
				System.out.println("Deleted");
			} else {
				System.out.println("Failed");
			}
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
