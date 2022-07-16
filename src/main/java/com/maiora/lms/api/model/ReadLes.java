package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "readles")
public class ReadLes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lessonid")
	@JsonIgnore
	private int lessonid;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	public int getLessonid() {
		return lessonid;
	}

	public void setLessonid(int lessonid) {
		this.lessonid = lessonid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ReadLes [lessonid=" + lessonid + ", name=" + name + ", description=" + description + "]";
	}

}
