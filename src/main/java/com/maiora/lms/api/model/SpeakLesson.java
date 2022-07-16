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
@Table(name = "speaklessoning")
public class SpeakLesson {

	@Id
	private int index;

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "introid")
	private IntroductionLessonSpeaking introduction;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "wspeakid")
	private WhatWillLearnSpeak what_will_learn;

	@OneToMany(targetEntity = ImagesSpeak.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "imags_fk", referencedColumnName = "index")
	private List<ImagesSpeak> images = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "purposeid")
	private PurposeOfTest purpose_of_test;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "structuretestid")
	private StructureTest structure_test;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "procedureid")
	private ProcedureOfTestSpeak procedure_of_test;

	@OneToMany(targetEntity = AnsweringStratergySpeak.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iasas_fk", referencedColumnName = "index")
	private List<AnsweringStratergySpeak> answering_stratergy = new ArrayList<>();

	@OneToMany(targetEntity = Tips.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "itas_fk", referencedColumnName = "index")
	@JsonProperty("Tips")
	private List<Tips> tips = new ArrayList<>();

	@OneToMany(targetEntity = ExcercisesSpeak.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iess_fk", referencedColumnName = "index")
	@JsonProperty("Excercises")
	private List<ExcercisesSpeak> excercises = new ArrayList<>();

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

	public IntroductionLessonSpeaking getIntroduction() {
		return introduction;
	}

	public void setIntroduction(IntroductionLessonSpeaking introduction) {
		this.introduction = introduction;
	}

	public WhatWillLearnSpeak getWhat_will_learn() {
		return what_will_learn;
	}

	public void setWhat_will_learn(WhatWillLearnSpeak what_will_learn) {
		this.what_will_learn = what_will_learn;
	}

	public List<ImagesSpeak> getImages() {
		return images;
	}

	public void setImages(List<ImagesSpeak> images) {
		this.images = images;
	}

	public PurposeOfTest getPurpose_of_test() {
		return purpose_of_test;
	}

	public void setPurpose_of_test(PurposeOfTest purpose_of_test) {
		this.purpose_of_test = purpose_of_test;
	}

	public StructureTest getStructure_test() {
		return structure_test;
	}

	public void setStructure_test(StructureTest structure_test) {
		this.structure_test = structure_test;
	}

	public ProcedureOfTestSpeak getProcedure_of_test() {
		return procedure_of_test;
	}

	public void setProcedure_of_test(ProcedureOfTestSpeak procedure_of_test) {
		this.procedure_of_test = procedure_of_test;
	}

	public List<AnsweringStratergySpeak> getAnswering_stratergy() {
		return answering_stratergy;
	}

	public void setAnswering_stratergy(List<AnsweringStratergySpeak> answering_stratergy) {
		this.answering_stratergy = answering_stratergy;
	}

	public List<Tips> getTips() {
		return tips;
	}

	public void setTips(List<Tips> tips) {
		this.tips = tips;
	}

	public List<ExcercisesSpeak> getExcercises() {
		return excercises;
	}

	public void setExcercises(List<ExcercisesSpeak> excercises) {
		this.excercises = excercises;
	}

	@Override
	public String toString() {
		return "SpeakLesson [index=" + index + ", name=" + name + ", introduction=" + introduction
				+ ", what_will_learn=" + what_will_learn + ", images=" + images + ", purpose_of_test=" + purpose_of_test
				+ ", structure_test=" + structure_test + ", procedure_of_test=" + procedure_of_test
				+ ", answering_stratergy=" + answering_stratergy + ", tips=" + tips + ", excercises=" + excercises
				+ "]";
	}

}
