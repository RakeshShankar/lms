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
@Table(name = "speaktestintro")
public class SpeakTestIntro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;

	private String name;

	private String src_url;

	@OneToMany(targetEntity = QuestionsTestIntrod.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iqsti_fk", referencedColumnName = "id")
	private List<QuestionsTestIntrod> questions = new ArrayList<>();

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

	public String getSrc_url() {
		return src_url;
	}

	public void setSrc_url(String src_url) {
		this.src_url = src_url;
	}

	public List<QuestionsTestIntrod> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionsTestIntrod> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "SpeakTestIntro [id=" + id + ", name=" + name + ", src_url=" + src_url + ", questions=" + questions
				+ "]";
	}

}
