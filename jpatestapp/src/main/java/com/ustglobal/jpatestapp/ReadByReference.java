package com.ustglobal.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.dto.Movie;

public class ReadByReference {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			 Movie movie1 = entityManager.find(Movie.class, 101);
			 System.out.println(movie1.getClass());

			Movie movie = entityManager.getReference(Movie.class, 101);
			System.out.println(movie.getClass());

//			System.out.println("Id : " + movie.getId());
//			System.out.println("Movie Name : " + movie.getName());
//			System.out.println("Rating : " + movie.getRating());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end of the main

}// end of the class
