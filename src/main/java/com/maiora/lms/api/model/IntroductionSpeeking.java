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
@Table(name = "introductionspeeking")
public class IntroductionSpeeking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private long speakid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "introdid")
	private IntrodSpeaking introduction;

	@OneToMany(targetEntity = LessonsIntrod.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "isi_fk", referencedColumnName = "speakid")
	private List<LessonsIntrod> lessons = new ArrayList<>();

	public long getSpeakid() {
		return speakid;
	}

	public void setSpeakid(long speakid) {
		this.speakid = speakid;
	}

	public IntrodSpeaking getIntroduction() {
		return introduction;
	}

	public void setIntroduction(IntrodSpeaking introduction) {
		this.introduction = introduction;
	}

	public List<LessonsIntrod> getLessons() {
		return lessons;
	}

	public void setLessons(List<LessonsIntrod> lessons) {
		this.lessons = lessons;
	}

	@Override
	public String toString() {
		return "IntroductionSpeeking [speakid=" + speakid + ", introduction=" + introduction + ", lessons=" + lessons
				+ "]";
	}

}
