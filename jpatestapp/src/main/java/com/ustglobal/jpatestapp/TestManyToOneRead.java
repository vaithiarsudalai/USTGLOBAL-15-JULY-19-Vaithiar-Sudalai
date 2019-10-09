package com.ustglobal.jpatestapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.onetomany.PencilBox;
import com.ustglobal.jpatestapp.onetomany.Pencils;

public class TestManyToOneRead {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			PencilBox box = entityManager.find(PencilBox.class, 90);
			List<Pencils> pencil = box.getPencils();
			for (Pencils pencils : pencil) {
				System.out.println(pencils.getPencilId());
				System.out.println(pencils.getPencilName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
