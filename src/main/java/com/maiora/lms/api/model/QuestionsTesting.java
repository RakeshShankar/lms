package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@IdClass(QuestionsTestingPK.class)
@Table(name = "questionstesting")
public class QuestionsTesting {

	@Id
	private int index;

	@Id
	@JsonIgnore
	private double unk = Math.random() * 100;

	private String type;

	private boolean auto_evaluate;

	@ElementCollection
	@OrderColumn
	String[] answer = new String[6];

	@Column(name = "answer_explaination")
	private String answerExplaination;

	ArrayList<Object> userAnswered = new ArrayList<Object>();

	@OneToMany(targetEntity = OptionsTest.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "iot_fk", referencedColumnName = "index"),
			@JoinColumn(name = "itii_fk", referencedColumnName = "unk") })
	private List<OptionsTest> options = new ArrayList<>();
	
	@JsonIgnore
	@Column(name = "marks_obtained")
	private int MarksObtained;

	@Column(name = "show_answer_explanation")
	private boolean showAnswerExplanation;

	ArrayList<Object> arrayAnswer = new ArrayList<Object>();

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getUnk() {
		return unk;
	}

	public void setUnk(double unk) {
		this.unk = unk;
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

	public ArrayList<Object> getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(ArrayList<Object> userAnswered) {
		this.userAnswered = userAnswered;
	}

	public List<OptionsTest> getOptions() {
		return options;
	}

	public void setOptions(List<OptionsTest> options) {
		this.options = options;
	}

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	public boolean isShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(boolean showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	public ArrayList<Object> getArrayAnswer() {
		return arrayAnswer;
	}

	public void setArrayAnswer(ArrayList<Object> arrayAnswer) {
		this.arrayAnswer = arrayAnswer;
	}

	@Override
	public String toString() {
		return "QuestionsTesting [index=" + index + ", unk=" + unk + ", type=" + type + ", auto_evaluate="
				+ auto_evaluate + ", answer=" + Arrays.toString(answer) + ", answerExplaination=" + answerExplaination
				+ ", userAnswered=" + userAnswered + ", options=" + options + ", MarksObtained=" + MarksObtained
				+ ", showAnswerExplanation=" + showAnswerExplanation + ", arrayAnswer=" + arrayAnswer + "]";
	}

}
