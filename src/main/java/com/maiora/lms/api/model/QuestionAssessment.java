package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question_assessment")
public class QuestionAssessment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Integer index;

	private String type;

	private Integer description;

	@OneToMany(targetEntity = OptionAssessment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iad_fk", referencedColumnName = "id")
	private List<OptionAssessment> options = new ArrayList<>();

	private Integer answer;

	@Column(name = "answer_explanation")
	private String answerExplanation;

	@Column(name = "user_answered")
	private String userAnswered;

	@Column(name = "auto_evaluate")
	private Boolean autoEvaluate;
	
	@OneToMany(targetEntity = AnswerAssessment.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iaa_fk", referencedColumnName = "id")
	private List<AnswerAssessment> arrayAnswer = new ArrayList<>();

	@Column(name = "show_answer_explanation")
	private boolean showAnswerExplanation;

	@Column(name = "marks_obtained")
	private Integer marksObtained;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDescription() {
		return description;
	}

	public void setDescription(Integer description) {
		this.description = description;
	}

	public List<OptionAssessment> getOptions() {
		return options;
	}

	public void setOptions(List<OptionAssessment> options) {
		this.options = options;
	}

	public Integer getAnswer() {
		return answer;
	}

	public void setAnswer(Integer answer) {
		this.answer = answer;
	}

	public String getAnswerExplanation() {
		return answerExplanation;
	}

	public void setAnswerExplanation(String answerExplanation) {
		this.answerExplanation = answerExplanation;
	}

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	public Boolean getAutoEvaluate() {
		return autoEvaluate;
	}

	public void setAutoEvaluate(Boolean autoEvaluate) {
		this.autoEvaluate = autoEvaluate;
	}

	public List<AnswerAssessment> getArrayAnswer() {
		return arrayAnswer;
	}

	public void setArrayAnswer(List<AnswerAssessment> arrayAnswer) {
		this.arrayAnswer = arrayAnswer;
	}

	public boolean isShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(boolean showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	public Integer getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(Integer marksObtained) {
		this.marksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "QuestionAssessment [id=" + id + ", index=" + index + ", type=" + type + ", description=" + description
				+ ", options=" + options + ", answer=" + answer + ", answerExplanation=" + answerExplanation
				+ ", userAnswered=" + userAnswered + ", autoEvaluate=" + autoEvaluate + ", arrayAnswer=" + arrayAnswer
				+ ", showAnswerExplanation=" + showAnswerExplanation + ", marksObtained=" + marksObtained + "]";
	}

}
