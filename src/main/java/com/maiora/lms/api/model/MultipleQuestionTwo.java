package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "multiplequestiontwo")
public class MultipleQuestionTwo {

	@Id
	private int index;

	private String name;

	private String auto_evaluate;

	private String answer;

	@Column(name = "answer_explaination")
	private String answerExplaination;

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

	public String getAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(String auto_evaluate) {
		this.auto_evaluate = auto_evaluate;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswerExplaination() {
		return answerExplaination;
	}

	public void setAnswerExplaination(String answerExplaination) {
		this.answerExplaination = answerExplaination;
	}

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	@Override
	public String toString() {
		return "MultipleQuestionTwo [index=" + index + ", name=" + name + ", auto_evaluate=" + auto_evaluate
				+ ", answer=" + answer + ", answerExplaination=" + answerExplaination + ", userAnswered=" + userAnswered
				+ "]";
	}

}
