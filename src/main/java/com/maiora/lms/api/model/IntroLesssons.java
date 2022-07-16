package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "introlessons")
public class IntroLesssons {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "index")
	private int index;

	@Column(name = "description")
	private String description;

	@Column(name = "name")
	private String name;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "IntroLesssons [index=" + index + ", description=" + description + ", name=" + name + "]";
	}

}
