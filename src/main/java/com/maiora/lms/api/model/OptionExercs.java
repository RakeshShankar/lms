package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(OptionExercsPK.class)
@Table(name = "optionexercs")
public class OptionExercs implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private long index;

	private String name;
	
	@Id
	private String description;

	@Column(name = "user_answered")
	private String userAnswered;

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	@Override
	public String toString() {
		return "OptionExercs [index=" + index + ", name=" + name + ", description=" + description + ", userAnswered="
				+ userAnswered + "]";
	}

}
