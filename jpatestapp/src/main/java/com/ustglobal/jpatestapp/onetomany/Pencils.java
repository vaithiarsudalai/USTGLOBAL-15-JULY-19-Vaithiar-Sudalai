package com.ustglobal.jpatestapp.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pencils")
public class Pencils {
	@Id
	@Column(name = "pencilId")
	private int pencilId;
	
	
	public int getPencilId() {
		return pencilId;
	}
	@OneToMany(mappedBy = "pencils")
	public void setPencilId(int pencilId) {
		this.pencilId = pencilId;
	}
	public String getPencilName() {
		return pencilName;
	}
	public void setPencilName(String pencilName) {
		this.pencilName = pencilName;
	}
	@Column(name = "pencilName")
	private String pencilName;

}
