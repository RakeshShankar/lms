package com.maiora.lms.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "exerciseabout")
public class ExerciseWrite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exercise_id")
	private int exercise_id;

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

	@OneToMany(mappedBy = "exercisess")
	private List<QuestionWrite> questions;

	public int getExercise_id() {
		return exercise_id;
	}

	public void setExercise_id(int exercise_id) {
		this.exercise_id = exercise_id;
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

	public List<QuestionWrite> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionWrite> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ExerciseWrite [exercise_id=" + exercise_id + ", lesson_name=" + lesson_name + ", name=" + name
				+ ", src_url=" + src_url + ", main_question=" + main_question + ", main_sub_question="
				+ main_sub_question + ", questions=" + questions + "]";
	}
	
	

}
