package com.ustglobal.jpatestapp.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Pencilbox")
public class PencilBox {
	@Id
	@Column(name = "boxId")
	private int boxId;
	@Column(name = "boxName")
	private String boxName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "boxId", nullable = false)
	private List<Pencils> pencils;

	public List<Pencils> getPencils() {
		return pencils;
	}

	public void setPencils(List<Pencils> pencils) {
		this.pencils = pencils;
	}

	public int getBoxId() {
		return boxId;
	}

	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}

	public String getBoxName() {
		return boxName;
	}

	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}

}
