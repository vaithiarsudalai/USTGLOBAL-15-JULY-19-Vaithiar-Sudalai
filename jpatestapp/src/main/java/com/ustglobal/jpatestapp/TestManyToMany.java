package com.ustglobal.jpatestapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpatestapp.manytomany.Courses;
import com.ustglobal.jpatestapp.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {
		Courses course = new Courses();
		course.setCourseId(10);
		course.setCourseName("Core Java");

		Courses course1 = new Courses();
		course1.setCourseId(20);
		course1.setCourseName("SQL");

		ArrayList<Courses> courseList = new ArrayList<Courses>();
		courseList.add(course);
		courseList.add(course1);

		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Vignesh");
		student.setCourseList(courseList);

		Student student1 = new Student();
		student1.setStudentId(2);
		student1.setStudentName("Vishal");
		student1.setCourseList(courseList);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(student);
			entityManager.persist(student1);
			System.out.println("Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
