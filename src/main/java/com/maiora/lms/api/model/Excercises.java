package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "exercise")
public class Excercises {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exercise_id")
	private long exercise_id;

	@Column(name = "name")
	private String name;

	@ManyToOne
	@JoinColumn(name = "lessonwrite_id", nullable = false)
	private LessonWrite lessonWrite;

	public long getExercise_id() {
		return exercise_id;
	}

	public void setExercise_id(long exercise_id) {
		this.exercise_id = exercise_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LessonWrite getLessonWrite() {
		return lessonWrite;
	}

	public void setLessonWrite(LessonWrite lessonWrite) {
		this.lessonWrite = lessonWrite;
	}

	@Override
	public String toString() {
		return "Excercises [exercise_id=" + exercise_id + ", name=" + name + ", lessonWrite=" + lessonWrite + "]";
	}
	
	
}
