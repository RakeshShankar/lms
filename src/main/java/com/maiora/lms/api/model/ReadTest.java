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
@Table(name = "readtest")
public class ReadTest {
	@Id
	private int index;

	private String name;

	private String src_url;

	@OneToMany(targetEntity = QuestionsTesting.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "index")
	private List<QuestionsTesting> questions = new ArrayList<>();

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
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

	public List<QuestionsTesting> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionsTesting> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ReadTest [index=" + index + ", name=" + name + ", src_url=" + src_url + ", questions=" + questions
				+ "]";
	}

}
