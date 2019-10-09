package com.ustglobal.jpatestapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.manytomany.Courses;
import com.ustglobal.jpatestapp.manytomany.Student;

public class TestManyToManyRead {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			Courses course = entityManager.find(Courses.class, 20);
			List<Student> student = course.getStudentList();
			for (Student student2 : student) {
				System.out.println(student2.getStudentId());
				System.out.println(student2.getStudentName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
