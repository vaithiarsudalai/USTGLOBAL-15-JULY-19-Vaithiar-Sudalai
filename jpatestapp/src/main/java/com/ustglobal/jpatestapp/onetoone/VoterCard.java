package com.ustglobal.jpatestapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "votercard")
public class VoterCard {
	@Id
	@Column
	private int v_id;
	@Column
	private String name;
	@OneToOne(mappedBy = "votercard")           // Establishing Bidirectional one to one relationship
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
