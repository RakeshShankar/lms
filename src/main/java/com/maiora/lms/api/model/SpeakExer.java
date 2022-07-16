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
@Table(name = "speakexer")
public class SpeakExer {
	@Id
	private long index;

	private String lesson_name;

	private String name;

	private String description;

	private String src_url;

	private String main_question;

	private String main_question_content;

	private String main_sub_question;

	@OneToMany(targetEntity = SpeaksQuestions.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "index")
	private List<SpeaksQuestions> questions = new ArrayList<>();

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getMain_question_content() {
		return main_question_content;
	}

	public void setMain_question_content(String main_question_content) {
		this.main_question_content = main_question_content;
	}

	public String getMain_sub_question() {
		return main_sub_question;
	}

	public void setMain_sub_question(String main_sub_question) {
		this.main_sub_question = main_sub_question;
	}

	public List<SpeaksQuestions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<SpeaksQuestions> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "SpeakExer [index=" + index + ", lesson_name=" + lesson_name + ", name=" + name + ", description="
				+ description + ", src_url=" + src_url + ", main_question=" + main_question + ", main_question_content="
				+ main_question_content + ", main_sub_question=" + main_sub_question + "]";
	}

}
