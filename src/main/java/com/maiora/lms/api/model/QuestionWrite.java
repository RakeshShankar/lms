package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questionwrite")
public class QuestionWrite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "index")
	private int index;

	@Column(name = "type")
	private String type;

	@Column(name = "user_answered")
	private String userAnswered;

	@Column(name = "answer")
	private int answer;

	@Column(name = "option1")
	private String option1;

	@Column(name = "option2")
	private String option2;

	@ManyToOne
	@JoinColumn(name = "exercise_id", nullable = false)
	private ExerciseWrite exercisess;

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

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public ExerciseWrite getExercisess() {
		return exercisess;
	}

	public void setExercisess(ExerciseWrite exercisess) {
		this.exercisess = exercisess;
	}

	@Override
	public String toString() {
		return "QuestionWrite [index=" + index + ", type=" + type + ", userAnswered=" + userAnswered + ", answer="
				+ answer + ", option1=" + option1 + ", option2=" + option2 + ", exercisess=" + exercisess + "]";
	}

	

}
