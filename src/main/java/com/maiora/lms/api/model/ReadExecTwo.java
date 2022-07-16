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
@Table(name = "readexectwo")
public class ReadExecTwo {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "lesson_name")
	private String lesson_name;

	@Column(name = "name")
	private String name;

	@Column(name = "excercise")
	private String excercise;

	@Column(name = "main_question")
	private String main_question;

	@Column(name = "main_sub_question")
	private String main_sub_question;

	@Column(name = "main_question_content")
	private String main_question_content;

	@Column(name = "question_title")
	private String question_title;

	@Column(name = "question_desc")
	private String question_desc;

	@OneToMany(targetEntity = QuestionTwo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iqtretd_fk", referencedColumnName = "id")
	private List<QuestionTwo> questions = new ArrayList<>();

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

	public String getExcercise() {
		return excercise;
	}

	public void setExcercise(String excercise) {
		this.excercise = excercise;
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

	public String getQuestion_title() {
		return question_title;
	}

	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}

	public String getQuestion_desc() {
		return question_desc;
	}

	public void setQuestion_desc(String question_desc) {
		this.question_desc = question_desc;
	}

	public List<QuestionTwo> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionTwo> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ReadExecTwo [id=" + id + ", lesson_name=" + lesson_name + ", name=" + name + ", excercise=" + excercise
				+ ", main_question=" + main_question + ", main_sub_question=" + main_sub_question
				+ ", main_question_content=" + main_question_content + ", question_title=" + question_title
				+ ", question_desc=" + question_desc + ", questions=" + questions + "]";
	}

}
