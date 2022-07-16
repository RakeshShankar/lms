package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Table(name = "testlessonoptions")
@Entity
@IdClass(TestLessonOptionsPK.class)
public class TestLessonOptions implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	public int index;

	@Id
	private double unk = Math.random() * 100;

	public String name;

	@Column(name = "user_answered")
	public String userAnswered;

	public String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TestLessonOptions [index=" + index + ", name=" + name + ", userAnswered=" + userAnswered
				+ ", description=" + description + "]";
	}

}
