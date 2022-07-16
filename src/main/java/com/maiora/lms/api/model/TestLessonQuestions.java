package com.maiora.lms.api.model;

import java.io.Serializable;
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

@Entity
@IdClass(TestLessonQuestionsPK.class)
@Table(name = "testlessonquestions")
public class TestLessonQuestions implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	private int index;

	@Id
	private double unk = Math.random() * 100;

	private String type;

	@OneToMany(targetEntity = TestLessonOptions.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "iid_fk", referencedColumnName = "index"),
			@JoinColumn(name = "iolt_fk", referencedColumnName = "unk") })
	private List<TestLessonOptions> options = new ArrayList<>();

	@ElementCollection
	@OrderColumn
	String[] answer = new String[4];

	private String auto_evaluate;

	@Column(name = "answer_explaination")
	private String answerExplaination;

	ArrayList<Object> userAnswered = new ArrayList<Object>();

	@Column(name = "marks_obtained")
	private int MarksObtained;

	ArrayList<Object> arrayAnswer = new ArrayList<Object>();

	@Column(name = "show_answer_explanation")
	private String showAnswerExplanation;

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

	public List<TestLessonOptions> getOptions() {
		return options;
	}

	public void setOptions(List<TestLessonOptions> options) {
		this.options = options;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
		this.answer = answer;
	}

	public String getAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(String auto_evaluate) {
		this.auto_evaluate = auto_evaluate;
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

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	public ArrayList<Object> getArrayAnswer() {
		return arrayAnswer;
	}

	public void setArrayAnswer(ArrayList<Object> arrayAnswer) {
		this.arrayAnswer = arrayAnswer;
	}

	public String getShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(String showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	@Override
	public String toString() {
		return "TestLessonQuestions [index=" + index + ", type=" + type + ", options=" + options + ", answer="
				+ Arrays.toString(answer) + ", auto_evaluate=" + auto_evaluate + ", answerExplaination="
				+ answerExplaination + ", userAnswered=" + userAnswered + ", MarksObtained=" + MarksObtained
				+ ", arrayAnswer=" + arrayAnswer + ", showAnswerExplanation=" + showAnswerExplanation + "]";
	}

}
