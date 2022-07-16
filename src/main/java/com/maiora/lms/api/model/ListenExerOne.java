package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "listenexerone")
public class ListenExerOne {

	@Id
	private int id;

	private String lesson_name;

	private String name;

	@OneToMany(targetEntity = ListenQuesOne.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iqleot_fk", referencedColumnName = "id")
	private List<ListenQuesOne> questions = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLesson_name() {
		return lesson_name;
	}

	public void setLesson_name(String lesson_name) {
		this.lesson_name = lesson_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ListenQuesOne> getQuestions() {
		return questions;
	}

	public void setQuestions(List<ListenQuesOne> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ListenExerOne [id=" + id + ", lesson_name=" + lesson_name + ", name=" + name + ", questions="
				+ questions + "]";
	}

}
