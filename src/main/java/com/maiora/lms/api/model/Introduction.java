package com.maiora.lms.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "introduction")
public class Introduction {

//	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "intro_id")
	@JsonIgnore
	private int intro_id;

	@Column(name = "description1")
	private String description1;

	@Column(name = "description2")
	private String description2;

	@OneToMany(mappedBy = "introduction")
	private List<Image> images;

	@OneToMany(mappedBy = "introduction")
	private List<LessonsRead> lessons;

	public int getIntro_id() {
		return intro_id;
	}

	public void setIntro_id(int intro_id) {
		this.intro_id = intro_id;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<LessonsRead> getLessons() {
		return lessons;
	}

	public void setLessons(List<LessonsRead> lessons) {
		this.lessons = lessons;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

//	@Override
//	public String toString() {
//		return "Introduction [intro_id=" + intro_id + ", description1=" + description1 + ", description2="
//				+ description2 + ", images=" + images + ", lessons=" + lessons + "]";
//	}


	

}