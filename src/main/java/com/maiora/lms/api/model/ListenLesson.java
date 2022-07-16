package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "listenlesson")
public class ListenLesson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "introid")
	private Intro introduction;

	@OneToMany(targetEntity = LessonsIntro.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ind_fk", referencedColumnName = "id")
	private List<LessonsIntro> lessons = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Intro getIntroduction() {
		return introduction;
	}

	public void setIntroduction(Intro introduction) {
		this.introduction = introduction;
	}

	public List<LessonsIntro> getLessons() {
		return lessons;
	}

	public void setLessons(List<LessonsIntro> lessons) {
		this.lessons = lessons;
	}

	@Override
	public String toString() {
		return "ListenLesson [id=" + id + ", introduction=" + introduction + ", lessons=" + lessons + "]";
	}

}
