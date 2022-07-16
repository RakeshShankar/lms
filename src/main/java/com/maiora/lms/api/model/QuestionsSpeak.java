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
@Table(name = "questionspeak")
public class QuestionsSpeak {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "index")
	private int index;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "auto_evaluate")
	private String auto_evaluate;
	
	@Column(name = "answer")
	private String answer;
	
	@Column(name = "user_answered")
	private String userAnswered;
	
	@ManyToOne
	@JoinColumn(name = "speakid", nullable = false)
	private SpeakTest speacktest;


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

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	@Override
	public String toString() {
		return "QuestionsSpeak [index=" + index + ", type=" + type + ", auto_evaluate=" + auto_evaluate + ", answer="
				+ answer + ", userAnswered=" + userAnswered + "]";
	}
	
	
}
