package com.maiora.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "introductlisten")
public class IntroductListen {

	@Id
	@JsonIgnore
	private int introid;

	private String description1;

	private String description2;

	private String description3;

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

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getDescription3() {
		return description3;
	}

	public void setDescription3(String description3) {
		this.description3 = description3;
	}

	@Override
	public String toString() {
		return "IntroductListen [introid=" + introid + ", description1=" + description1 + ", description2="
				+ description2 + ", description3=" + description3 + "]";
	}

}
