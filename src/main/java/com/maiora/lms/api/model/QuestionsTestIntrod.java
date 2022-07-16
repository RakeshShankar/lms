package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questionstestintrod")
public class QuestionsTestIntrod {

	@Id
	private int index;

	private String type;

	private boolean auto_evaluate;

	private String answer;

	@Column(name = "user_answered")
	private String userAnswered;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(boolean auto_evaluate) {
		this.auto_evaluate = auto_evaluate;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
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
		return "QuestionsTestIntrod [index=" + index + ", type=" + type + ", auto_evaluate=" + auto_evaluate
				+ ", answer=" + answer + ", userAnswered=" + userAnswered + "]";
	}

}
