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

@Entity
@IdClass(LessonExerQuestionsPK.class)
@Table(name = "lessonexerquestions")
public class LessonExerQuestions implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int index;
	
	@Id
	@JsonIgnore
	private double unk = Math.random() * 100;

	private String description;

	private String type;

	@Column(name = "main_question")
	private String mainQuestion;

	@OneToMany(targetEntity = LesExeOptions.class, cascade = CascadeType.ALL)
	@JoinColumns({
	    @JoinColumn(name = "iid_fk", referencedColumnName = "index"),
	    @JoinColumn(name = "iek_fk", referencedColumnName = "unk")})
	private List<LesExeOptions> options = new ArrayList<>();
	
	private String auto_evaluate;

	@ElementCollection
	@OrderColumn
	String[] answer = new String[4];

	@Column(name = "answer_explaination")
	private String answerExplaination;

	@Column(name = "user_answered")
	ArrayList<Object> userAnswered = new ArrayList<Object>();

	@Column(name = "show_answer_explanation")
	private boolean showAnswerExplanation;

	ArrayList<Object> multiplequestion = new ArrayList<Object>();

	@Column(name = "marks_obtained")
	private int MarksObtained;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
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

	public String getMainQuestion() {
		return mainQuestion;
	}

	public void setMainQuestion(String mainQuestion) {
		this.mainQuestion = mainQuestion;
	}

	public List<LesExeOptions> getOptions() {
		return options;
	}

	public void setOptions(List<LesExeOptions> options) {
		this.options = options;
	}

	public String getAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(String auto_evaluate) {
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

	public boolean isShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(boolean showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	public ArrayList<Object> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(ArrayList<Object> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "LessonExerQuestions [index=" + index + ", description=" + description + ", type=" + type
				+ ", mainQuestion=" + mainQuestion + ", options=" + options + ", auto_evaluate=" + auto_evaluate
				+ ", answer=" + Arrays.toString(answer) + ", answerExplaination=" + answerExplaination
				+ ", userAnswered=" + userAnswered + ", showAnswerExplanation=" + showAnswerExplanation
				+ ", multiplequestion=" + multiplequestion + ", MarksObtained=" + MarksObtained + "]";
	}

}
