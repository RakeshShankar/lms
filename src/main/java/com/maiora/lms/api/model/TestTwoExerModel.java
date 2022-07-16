package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "testtwoexermodel")
public class TestTwoExerModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exerid")
	@JsonIgnore
	private int exerid;
	
	private String lesson_name;
	
	private String name;
	
	private String src_url;
	
	private String main_question;
	
	private String main_sub_question;
	
	@JsonProperty("sub1Question")
	private String sub1_question;
	
	@OneToMany(targetEntity = QuestionsWriteTwo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iqwt_fk", referencedColumnName = "exerid")
	@JsonProperty("questions")
	private List<QuestionsWriteTwo> questions = new ArrayList<>();

	public int getExerid() {
		return exerid;
	}

	public void setExerid(int exerid) {
		this.exerid = exerid;
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

	public String getSub1_question() {
		return sub1_question;
	}

	public void setSub1_question(String sub1_question) {
		this.sub1_question = sub1_question;
	}

	public List<QuestionsWriteTwo> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionsWriteTwo> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "TestTwoExerModel [exerid=" + exerid + ", lesson_name=" + lesson_name + ", name=" + name + ", src_url="
				+ src_url + ", main_question=" + main_question + ", main_sub_question=" + main_sub_question
				+ ", sub1_question=" + sub1_question + ", questions=" + questions + "]";
	}
	
	
}
