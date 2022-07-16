package com.maiora.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "optionsexcercises")
public class OptionsExcercises {
	@Id
	private int index;

	private String name;

	private String description;

	@JsonProperty("userAnswered")
	private String user_answered;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUser_answered() {
		return user_answered;
	}

	public void setUser_answered(String user_answered) {
		this.user_answered = user_answered;
	}

	@Override
	public String toString() {
		return "OptionsExcercises [index=" + index + ", name=" + name + ", description=" + description
				+ ", user_answered=" + user_answered + "]";
	}

}
