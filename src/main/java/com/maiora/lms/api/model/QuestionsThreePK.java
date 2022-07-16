package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestionsThreePK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int index;

	@JsonProperty("mainQuestion")
	private String main_question;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getMain_question() {
		return main_question;
	}

	public void setMain_question(String main_question) {
		this.main_question = main_question;
	}

	@Override
	public int hashCode() {
		return Objects.hash(index, main_question);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionsThreePK other = (QuestionsThreePK) obj;
		return index == other.index && Objects.equals(main_question, other.main_question);
	}

	@Override
	public String toString() {
		return "QuestionsThreePK [index=" + index + ", main_question=" + main_question + "]";
	}

}
