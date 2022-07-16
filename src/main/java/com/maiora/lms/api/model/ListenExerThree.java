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
@Table(name = "listenexerthree")
public class ListenExerThree {

	@Id
	private int id;

	private String lesson_name;

	private String name;

	@Column(name = "audio_src")
	private String audioSrc;

	@Column(name = "main_question")
	private String mainQuestion;

	@OneToMany(targetEntity = ListenQuesThree.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ireet_fk", referencedColumnName = "id")
	private List<ListenQuesThree> questions = new ArrayList<>();

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

	public List<ListenQuesThree> getQuestions() {
		return questions;
	}

	public void setQuestions(List<ListenQuesThree> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ListenExerThree [id=" + id + ", lesson_name=" + lesson_name + ", name=" + name + ", audioSrc="
				+ audioSrc + ", mainQuestion=" + mainQuestion + ", questions=" + questions + "]";
	}

}
