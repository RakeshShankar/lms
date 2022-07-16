package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@IdClass(OptionsListenPK.class)
@Table(name = "optionslisten")
public class OptionsListen implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private int index;
	
	@Id
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
