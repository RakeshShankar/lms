package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "questionswritethree")
public class QuestionsWriteThree {

	@Id
	private int index;

	private String type;

	@JsonProperty("userAnswered")
	private String user_answered;

	@JsonProperty("mainQuestion")
	private String main_question;

	@JsonProperty("sub1Question")
	private String sub1_question;

	private String answer;

	@JsonProperty("multiplequestion")
	ArrayList<Object> multiplequestion = new ArrayList<Object>();

	@OneToMany(targetEntity = OptionsThree.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iotd_fk", referencedColumnName = "index")
	private List<OptionsThree> options = new ArrayList<>();

	private String auto_evaluate;

	@JsonProperty("answerExplaination")
	private String answer_explaination;

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

	public String getMain_question() {
		return main_question;
	}

	public void setMain_question(String main_question) {
		this.main_question = main_question;
	}

	public List<OptionsThree> getOptions() {
		return options;
	}

	public void setOptions(List<OptionsThree> options) {
		this.options = options;
	}

	public String getAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(String auto_evaluate) {
		this.auto_evaluate = auto_evaluate;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer_explaination() {
		return answer_explaination;
	}

	public void setAnswer_explaination(String answer_explaination) {
		this.answer_explaination = answer_explaination;
	}

	public String getUser_answered() {
		return user_answered;
	}

	public void setUser_answered(String user_answered) {
		this.user_answered = user_answered;
	}

	public ArrayList<Object> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(ArrayList<Object> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public String getSub1_question() {
		return sub1_question;
	}

	public void setSub1_question(String sub1_question) {
		this.sub1_question = sub1_question;
	}

	@Override
	public String toString() {
		return "QuestionsWriteThree [index=" + index + ", type=" + type + ", user_answered=" + user_answered
				+ ", main_question=" + main_question + ", sub1_question=" + sub1_question + ", answer=" + answer
				+ ", multiplequestion=" + multiplequestion + ", options=" + options + ", auto_evaluate=" + auto_evaluate
				+ ", answer_explaination=" + answer_explaination + "]";
	}

}