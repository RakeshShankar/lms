package com.maiora.lms.api.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questiontwo")
public class QuestionTwo {

	@Id
	@Column(name = "index")
	private int index;

	@Column(name = "description")
	private String description;

	@Column(name = "type")
	private String type;

	ArrayList<String> answer = new ArrayList<>();

	@Column(name = "user_answered")
	private String userAnswered;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<String> getAnswer() {
		return answer;
	}

	public void setAnswer(ArrayList<String> answer) {
		this.answer = answer;
	}

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	@Override
	public String toString() {
		return "QuestionTwo [index=" + index + ", description=" + description + ", type=" + type + ", answer=" + answer
				+ ", userAnswered=" + userAnswered + "]";
	}

}
