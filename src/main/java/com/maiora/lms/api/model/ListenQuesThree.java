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
@Table(name = "listenquesthree")
public class ListenQuesThree {

	@Id
	private int index;

	private String type;

	private String transcript;

	private String description;

	ArrayList<Object> multiplequestion = new ArrayList<Object>();

	@OneToMany(targetEntity = ListenOptionsOne.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ilo_fk", referencedColumnName = "index")
	private List<ListenOptionsOne> options = new ArrayList<>();

	private String answer;

	@Column(name = "answer_explaination")
	private String answerExplaination;

	@JsonProperty("userAnswered")
	ArrayList<Object> userAnswered = new ArrayList<Object>();

	ArrayList<Object> arrayAnswer = new ArrayList<Object>();

	@Column(name = "show_answer_explanation")
	private boolean showAnswerExplanation;

	@Column(name = "marksobtained")
	private int MarksObtained;

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

	public String getTranscript() {
		return transcript;
	}

	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}

	public String getAnswerExplaination() {
		return answerExplaination;
	}

	public void setAnswerExplaination(String answerExplaination) {
		this.answerExplaination = answerExplaination;
	}

	public List<ListenOptionsOne> getOptions() {
		return options;
	}

	public void setOptions(List<ListenOptionsOne> options) {
		this.options = options;
	}

	public ArrayList<Object> getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(ArrayList<Object> userAnswered) {
		this.userAnswered = userAnswered;
	}

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Object> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(ArrayList<Object> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public ArrayList<Object> getArrayAnswer() {
		return arrayAnswer;
	}

	public void setArrayAnswer(ArrayList<Object> arrayAnswer) {
		this.arrayAnswer = arrayAnswer;
	}

	public boolean isShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(boolean showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	@Override
	public String toString() {
		return "ListenQuesThree [index=" + index + ", type=" + type + ", transcript=" + transcript + ", description="
				+ description + ", multiplequestion=" + multiplequestion + ", options=" + options + ", answer=" + answer
				+ ", answerExplaination=" + answerExplaination + ", userAnswered=" + userAnswered + ", arrayAnswer="
				+ arrayAnswer + ", showAnswerExplanation=" + showAnswerExplanation + ", MarksObtained=" + MarksObtained
				+ "]";
	}

}
