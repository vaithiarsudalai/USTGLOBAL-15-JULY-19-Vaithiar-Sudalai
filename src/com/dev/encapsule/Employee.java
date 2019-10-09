package com.dev.encapsule;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String email;
	private String password;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int compareTo(Employee e) {
		return (this.id - e.id);
	}
	
}
