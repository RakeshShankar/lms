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

@Entity
@Table(name = "listenintrod")
public class ListenIntrod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "intid")
	private int intid;

	@Column(name = "description1")
	private String description1;

	@Column(name = "description2")
	private String description2;

	@OneToMany(targetEntity = IntroLesssons.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iidli_fk", referencedColumnName = "intid")
	private List<IntroLesssons> lessons = new ArrayList<>();

	ArrayList<Object> listeningImage = new ArrayList<Object>();

	public int getIntid() {
		return intid;
	}

	public void setIntid(int intid) {
		this.intid = intid;
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

	public List<IntroLesssons> getLessons() {
		return lessons;
	}

	public void setLessons(List<IntroLesssons> lessons) {
		this.lessons = lessons;
	}

	public ArrayList<Object> getListeningImage() {
		return listeningImage;
	}

	public void setListeningImage(ArrayList<Object> listeningImage) {
		this.listeningImage = listeningImage;
	}

	@Override
	public String toString() {
		return "ListenIntrod [intid=" + intid + ", description1=" + description1 + ", description2=" + description2
				+ ", lessons=" + lessons + ", listeningImage=" + listeningImage + "]";
	}

}
