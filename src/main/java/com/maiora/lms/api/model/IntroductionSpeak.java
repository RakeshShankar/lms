package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "introductionspeaking")
public class IntroductionSpeak {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int introid;

	@Column(name = "description1")
	private String description1;

	public int getIntroid() {
		return introid;
	}

	public void setIntroid(int introid) {
		this.introid = introid;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	@Override
	public String toString() {
		return "IntroductionSpeak [introid=" + introid + ", description1=" + description1 + "]";
	}

}
