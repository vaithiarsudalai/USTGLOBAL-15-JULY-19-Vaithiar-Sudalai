package com.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie = entityManager.find(Movie.class, 101);
			System.out.println(movie.getClass());
			System.out.println(entityManager.contains(movie));
			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));
			movie.setName("Expandables");
			movie.setRating("Average");
			transaction.commit();

			// System.out.println("Id : " + movie.getId());
			// System.out.println("Movie Name : " + movie.getName());
			// System.out.println("Rating : " + movie.getRating());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
