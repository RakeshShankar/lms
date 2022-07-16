package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@IdClass(OptionsTestPK.class)
@Table(name = "optionstest")
public class OptionsTest implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	@Id
	@JsonIgnore
	private double unk = Math.random() * 100;
	
	private String name;

	@Column(name = "user_answered")
	private String userAnswered;

	private String description;

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
		return "OptionsTest [index=" + index + ", name=" + name + ", userAnswered=" + userAnswered + ", description="
				+ description + "]";
	}

}
