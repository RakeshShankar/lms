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
@Table(name = "assessment")
public class Assessment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	@Column(name = "src_url")
	private String srcUrl;

	@Column(name = "audio_src")
	private String audiosrc;

	@OneToMany(targetEntity = QuestionAssessment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iqa_fk", referencedColumnName = "id")
	private List<QuestionAssessment> questions = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSrcUrl() {
		return srcUrl;
	}

	public void setSrcUrl(String srcUrl) {
		this.srcUrl = srcUrl;
	}

	public String getAudiosrc() {
		return audiosrc;
	}

	public void setAudiosrc(String audiosrc) {
		this.audiosrc = audiosrc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<QuestionAssessment> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionAssessment> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Assessment [id=" + id + ", name=" + name + ", srcUrl=" + srcUrl + ", audiosrc=" + audiosrc
				+ ", questions=" + questions + "]";
	}

}
