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
@Table(name = "speaksquestions")
public class SpeaksQuestions {

	@Id
	private long index;

	private String description;

	private String type;

	@OneToMany(targetEntity = OptionExercs.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "index")
	@JsonProperty("Excercises")
	private List<OptionExercs> options = new ArrayList<>();

	private int answer;

	@Column(name = "answer_explaination")
	private String answerExplaination;

	@Column(name = "user_answered")
	private String userAnswered;

	ArrayList<Object> arrayAnswer = new ArrayList<Object>();

	@Column(name = "show_answer_explanation")
	private Boolean showAnswerExplanation;

	@JsonProperty("MarksObtained")
	private int marks_obtained;

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
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

	public List<OptionExercs> getOptions() {
		return options;
	}

	public void setOptions(List<OptionExercs> options) {
		this.options = options;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
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

	public ArrayList<Object> getArrayAnswer() {
		return arrayAnswer;
	}

	public void setArrayAnswer(ArrayList<Object> arrayAnswer) {
		this.arrayAnswer = arrayAnswer;
	}

	public Boolean getShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(Boolean showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	public int getMarks_obtained() {
		return marks_obtained;
	}

	public void setMarks_obtained(int marks_obtained) {
		this.marks_obtained = marks_obtained;
	}

	@Override
	public String toString() {
		return "SpeaksQuestions [index=" + index + ", description=" + description + ", type=" + type + ", options="
				+ options + ", answer=" + answer + ", answerExplaination=" + answerExplaination + ", userAnswered="
				+ userAnswered + ", arrayAnswer=" + arrayAnswer + ", showAnswerExplanation=" + showAnswerExplanation
				+ ", marks_obtained=" + marks_obtained + "]";
	}

}
