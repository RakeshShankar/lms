package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "lessonsread")
public class LessonsRead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lesson_id")
	@JsonIgnore
	private int lesson_id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name = "intro_id", nullable = false)
	private Introduction introduction;
	
	public int getLesson_id() {
		return lesson_id;
	}

	public void setLesson_id(int lesson_id) {
		this.lesson_id = lesson_id;
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
		return "LessonsRead [lesson_id=" + lesson_id + ", name=" + name + ", description=" + description + "]";
	}

}
