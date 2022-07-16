package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usepluralnoun")
public class UsePluralNoun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "plural_id")
	private long plural_id;

	@Column(name = "information")
	private String information;

	@ManyToOne
	@JoinColumn(name = "lessonwrite_id", nullable = false)
	private LessonWrite lessonWrite;

	public long getPlural_id() {
		return plural_id;
	}

	public void setPlural_id(long plural_id) {
		this.plural_id = plural_id;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public LessonWrite getLessonWrite() {
		return lessonWrite;
	}

	public void setLessonWrite(LessonWrite lessonWrite) {
		this.lessonWrite = lessonWrite;
	}

	@Override
	public String toString() {
		return "UsePluralNoun [plural_id=" + plural_id + ", information=" + information + ", lessonWrite=" + lessonWrite
				+ "]";
	}

}
