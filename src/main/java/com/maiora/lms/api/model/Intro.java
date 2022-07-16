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
@Table(name = "intro")
public class Intro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int introid;

	private String description1;

	@OneToMany(targetEntity = ImagesIntroduct.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iid_fk", referencedColumnName = "introid")
	private List<ImagesIntroduct> images = new ArrayList<>();

	public int getIntroid() {
		return introid;
	}

	public void setIntroid(int introid) {
		this.introid = introid;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public List<ImagesIntroduct> getImages() {
		return images;
	}

	public void setImages(List<ImagesIntroduct> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Intro [introid=" + introid + ", description1=" + description1 + ", images=" + images + "]";
	}

}
