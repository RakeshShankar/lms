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
@Table(name = "exerciselesson")
public class ExerciseLesson {

	@Id
	private int id;

	private int lessonid;

	private String lesson_name;

	private String name;

	private String src_url;

	private String main_question;

	private String main_sub_question;

	private String main_question_content;

	@OneToMany(targetEntity = LessonExerQuestions.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "id")
	private List<LessonExerQuestions> questions = new ArrayList<>();

	private String question_title;

	private String question_desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLessonid() {
		return lessonid;
	}

	public void setLessonid(int lessonid) {
		this.lessonid = lessonid;
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

	public List<LessonExerQuestions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<LessonExerQuestions> questions) {
		this.questions = questions;
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

	@Override
	public String toString() {
		return "ExerciseLesson [id=" + id + ", lessonid=" + lessonid + ", lesson_name=" + lesson_name + ", name=" + name
				+ ", src_url=" + src_url + ", main_question=" + main_question + ", main_sub_question="
				+ main_sub_question + ", main_question_content=" + main_question_content + ", questions=" + questions
				+ "]";
	}

}
