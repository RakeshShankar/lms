package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "optiontestmodel")
public class OptionTestModel {
	@Id
	public int index;

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
		return "OptionTestModel [index=" + index + ", name=" + name + ", userAnswered=" + userAnswered
				+ ", description=" + description + "]";
	}

}
