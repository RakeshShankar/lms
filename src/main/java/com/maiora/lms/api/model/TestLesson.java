package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "testlesson")
public class TestLesson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;

	private String name;

	private int lessonid;

	private String src_url;

	@OneToMany(targetEntity = TestLessonQuestions.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "id")
	private List<TestLessonQuestions> questions = new ArrayList<>();

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

	public int getLessonid() {
		return lessonid;
	}

	public void setLessonid(int lessonid) {
		this.lessonid = lessonid;
	}

	public String getSrc_url() {
		return src_url;
	}

	public void setSrc_url(String src_url) {
		this.src_url = src_url;
	}

	public List<TestLessonQuestions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<TestLessonQuestions> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "TestLesson [id=" + id + ", name=" + name + ", lessonid=" + lessonid + ", src_url=" + src_url
				+ ", questions=" + questions + "]";
	}

}
