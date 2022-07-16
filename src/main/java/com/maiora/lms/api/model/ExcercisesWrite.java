package com.maiora.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ExcercisesWritePK.class)
@Table(name = "excerciseswrite")
public class ExcercisesWrite {
	@Id
	private int id;
	
	private String name;
	
	@Id
	private double unk = Math.random() * 100;

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

	@Override
	public String toString() {
		return "ExcercisesWrite [id=" + id + ", name=" + name + "]";
	}
	
	
}
