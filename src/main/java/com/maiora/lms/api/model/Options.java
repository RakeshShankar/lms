package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "options")
public class Options implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "opindex")
	private int index;

	@Column(name = "name")
	private String name;

	@Column(name = "user_answered")
	private String userAnswered;

	@ManyToOne
	@JoinColumn(name = "questiontest_id", nullable = false)
	private QuestionsTest testquestions;

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

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	public QuestionsTest getTestquestions() {
		return testquestions;
	}

	public void setTestquestions(QuestionsTest testquestions) {
		this.testquestions = testquestions;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Options [index=" + index + ", name=" + name + ", userAnswered=" + userAnswered + ", testquestions="
				+ testquestions + "]";
	}

	

}
