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
@IdClass(ListenExerciseQuestionsPK.class)
@Table(name = "listenexercisequestions")
public class ListenExerciseQuestions {
	@Id
	private int index;

	@Id
	@JsonIgnore
	private double unk = Math.random() * 100;

	private String type;

	private String description;

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

	@OneToMany(targetEntity = MultipleQuestionListen.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "iid_fk", referencedColumnName = "index"),
			@JoinColumn(name = "imqd_fk", referencedColumnName = "unk") })
	private List<MultipleQuestionListen> multiplequestion = new ArrayList<>();

	@OneToMany(targetEntity = OptionsListen.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "iod_fk", referencedColumnName = "index"),
			@JoinColumn(name = "iood_fk", referencedColumnName = "unk") })
	private List<OptionsListen> options = new ArrayList<>();

	private String auto_evaluate;

	ArrayList<Object> userAnswered = new ArrayList<Object>();

	@ElementCollection
	@OrderColumn
	String[] answer = new String[4];

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

	public String getAudioSrc() {
		return audioSrc;
	}

	public void setAudioSrc(String audioSrc) {
		this.audioSrc = audioSrc;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public String getTranscript() {
		return transcript;
	}

	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}

	public String getMainQuestion() {
		return mainQuestion;
	}

	public void setMainQuestion(String mainQuestion) {
		this.mainQuestion = mainQuestion;
	}

	public String getSubQuestion() {
		return subQuestion;
	}

	public void setSubQuestion(String subQuestion) {
		this.subQuestion = subQuestion;
	}

	public String getAnswerExplaination() {
		return answerExplaination;
	}

	public void setAnswerExplaination(String answerExplaination) {
		this.answerExplaination = answerExplaination;
	}

	public List<MultipleQuestionListen> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(List<MultipleQuestionListen> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public List<OptionsListen> getOptions() {
		return options;
	}

	public void setOptions(List<OptionsListen> options) {
		this.options = options;
	}

	public String getAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(String auto_evaluate) {
		this.auto_evaluate = auto_evaluate;
	}

	public ArrayList<Object> getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(ArrayList<Object> userAnswered) {
		this.userAnswered = userAnswered;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String[] answer) {
		this.answer = answer;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ListenExerciseQuestions [index=" + index + ", type=" + type + ", description=" + description
				+ ", audioSrc=" + audioSrc + ", imgSrc=" + imgSrc + ", transcript=" + transcript + ", mainQuestion="
				+ mainQuestion + ", subQuestion=" + subQuestion + ", answerExplaination=" + answerExplaination
				+ ", multiplequestion=" + multiplequestion + ", options=" + options + ", auto_evaluate=" + auto_evaluate
				+ ", userAnswered=" + userAnswered + ", answer=" + Arrays.toString(answer) + ", arrayAnswer="
				+ arrayAnswer + ", MarksObtained=" + MarksObtained + "]";
	}

}
