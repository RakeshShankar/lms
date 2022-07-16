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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "introductionspeaking")
public class IntroductionSpeaking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;

	private String description1;

	private String description2;

	private String description3;

	@OneToMany(targetEntity = ImagesListen.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iil_fk", referencedColumnName = "id")
	private List<ImagesListen> images = new ArrayList<>();

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getDescription3() {
		return description3;
	}

	public void setDescription3(String description3) {
		this.description3 = description3;
	}

	public List<ImagesListen> getImages() {
		return images;
	}

	public void setImages(List<ImagesListen> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "IntroductionSpeaking [id=" + id + ", description1=" + description1 + ", description2=" + description2
				+ ", description3=" + description3 + ", images=" + images + "]";
	}

	
}
