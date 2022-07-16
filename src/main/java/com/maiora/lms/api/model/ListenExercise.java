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
@Table(name = "listenexercise")
public class ListenExercise {
	@Id
	private int id;

	private int lessonid;

	private String name;

	private String lesson_name;

	@Column(name = "audio_src")
	private String audioSrc;

	@Column(name = "main_question")
	private String mainQuestion;

	@OneToMany(targetEntity = ListenExerciseQuestions.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "id")
	private List<ListenExerciseQuestions> questions = new ArrayList<>();

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLesson_name() {
		return lesson_name;
	}

	public void setLesson_name(String lesson_name) {
		this.lesson_name = lesson_name;
	}

	public String getAudioSrc() {
		return audioSrc;
	}

	public void setAudioSrc(String audioSrc) {
		this.audioSrc = audioSrc;
	}

	public String getMainQuestion() {
		return mainQuestion;
	}

	public void setMainQuestion(String mainQuestion) {
		this.mainQuestion = mainQuestion;
	}

	public List<ListenExerciseQuestions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<ListenExerciseQuestions> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ListenExercise [id=" + id + ", lessonid=" + lessonid + ", name=" + name + ", lesson_name=" + lesson_name
				+ ", audioSrc=" + audioSrc + ", mainQuestion=" + mainQuestion + ", questions=" + questions + "]";
	}

}
