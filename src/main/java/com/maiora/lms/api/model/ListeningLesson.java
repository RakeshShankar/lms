package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "listeninglesson")
public class ListeningLesson {

	@Id
	private int index;

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "introid")
	private IntroductListen introduction;

	@OneToMany(targetEntity = ListenImages.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ilil_fk", referencedColumnName = "index")
	private List<ListenImages> images = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "exampleid")
	@JsonProperty("Example")
	private ExampleListen example;

	@OneToMany(targetEntity = AvoidDistraction.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ad_fk", referencedColumnName = "index")
	@JsonProperty("Avoid_distraction")
	private List<AvoidDistraction> avoid_distraction = new ArrayList<>();

	@OneToMany(targetEntity = ExcercisesListen.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "el_fk", referencedColumnName = "index")
	@JsonProperty("Excercises")
	private List<ExcercisesListen> excercises = new ArrayList<>();

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IntroductListen getIntroduction() {
		return introduction;
	}

	public void setIntroduction(IntroductListen introduction) {
		this.introduction = introduction;
	}

	public List<ListenImages> getImages() {
		return images;
	}

	public void setImages(List<ListenImages> images) {
		this.images = images;
	}

	public ExampleListen getExample() {
		return example;
	}

	public void setExample(ExampleListen example) {
		this.example = example;
	}

	public List<AvoidDistraction> getAvoid_distraction() {
		return avoid_distraction;
	}

	public void setAvoid_distraction(List<AvoidDistraction> avoid_distraction) {
		this.avoid_distraction = avoid_distraction;
	}

	public List<ExcercisesListen> getExcercises() {
		return excercises;
	}

	public void setExcercises(List<ExcercisesListen> excercises) {
		this.excercises = excercises;
	}

	@Override
	public String toString() {
		return "ListeningLesson [index=" + index + ", name=" + name + ", introduction=" + introduction + ", images="
				+ images + ", example=" + example + ", avoid_distraction=" + avoid_distraction + ", excercises="
				+ excercises + "]";
	}

}
