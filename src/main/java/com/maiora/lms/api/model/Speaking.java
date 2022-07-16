package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@IdClass(SpeakingPK.class)
@Table(name = "speaking")
public class Speaking implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	@Id
	private String type;

	@OneToMany(targetEntity = Answers.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "iid_fk", referencedColumnName = "index"),
			@JoinColumn(name = "code", referencedColumnName = "type") })
	private List<Answers> answers = new ArrayList<>();

	private String name;

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

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarksObtained() {
		return MarksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		MarksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "Speaking [index=" + index + ", type=" + type + ", answers=" + answers + ", name=" + name
				+ ", MarksObtained=" + MarksObtained + "]";
	}

}
