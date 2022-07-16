package com.maiora.lms.api.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questionstest")
public class QuestionsTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "index")
	private int index;

	@Column(name = "type")
	private String type;

	@Column(name = "auto_evaluate")
	private Boolean auto_evaluate;

	@Column(name = "answer")
	private String answer;

	@Column(name = "answer_explaination")
	private String answer_explaination;

	@Column(name = "user_answered")
	private String user_answered;
	
	@OneToMany(mappedBy = "testquestions")
	private Set<Options> options;
	
	@ManyToOne
	@JoinColumn(name = "readtest_id", nullable = false)
	private IELTSReadTest ieltsReadTest;

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

	public Boolean getAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(Boolean auto_evaluate) {
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

	public Set<Options> getOptions() {
		return options;
	}

	public void setOptions(Set<Options> options) {
		this.options = options;
	}

	public IELTSReadTest getIeltsReadTest() {
		return ieltsReadTest;
	}

	public void setIeltsReadTest(IELTSReadTest ieltsReadTest) {
		this.ieltsReadTest = ieltsReadTest;
	}

	@Override
	public String toString() {
		return "QuestionsTest [index=" + index + ", type=" + type + ", auto_evaluate=" + auto_evaluate + ", answer="
				+ answer + ", answer_explaination=" + answer_explaination + ", user_answered=" + user_answered
				+ ", options=" + options + ", ieltsReadTest=" + ieltsReadTest + "]";
	}

	

}


