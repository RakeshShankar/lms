package com.maiora.lms.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "speaktest")
public class SpeakTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "speak_id")
	private int speakid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "src_url")
	private String src_url;
	
	@OneToMany(mappedBy = "speacktest")
	private List<QuestionsSpeak> questions;


	public int getSpeakid() {
		return speakid;
	}

	public void setSpeakid(int speakid) {
		this.speakid = speakid;
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

	public List<QuestionsSpeak> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionsSpeak> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "SpeakTest [speakid=" + speakid + ", name=" + name + ", src_url=" + src_url + ", questions=" + questions
				+ "]";
	}

	 
	
	
	
}
