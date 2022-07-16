package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "questionswritetwo")
public class QuestionsWriteTwo {

	@Id
	private int index;

	private String type;

	@Column(name = "user_answered")
	private String userAnswered;

	private int answer;

	@OneToMany(targetEntity = MultipleQuestionTwo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "imqt_fk", referencedColumnName = "index")
	@JsonProperty("multiplequestion")
	private List<MultipleQuestionTwo> multiplequestion = new ArrayList<>();

	ArrayList<Object> options = new ArrayList<Object>();

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

	public List<MultipleQuestionTwo> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(List<MultipleQuestionTwo> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public ArrayList<Object> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<Object> options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "QuestionsWriteTwo [index=" + index + ", type=" + type + ", userAnswered=" + userAnswered + ", answer="
				+ answer + ", multiplequestion=" + multiplequestion + ", options=" + options + "]";
	}


}
