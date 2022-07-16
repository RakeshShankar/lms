package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "questionstestmodel")
public class QuestionsTestModel {

	@Id
	public int index;

	public String type;

	@OneToMany(targetEntity = OptionTestModel.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iod_fk", referencedColumnName = "index")
	private List<OptionTestModel> options = new ArrayList<>();

	public boolean auto_evaluate;

	@ElementCollection
	@OrderColumn
	String[] answer = new String[6];

	@Column(name = "answer_explaination")
	public String answerExplaination;

	@Column(name = "marks_obtained")
	public int MarksObtained;

	ArrayList<Object> userAnswered = new ArrayList<Object>();

	@Column(name = "show_answer_explanation")
	public boolean showAnswerExplanation;

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

	public List<OptionTestModel> getOptions() {
		return options;
	}

	public void setOptions(List<OptionTestModel> options) {
		this.options = options;
	}

	public boolean getAuto_evaluate() {
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

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	public ArrayList<Object> getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(ArrayList<Object> userAnswered) {
		this.userAnswered = userAnswered;
	}

	public boolean getShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(boolean showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	@Override
	public String toString() {
		return "QuestionsTestModel [index=" + index + ", type=" + type + ", options=" + options + ", auto_evaluate="
				+ auto_evaluate + ", answer=" + Arrays.toString(answer) + ", answerExplaination=" + answerExplaination
				+ ", MarksObtained=" + MarksObtained + ", userAnswered=" + userAnswered + ", showAnswerExplanation="
				+ showAnswerExplanation + "]";
	}

}
