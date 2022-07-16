package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "readexecone")
public class ReadExecOne {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "lesson_name")
	private String lesson_name;

	@Column(name = "name")
	private String name;

	@Column(name = "src_url")
	private String src_url;

	@Column(name = "main_question")
	private String main_question;

	@Column(name = "main_sub_question")
	private String main_sub_question;

	@Column(name = "main_question_content")
	private String main_question_content;

	@OneToMany(targetEntity = QuesExer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iqe_fk", referencedColumnName = "id")
	private List<QuesExer> questions = new ArrayList<>();

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

	public String getSrc_url() {
		return src_url;
	}

	public void setSrc_url(String src_url) {
		this.src_url = src_url;
	}

	public String getMain_question() {
		return main_question;
	}

	public void setMain_question(String main_question) {
		this.main_question = main_question;
	}

	public String getMain_sub_question() {
		return main_sub_question;
	}

	public void setMain_sub_question(String main_sub_question) {
		this.main_sub_question = main_sub_question;
	}

	public String getMain_question_content() {
		return main_question_content;
	}

	public void setMain_question_content(String main_question_content) {
		this.main_question_content = main_question_content;
	}

	public List<QuesExer> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuesExer> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ReadExecOne [id=" + id + ", lesson_name=" + lesson_name + ", name=" + name + ", src_url=" + src_url
				+ ", main_question=" + main_question + ", main_sub_question=" + main_sub_question
				+ ", main_question_content=" + main_question_content + ", questions=" + questions + "]";
	}

}
