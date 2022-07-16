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
@Table(name = "questionexercise")
public class QuestionExercise {
	
	@Id
	private int index;

	private String type;

	ArrayList<Object> multiplequestion = new ArrayList<Object>();

	@OneToMany(targetEntity = OptionExercise.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iqeo_fk", referencedColumnName = "index")
	private List<OptionExercise> options = new ArrayList<OptionExercise>();

	private String answer;

	@JsonProperty("answerExplaination")
	private String answer_explaination;

	@JsonProperty("userAnswered")
	private String user_answered;

	ArrayList<Object> arrayAnswer = new ArrayList<Object>();

	@JsonProperty("showAnswerExplanation")
	private Boolean show_answer_explanation;

	@JsonProperty("MarksObtained")
	private int marks_obtained;

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

	public ArrayList<Object> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(ArrayList<Object> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public List<OptionExercise> getOptions() {
		return options;
	}

	public void setOptions(List<OptionExercise> options) {
		this.options = options;
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

	public ArrayList<Object> getArrayAnswer() {
		return arrayAnswer;
	}

	public void setArrayAnswer(ArrayList<Object> arrayAnswer) {
		this.arrayAnswer = arrayAnswer;
	}

	public Boolean getShow_answer_explanation() {
		return show_answer_explanation;
	}

	public void setShow_answer_explanation(Boolean show_answer_explanation) {
		this.show_answer_explanation = show_answer_explanation;
	}

	public int getMarks_obtained() {
		return marks_obtained;
	}

	public void setMarks_obtained(int marks_obtained) {
		this.marks_obtained = marks_obtained;
	}

	@Override
	public String toString() {
		return "QuestionExercise [index=" + index + ", type=" + type + ", multiplequestion=" + multiplequestion
				+ ", options=" + options + ", answer=" + answer + ", answer_explaination=" + answer_explaination
				+ ", user_answered=" + user_answered + ", arrayAnswer=" + arrayAnswer + ", show_answer_explanation="
				+ show_answer_explanation + ", marks_obtained=" + marks_obtained + "]";
	}


}
