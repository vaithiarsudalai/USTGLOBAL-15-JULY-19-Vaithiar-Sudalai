package com.ustglobal.jpatestapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

	@Id
	@Column
	int id;
	@Column
	String name;
	@Column
	String rating;

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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
