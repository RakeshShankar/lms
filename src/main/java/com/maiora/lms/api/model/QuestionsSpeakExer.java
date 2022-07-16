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
@Table(name = "questionsspeakexer")
public class QuestionsSpeakExer {
	@Id
	private int index;

	private String description;

	private String type;

	@OneToMany(targetEntity = OptionsExcercises.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ioe_fk", referencedColumnName = "index")
	private List<OptionsExcercises> options = new ArrayList<>();

	private int answer;

	@JsonProperty("answerExplaination")
	private String answer_explaination;

	@JsonProperty("userAnswered")
	private String user_answered;

	ArrayList<Object> arrayAnswer = new ArrayList<Object>();

	@JsonProperty("showAnswerExplanation")
	private boolean show_answer_explanation;

	@JsonProperty("MarksObtained")
	private int marks_obtained;

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

	public List<OptionsExcercises> getOptions() {
		return options;
	}

	public void setOptions(List<OptionsExcercises> options) {
		this.options = options;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
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

	public boolean isShow_answer_explanation() {
		return show_answer_explanation;
	}

	public void setShow_answer_explanation(boolean show_answer_explanation) {
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
		return "QuestionsSpeakExer [index=" + index + ", description=" + description + ", type=" + type + ", options="
				+ options + ", answer=" + answer + ", answer_explaination=" + answer_explaination + ", user_answered="
				+ user_answered + ", arrayAnswer=" + arrayAnswer + ", show_answer_explanation="
				+ show_answer_explanation + ", marks_obtained=" + marks_obtained + "]";
	}

}
