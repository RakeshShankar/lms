package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(LesExcercisesPK.class)
@Table(name = "lesexcercises")
public class LesExcercises implements Serializable {

	private static final long serialVersionUID = 1L;

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

	
//	public List<ReadLesson> getExers() {
//		return exers;
//	}
//
//	public void setExers(List<ReadLesson> exers) {
//		this.exers = exers;
//	}

	@Override
	public String toString() {
		return "LesExcercises [id=" + id + ", name=" + name + "]";
	}

}
