package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@IdClass(QuestionsThreePK.class)
@Table(name = "questionsthree")
public class QuestionsThree implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	private String type;

	@Id
	@JsonProperty("mainQuestion")
	private String main_question;

	@OneToMany(targetEntity = OptionsThreeExer.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "ioqt_fk", referencedColumnName = "index"),
			@JoinColumn(name = "ioqtii_fk", referencedColumnName = "main_question") })
	private List<OptionsThreeExer> options = new ArrayList<>();

	private String auto_evaluate;

	private String[] answer = new String[4];

	@JsonProperty("answerExplaination")
	private String answer_explaination;

	ArrayList<Object> userAnswered = new ArrayList<Object>();

	ArrayList<Object> multiplequestion = new ArrayList<Object>();

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

	public String getMain_question() {
		return main_question;
	}

	public void setMain_question(String main_question) {
		this.main_question = main_question;
	}

	public List<OptionsThreeExer> getOptions() {
		return options;
	}

	public void setOptions(List<OptionsThreeExer> options) {
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

	public String getAnswer_explaination() {
		return answer_explaination;
	}

	public void setAnswer_explaination(String answer_explaination) {
		this.answer_explaination = answer_explaination;
	}

	public ArrayList<Object> getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(ArrayList<Object> userAnswered) {
		this.userAnswered = userAnswered;
	}

	public ArrayList<Object> getMultiplequestion() {
		return multiplequestion;
	}

	public void setMultiplequestion(ArrayList<Object> multiplequestion) {
		this.multiplequestion = multiplequestion;
	}

	public int getMarks_obtained() {
		return marks_obtained;
	}

	public void setMarks_obtained(int marks_obtained) {
		this.marks_obtained = marks_obtained;
	}

	@Override
	public String toString() {
		return "QuestionsThree [index=" + index + ", type=" + type + ", main_question=" + main_question + ", options="
				+ options + ", auto_evaluate=" + auto_evaluate + ", answer=" + answer + ", answer_explaination="
				+ answer_explaination + ", userAnswered=" + userAnswered + ", multiplequestion=" + multiplequestion
				+ ", marks_obtained=" + marks_obtained + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(answer, answer_explaination, auto_evaluate, index, main_question, marks_obtained,
				multiplequestion, options, type, userAnswered);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionsThree other = (QuestionsThree) obj;
		return Objects.equals(answer, other.answer) && Objects.equals(answer_explaination, other.answer_explaination)
				&& Objects.equals(auto_evaluate, other.auto_evaluate) && index == other.index
				&& Objects.equals(main_question, other.main_question) && marks_obtained == other.marks_obtained
				&& Objects.equals(multiplequestion, other.multiplequestion) && Objects.equals(options, other.options)
				&& Objects.equals(type, other.type) && Objects.equals(userAnswered, other.userAnswered);
	}

	public QuestionsThree(int index, String type, String main_question, List<OptionsThreeExer> options,
			String auto_evaluate, String[] answer, String answer_explaination, ArrayList<Object> userAnswered,
			ArrayList<Object> multiplequestion, int marks_obtained) {
		this.index = index;
		this.type = type;
		this.main_question = main_question;
		this.options = options;
		this.auto_evaluate = auto_evaluate;
		this.answer = answer;
		this.answer_explaination = answer_explaination;
		this.userAnswered = userAnswered;
		this.multiplequestion = multiplequestion;
		this.marks_obtained = marks_obtained;
	}

	public QuestionsThree() {
	}

}
