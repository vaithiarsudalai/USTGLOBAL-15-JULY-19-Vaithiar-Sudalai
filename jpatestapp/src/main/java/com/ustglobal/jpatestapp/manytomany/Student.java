package com.ustglobal.jpatestapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@Column(name = "studentId")
	private int studentId;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "students_courses", joinColumns = @JoinColumn(name = "studentId"),
	inverseJoinColumns = @JoinColumn(name = "courseId"))
	private List<Courses> courseList;

	public List<Courses> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Courses> courseList) {
		this.courseList = courseList;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "studentName")
	private String studentName;

}
