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
@Table(name = "writeexerciselesson")
public class WriteExerciseLesson {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;

	private String lesson_name;

	private int lessonid;

	private String name;

	private String src_url;

	private String main_question;

	private String main_sub_question;

	@OneToMany(targetEntity = WriteExerciseQuestions.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "id")
	private List<WriteExerciseQuestions> questions = new ArrayList<>();

	private String subQuestion;

	private String sub1Question;

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

	public List<WriteExerciseQuestions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<WriteExerciseQuestions> questions) {
		this.questions = questions;
	}

	public String getSubQuestion() {
		return subQuestion;
	}

	public void setSubQuestion(String subQuestion) {
		this.subQuestion = subQuestion;
	}

	public String getSub1Question() {
		return sub1Question;
	}

	public void setSub1Question(String sub1Question) {
		this.sub1Question = sub1Question;
	}

	@Override
	public String toString() {
		return "WriteExerciseLesson [id=" + id + ", lesson_name=" + lesson_name + ", lessonid=" + lessonid + ", name="
				+ name + ", src_url=" + src_url + ", main_question=" + main_question + ", main_sub_question="
				+ main_sub_question + ", questions=" + questions + "]";
	}

}
