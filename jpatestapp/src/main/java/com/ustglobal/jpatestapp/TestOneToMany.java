package com.ustglobal.jpatestapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.onetomany.PencilBox;
import com.ustglobal.jpatestapp.onetomany.Pencils;

public class TestOneToMany {

	public static void main(String[] args) {
		Pencils pencil = new Pencils();
		pencil.setPencilId(22);
		pencil.setPencilName("Apsara 1");

		Pencils pencil1 = new Pencils();
		pencil1.setPencilId(32);
		pencil1.setPencilName("Apsara");
		ArrayList<Pencils> arrayPencils = new ArrayList<Pencils>();
		arrayPencils.add(pencil);
		arrayPencils.add(pencil1);

		PencilBox box = new PencilBox();
		box.setBoxId(90);
		box.setBoxName("Apsara");
		box.setPencils(arrayPencils);
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(box);
			System.out.println("Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
