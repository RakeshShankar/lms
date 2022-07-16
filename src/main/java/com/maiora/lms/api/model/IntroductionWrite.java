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
@Table(name = "introductionwrite")
public class IntroductionWrite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "intro_id")
	private long intro_id;

	@Column(name = "description1")
	private String description1;

	public long getIntro_id() {
		return intro_id;
	}

	public void setIntro_id(long intro_id) {
		this.intro_id = intro_id;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	@Override
	public String toString() {
		return "IntroductionWrite [intro_id=" + intro_id + ", description1=" + description1 + "]";
	}

}
