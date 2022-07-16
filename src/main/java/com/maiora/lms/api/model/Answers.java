package com.maiora.lms.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(AnswersPK.class)
@Table(name = "answers")
public class Answers implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	@Id
	private double unk = Math.random() * 100;

	private boolean auto_evaluate;

	@Column(name = "is_correct")
	private String isCorrect;

	@Column(name = "user_answered")
	private String userAnswered;

	@Column(name = "marks_obtained")
	private int MarksObtained;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean isAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(boolean auto_evaluate) {
		this.auto_evaluate = auto_evaluate;
	}

	public String getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(String isCorrect) {
		this.isCorrect = isCorrect;
	}

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "Answers [index=" + index + ", auto_evaluate=" + auto_evaluate + ", isCorrect=" + isCorrect
				+ ", userAnswered=" + userAnswered + ", MarksObtained=" + MarksObtained + "]";
	}

}
