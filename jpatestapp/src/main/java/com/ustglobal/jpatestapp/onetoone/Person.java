package com.ustglobal.jpatestapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@Column
	private int p_id;
	@Column
	private String name;
	@Column
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "v_id")               // Establishing Unidirectional one to one relationship
	private VoterCard  votercard;

	public VoterCard getVotercard() {
		return votercard;
	}

	public void setVotercard(VoterCard votercard) {
		this.votercard = votercard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
