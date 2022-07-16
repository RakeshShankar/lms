package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "answeringstratergy")
public class AnsweringStratergy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "answerid")
	@JsonIgnore
	private int answerid;

	@Column(name = "description")
	private String description;

	public int getAnswerid() {
		return answerid;
	}

	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AnsweringStratergy [answerid=" + answerid + ", description=" + description + "]";
	}

}
