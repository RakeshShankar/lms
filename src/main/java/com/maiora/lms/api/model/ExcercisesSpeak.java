package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "excercisesspeak")
public class ExcercisesSpeak {
	@Id
	@Column(name = "index")
	private int index;

	@Column(name = "name")
	private String name;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ExcercisesSpeak [index=" + index + ", name=" + name + "]";
	}

}
