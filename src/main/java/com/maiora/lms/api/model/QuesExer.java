package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@IdClass(QuesExerPK.class)
@Table(name = "quesexer")
public class QuesExer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	@Id
	private String description;

	@Column(name = "type")
	private String type;

	@ElementCollection
	@OrderColumn
	String[] answer = new String[4];

	@Column(name = "answer_explaination")
	private String answerExplaination;

	@Column(name = "user_answered")
	private String userAnswered;

	@Column(name = "show_answer_explanation")
	private Boolean showAnswerExplanation;

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

	
	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
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

	public Boolean getShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(Boolean showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	@Override
	public String toString() {
		return "QuesExer [index=" + index + ", description=" + description + ", type=" + type + ", answer=" + answer
				+ ", answerExplaination=" + answerExplaination + ", userAnswered=" + userAnswered
				+ ", showAnswerExplanation=" + showAnswerExplanation + "]";
	}

}
