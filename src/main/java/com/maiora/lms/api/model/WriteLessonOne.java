package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "writelessonone")
public class WriteLessonOne {

	@Id
	private int index;

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "introid")
	private IntroWriteLesson introduction;

	private String theory;

	@OneToMany(targetEntity = ExcercisesWrite.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ielw_fk", referencedColumnName = "index")
	@JsonProperty("Excercises")
	private List<ExcercisesWrite> excercises = new ArrayList<>();

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IntroWriteLesson getIntroduction() {
		return introduction;
	}

	public void setIntroduction(IntroWriteLesson introduction) {
		this.introduction = introduction;
	}

	public String getTheory() {
		return theory;
	}

	public void setTheory(String theory) {
		this.theory = theory;
	}

	public List<ExcercisesWrite> getExcercises() {
		return excercises;
	}

	public void setExcercises(List<ExcercisesWrite> excercises) {
		this.excercises = excercises;
	}

	@Override
	public String toString() {
		return "WriteLessonOne [index=" + index + ", name=" + name + ", introduction=" + introduction + ", theory="
				+ theory + ", excercises=" + excercises + "]";
	}

}
