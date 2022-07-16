package com.maiora.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "lessonsintrod")
public class LessonsIntrod {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private long lessonid;

	private String name;

	private String description;

	public long getLessonid() {
		return lessonid;
	}

	public void setLessonid(long lessonid) {
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
		return "LessonsIntrod [lessonid=" + lessonid + ", name=" + name + ", description=" + description + "]";
	}

}
