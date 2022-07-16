package com.maiora.lms.api.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ieltsreadtest")
public class IELTSReadTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "testid")
	private int testid;

	@Column(name = "name")
	private String name;

	@Column(name = "src_url")
	private String src_url;

	@OneToMany(mappedBy = "ieltsReadTest")
	private List<QuestionsTest> questions;

	public int getTestid() {
		return testid;
	}

	public void setTestid(int testid) {
		this.testid = testid;
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

	public List<QuestionsTest> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionsTest> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "IELTSReadTest [testid=" + testid + ", name=" + name + ", src_url=" + src_url + ", questions="
				+ questions + "]";
	}

	


}
