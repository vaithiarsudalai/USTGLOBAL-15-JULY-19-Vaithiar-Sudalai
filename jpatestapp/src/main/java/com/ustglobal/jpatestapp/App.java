package com.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityMangerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		Movie movie = new Movie();
		movie.setId(102);
		movie.setName("Rocky II");
		movie.setRating("Excellent");
		
		try {
			entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityMangerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("Saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}
}
