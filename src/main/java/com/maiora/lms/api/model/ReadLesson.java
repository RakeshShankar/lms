package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "readlesson")
public class ReadLesson {
	@Id
	@Column(name = "index")
	private int index;

	@Column(name = "name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "read_lesson_id")
	private LessonIntrod introduction;

	@OneToMany(targetEntity = LesImage.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iirl_fk", referencedColumnName = "index")
	private List<LesImage> images = new ArrayList<>();

	@OneToMany(targetEntity = LesUsefulInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iirl_fk", referencedColumnName = "index")
	private List<LesUsefulInfo> useful_information = new ArrayList<>();

	@OneToMany(targetEntity = AnsweringStratergy.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iasr_fk", referencedColumnName = "index")
	private List<AnsweringStratergy> answering_stratergy = new ArrayList<>();

	@OneToMany(targetEntity = LesTips.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "irt_fk", referencedColumnName = "index")
	@JsonProperty("Tips")
	private List<LesTips> tips = new ArrayList<>();

	@OneToMany(targetEntity = LesExcercises.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iler_fk", referencedColumnName = "index")
	@JsonProperty("Excercises")
	private List<LesExcercises> excercises = new ArrayList<>();

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

	public LessonIntrod getIntroduction() {
		return introduction;
	}

	public void setIntroduction(LessonIntrod introduction) {
		this.introduction = introduction;
	}

	public List<LesImage> getImages() {
		return images;
	}

	public void setImages(List<LesImage> images) {
		this.images = images;
	}

	public List<LesUsefulInfo> getUseful_information() {
		return useful_information;
	}

	public void setUseful_information(List<LesUsefulInfo> useful_information) {
		this.useful_information = useful_information;
	}

	public List<AnsweringStratergy> getAnswering_stratergy() {
		return answering_stratergy;
	}

	public void setAnswering_stratergy(List<AnsweringStratergy> answering_stratergy) {
		this.answering_stratergy = answering_stratergy;
	}

	public List<LesExcercises> getExcercises() {
		return excercises;
	}

	public void setExcercises(List<LesExcercises> excercises) {
		this.excercises = excercises;
	}

	public List<LesTips> getTips() {
		return tips;
	}

	public void setTips(List<LesTips> tips) {
		this.tips = tips;
	}

	@Override
	public String toString() {
		return "ReadLesson [index=" + index + ", name=" + name + ", introduction=" + introduction + ", images=" + images
				+ ", useful_information=" + useful_information + ", answering_stratergy=" + answering_stratergy
				+ ", tips=" + tips + ", excercises=" + excercises + "]";
	}

	public ReadLesson() {	}

	public ReadLesson(int index, String name, LessonIntrod introduction, List<LesImage> images,
			List<LesUsefulInfo> useful_information, List<AnsweringStratergy> answering_stratergy, List<LesTips> tips,
			List<LesExcercises> excercises) {
		this.index = index;
		this.name = name;
		this.introduction = introduction;
		this.images = images;
		this.useful_information = useful_information;
		this.answering_stratergy = answering_stratergy;
		this.tips = tips;
		this.excercises = excercises;
	}
	
	
	
	
}
