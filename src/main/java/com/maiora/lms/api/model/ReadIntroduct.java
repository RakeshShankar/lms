package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "readintroduct")
public class ReadIntroduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "introid")
	@JsonIgnore
	private int introid;

	@Column(name = "description1")
	private String description1;

	@Column(name = "description2")
	private String description2;

	@OneToMany(targetEntity = ReadImages.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "irir_fk", referencedColumnName = "introid")
	private List<ReadImages> images = new ArrayList<>();

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

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public List<ReadImages> getImages() {
		return images;
	}

	public void setImages(List<ReadImages> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "ReadIntroduct [introid=" + introid + ", description1=" + description1 + ", description2=" + description2
				+ ", images=" + images + "]";
	}

}
