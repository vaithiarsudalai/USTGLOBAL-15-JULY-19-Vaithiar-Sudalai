package com.dev.encapsulation;

public class Pets {

	@Override
	public String toString() {
		return "Pets [pet=" + pet + ", name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pets other = (Pets) obj;
		if (age != other.age)
			return false;
		return true;
	}
	private String pet;
	private String name;
	private int age;
	private String color;

	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


}
