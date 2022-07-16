package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(LesExeOptionsPK.class)
@Table(name = "lesexeoptions")
public class LesExeOptions implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	@Id
	private String name;

	@Column(name = "user_answered")
	private String userAnswered;

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

	@Override
	public String toString() {
		return "LesExeOptions [index=" + index + ", name=" + name + ", userAnswered=" + userAnswered + "]";
	}

}
