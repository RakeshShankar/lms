package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(QuestionsWriteTestPK.class)
@Table(name = "questionswritetest")
public class QuestionsWriteTest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	@Id
	private double unk = Math.random() * 100;

	private String type;

	private boolean auto_evaluate;

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
		return "QuestionsWriteTest [index=" + index + ", type=" + type + ", auto_evaluate=" + auto_evaluate
				+ ", answer=" + answer + ", answerExplaination=" + answerExplaination + ", userAnswered=" + userAnswered
				+ "]";
	}

}
