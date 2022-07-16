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
@Table(name = "listenintroduction")
public class ListenIntroduction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int listenid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "introid")
	private IntroductionListening introduction;

	@OneToMany(targetEntity = LessonsListening.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ilid_fk", referencedColumnName = "listenid")
	private List<LessonsListening> lessons = new ArrayList<>();

	public int getListenid() {
		return listenid;
	}

	public void setListenid(int listenid) {
		this.listenid = listenid;
	}

	public IntroductionListening getIntroduction() {
		return introduction;
	}

	public void setIntroduction(IntroductionListening introduction) {
		this.introduction = introduction;
	}

	public List<LessonsListening> getLessons() {
		return lessons;
	}

	public void setLessons(List<LessonsListening> lessons) {
		this.lessons = lessons;
	}

	@Override
	public String toString() {
		return "ListenIntroduction [listenid=" + listenid + ", introduction=" + introduction + ", lessons=" + lessons
				+ "]";
	}

}
