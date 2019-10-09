package com.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.onetoone.VoterCard;

public class OneToOneTestRead {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			VoterCard votercard = entityManager.find(VoterCard.class, 101);  // Bidirectional mode
			System.out.println("Person : " + votercard.getPerson().getName());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
