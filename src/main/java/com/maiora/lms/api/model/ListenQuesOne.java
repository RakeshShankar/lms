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
@Table(name = "listenquesone")
public class ListenQuesOne {

	@Id
	private int index;

	private String type;

	@Column(name = "audio_src")
	private String audioSrc;

	@Column(name = "img_src")
	private String imgSrc;

	private String transcript;

	@Column(name = "main_question")
	private String mainQuestion;

	@Column(name = "sub_question")
	private String subQuestion;

	@Column(name = "sub_question1")
	private String subQuestion1;

	@Column(name = "answer_explaination")
	private String answerExplaination;

	@OneToMany(targetEntity = MultipleQuestion.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "imql_fk", referencedColumnName = "index")
	private List<MultipleQuestion> multiplequestion = new ArrayList<>();

	private String auto_evaluate;

	@OneToMany(targetEntity = ListenOptionsOne.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ilo_fk", referencedColumnName = "index")
	private List<ListenOptionsOne> options = new ArrayList<>();

	@JsonProperty("userAnswered")
	ArrayList<Object> userAnswered = new ArrayList<Object>();

	@JsonProperty("answer")
	ArrayList<Object> answer = new ArrayList<Object>();

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

	public String getAudioSrc() {
		return audioSrc;
	}

	public void setAudioSrc(String audioSrc) {
		this.audioSrc = audioSrc;
	}

	public String getMainQuestion() {
		return mainQuestion;
	}

	public void setMainQuestion(String mainQuestion) {
		this.mainQuestion = mainQuestion;
	}

	public String getTranscript() {
		return transcript;
	}

	public void setTranscript(String transcript) {
		this.transcript = transcript;
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

	public ArrayList<Object> getAnswer() {
		return answer;
	}

	public void setAnswer(ArrayList<Object> answer) {
		this.answer = answer;
	}

	public List<MultipleQuestion> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(List<MultipleQuestion> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	public String getSubQuestion() {
		return subQuestion;
	}

	public void setSubQuestion(String subQuestion) {
		this.subQuestion = subQuestion;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public String getSubQuestion1() {
		return subQuestion1;
	}

	public void setSubQuestion1(String subQuestion1) {
		this.subQuestion1 = subQuestion1;
	}

	@Override
	public String toString() {
		return "ListenQuesOne [index=" + index + ", type=" + type + ", audioSrc=" + audioSrc + ", imgSrc=" + imgSrc
				+ ", transcript=" + transcript + ", mainQuestion=" + mainQuestion + ", subQuestion=" + subQuestion
				+ ", subQuestion1=" + subQuestion1 + ", answerExplaination=" + answerExplaination
				+ ", multiplequestion=" + multiplequestion + ", auto_evaluate=" + auto_evaluate + ", options=" + options
				+ ", userAnswered=" + userAnswered + ", answer=" + answer + ", MarksObtained=" + MarksObtained + "]";
	}

}
