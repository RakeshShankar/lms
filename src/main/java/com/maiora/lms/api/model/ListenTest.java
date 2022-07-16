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

@Entity
@Table(name = "listentest")
public class ListenTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String src_url;

	@Column(name = "audio_src")
	private String audioSrc;

	@OneToMany(targetEntity = QuestionsTestModel.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "id")
	private List<QuestionsTestModel> questions = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSrc_url() {
		return src_url;
	}

	public void setSrc_url(String src_url) {
		this.src_url = src_url;
	}

	public String getAudioSrc() {
		return audioSrc;
	}

	public void setAudioSrc(String audioSrc) {
		this.audioSrc = audioSrc;
	}

	public List<QuestionsTestModel> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionsTestModel> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ListenTest [id=" + id + ", src_url=" + src_url + ", audioSrc=" + audioSrc + ", questions=" + questions
				+ "]";
	}

}
