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
@Table(name = "testking")
public class TestKing {

	@Id
	public int index;

	public String type;

	public boolean auto_evaluate;

	@Column(name = "answer_explaination")
	public String answerExplaination;

	public ArrayList<Boolean> userAnswered;

	@JsonProperty("MarksObtained")
	public int marks_obtained;

	public ArrayList<Object> arrayAnswer;

	@Column(name = "show_answer_explanation")
	public boolean showAnswerExplanation;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "answerid")
	

//	private  answer;
	
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "answerid")
//	private Answer1 answer;

//	@Entity
//	@Table(name = "answer")
//	class Answer {
//
//		@Id
//		@GeneratedValue(strategy = GenerationType.IDENTITY)
//		private int id1;
//
//		private String answer;

//		@Entity
//		@Table(name = "answer1")
//		class Answer1 {
//			@Id
//			@GeneratedValue(strategy = GenerationType.IDENTITY)
//			private int id2;
//
//			private int answer;
//
//			public int getId2() {
//				return id2;
//			}
//
//			public void setId2(int id2) {
//				this.id2 = id2;
//			}
//
//			public int getAnswer() {
//				return answer;
//			}
//
//			public void setAnswer(int answer) {
//				this.answer = answer;
//			}
//
//			@Override
//			public String toString() {
//				return "Answer1 [id1=" + id1 + ", answer=" + answer + "]";
//			}
//
//		}

//		public int getId1() {
//			return id1;
//		}
//
//		public void setId1(int id1) {
//			this.id1 = id1;
//		}
//
//		public String getAnswer() {
//			return answer;
//		}
//
//		public void setAnswer(String answer) {
//			this.answer = answer;
//		}
//
//		@Override
//		public String toString() {
//			return "Answer [id1=" + id1 + ", answer=" + answer + "]";
//		}
//
//	}

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

	public boolean isAuto_evaluate() {
		return auto_evaluate;
	}

	public void setAuto_evaluate(boolean auto_evaluate) {
		this.auto_evaluate = auto_evaluate;
	}

	public int getMarks_obtained() {
		return marks_obtained;
	}

	public void setMarks_obtained(int marks_obtained) {
		this.marks_obtained = marks_obtained;
	}

	public String getAnswerExplaination() {
		return answerExplaination;
	}

	public void setAnswerExplaination(String answerExplaination) {
		this.answerExplaination = answerExplaination;
	}

	public ArrayList<Boolean> getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(ArrayList<Boolean> userAnswered) {
		this.userAnswered = userAnswered;
	}

	public ArrayList<Object> getArrayAnswer() {
		return arrayAnswer;
	}

	public void setArrayAnswer(ArrayList<Object> arrayAnswer) {
		this.arrayAnswer = arrayAnswer;
	}

	public boolean isShowAnswerExplanation() {
		return showAnswerExplanation;
	}

	public void setShowAnswerExplanation(boolean showAnswerExplanation) {
		this.showAnswerExplanation = showAnswerExplanation;
	}

	@Override
	public String toString() {
		return "TestKing [index=" + index + ", type=" + type + ", auto_evaluate=" + auto_evaluate
				+ ", answerExplaination=" + answerExplaination + ", userAnswered=" + userAnswered + ", marks_obtained="
				+ marks_obtained + ", arrayAnswer=" + arrayAnswer + ", showAnswerExplanation=" + showAnswerExplanation
				+ "]";
	}

}
