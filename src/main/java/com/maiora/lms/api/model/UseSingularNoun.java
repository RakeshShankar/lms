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
@Table(name = "usesingularnoun")
public class UseSingularNoun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "singular_id")
	private long singular_id;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "lessonwrite_id", nullable = false)
	private LessonWrite lessonWrite;

	public long getSingular_id() {
		return singular_id;
	}

	public void setSingular_id(long singular_id) {
		this.singular_id = singular_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LessonWrite getLessonWrite() {
		return lessonWrite;
	}

	public void setLessonWrite(LessonWrite lessonWrite) {
		this.lessonWrite = lessonWrite;
	}

	@Override
	public String toString() {
		return "UseSingularNoun [singular_id=" + singular_id + ", description=" + description + ", lessonWrite="
				+ lessonWrite + "]";
	}
	
	
}
