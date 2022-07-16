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
@Table(name = "speakintroduction")
public class SpeakIntroduction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int speakid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "introid")
	private IntroductionSpeaking introduction;

	@OneToMany(targetEntity = LessonsSpeaking.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ilid_fk", referencedColumnName = "speakid")
	private List<LessonsSpeaking> lessons = new ArrayList<>();

	public int getSpeakid() {
		return speakid;
	}

	public void setSpeakid(int speakid) {
		this.speakid = speakid;
	}

	public IntroductionSpeaking getIntroduction() {
		return introduction;
	}

	public void setIntroduction(IntroductionSpeaking introduction) {
		this.introduction = introduction;
	}

	public List<LessonsSpeaking> getLessons() {
		return lessons;
	}

	public void setLessons(List<LessonsSpeaking> lessons) {
		this.lessons = lessons;
	}

	@Override
	public String toString() {
		return "SpeakIntroduction [speakid=" + speakid + ", introduction=" + introduction + ", lessons=" + lessons
				+ "]";
	}

}
