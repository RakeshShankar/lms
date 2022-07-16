package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class MultipleQuestionListenPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int index;

	private String answer;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(answer, index);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MultipleQuestionListenPK other = (MultipleQuestionListenPK) obj;
		return Objects.equals(answer, other.answer) && index == other.index;
	}

	@Override
	public String toString() {
		return "MultipleQuestionListenPK [index=" + index + ", answer=" + answer + "]";
	}

	public MultipleQuestionListenPK(int index, String answer) {
		this.index = index;
		this.answer = answer;
	}

	public MultipleQuestionListenPK() {
	}

}
