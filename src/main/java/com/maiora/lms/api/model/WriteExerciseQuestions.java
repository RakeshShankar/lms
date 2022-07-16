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

import com.fasterxml.jackson.annotation.JsonIgnore;

@IdClass(WriteExerciseQuestionsPK.class)
@Entity
@Table(name = "writeexercisequestions")
public class WriteExerciseQuestions implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	@Id
	@JsonIgnore
	private double unk = Math.random() * 100;

	private String type;

	@OneToMany(targetEntity = MultipleQuestionExcercises.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "iid_fk", referencedColumnName = "index"),
		@JoinColumn(name = "iek_fk", referencedColumnName = "unk") })
	private List<MultipleQuestionExcercises> multiplequestion = new ArrayList<>();

	@OneToMany(targetEntity = Optionss.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "iid_fk", referencedColumnName = "index"),
			@JoinColumn(name = "iek_fk", referencedColumnName = "unk") })
	private List<Optionss> options = new ArrayList<>();

	@ElementCollection
	@OrderColumn
	String[] answer = new String[4];

	@Column(name = "user_answered")
	private String userAnswered;

	@Column(name = "answer_explaination")
	private String answerExplaination;

	@Column(name = "show_answer_explanation")
	private String showAnswerExplanation;
	
	@Column(name = "main_question")
	private String mainQuestion;

	@Column(name = "sub1_question")
	private String sub1Question;

	ArrayList<Object> arrayAnswer = new ArrayList<Object>();

	@Column(name = "marks_obtained")
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

	public double getUnk() {
		return unk;
	}

	public void setUnk(double unk) {
		this.unk = unk;
	}

	public List<MultipleQuestionExcercises> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(List<MultipleQuestionExcercises> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public List<Optionss> getOptions() {
		return options;
	}

	public void setOptions(List<Optionss> options) {
		this.options = options;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
		this.answer = answer;
	}

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	public String getAnswerExplaination() {
		return answerExplaination;
	}

	public void setAnswerExplaination(String answerExplaination) {
		this.answerExplaination = answerExplaination;
	}

	public String getShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(String showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	public ArrayList<Object> getArrayAnswer() {
		return arrayAnswer;
	}

	public void setArrayAnswer(ArrayList<Object> arrayAnswer) {
		this.arrayAnswer = arrayAnswer;
	}

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "WriteExerciseQuestions [index=" + index + ", unk=" + unk + ", type=" + type + ", multiplequestion="
				+ multiplequestion + ", options=" + options + ", answer=" + Arrays.toString(answer) + ", userAnswered="
				+ userAnswered + ", answerExplaination=" + answerExplaination + ", showAnswerExplanation="
				+ showAnswerExplanation + ", arrayAnswer=" + arrayAnswer + ", MarksObtained=" + MarksObtained + "]";
	}

}
