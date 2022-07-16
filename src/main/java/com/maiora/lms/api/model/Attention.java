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
@Table(name = "attention")
public class Attention {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attention_id")
	private long attention_id;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "lessonwrite_id", nullable = false)
	private LessonWrite lessonWrite;

	public long getAttention_id() {
		return attention_id;
	}

	public void setAttention_id(long attention_id) {
		this.attention_id = attention_id;
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

	@Override
	public String toString() {
		return "Attention [attention_id=" + attention_id + ", description=" + description + ", lessonWrite="
				+ lessonWrite + "]";
	}

	public void setLessonWrite(LessonWrite lessonWrite) {
		this.lessonWrite = lessonWrite;
	}

}
