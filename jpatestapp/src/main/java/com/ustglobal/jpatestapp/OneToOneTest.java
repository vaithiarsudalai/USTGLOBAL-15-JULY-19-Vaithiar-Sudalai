package com.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.onetoone.Person;
import com.ustglobal.jpatestapp.onetoone.VoterCard;

public class OneToOneTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.setP_id(1);
		person.setName("Viggy");
		person.setAge(22);
		VoterCard voterCard = new VoterCard();
		voterCard.setV_id(101);
		voterCard.setName("Vignesh");
		person.setVotercard(voterCard);
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(person);    // Unidirectional mode
			System.out.println("Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
