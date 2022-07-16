package com.maiora.lms.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lessonwrite")
public class LessonWrite {
	@Id
	@Column(name = "index")
	private long index;

	@Column(name = "name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "introid")
	private IntroductionWrite introduction;

	@OneToMany(mappedBy = "lessonWrite")
	private List<ImageWrite> images;

	@OneToMany(mappedBy = "lessonWrite")
	private List<UsePluralNoun> use_plural_nouns;

	@OneToMany(mappedBy = "lessonWrite")
	private List<UseSingularNoun> use_singular_nouns;

	@OneToMany(mappedBy = "lessonWrite")
	private List<Attention> attention;

	@OneToMany(mappedBy = "lessonWrite")
	private List<Excercises> Excercises;

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IntroductionWrite getIntroduction() {
		return introduction;
	}

	public void setIntroduction(IntroductionWrite introduction) {
		this.introduction = introduction;
	}

	public List<ImageWrite> getImages() {
		return images;
	}

	public void setImages(List<ImageWrite> images) {
		this.images = images;
	}

	public List<UsePluralNoun> getUse_plural_nouns() {
		return use_plural_nouns;
	}

	public void setUse_plural_nouns(List<UsePluralNoun> use_plural_nouns) {
		this.use_plural_nouns = use_plural_nouns;
	}

	public List<UseSingularNoun> getUse_singular_nouns() {
		return use_singular_nouns;
	}

	public void setUse_singular_nouns(List<UseSingularNoun> use_singular_nouns) {
		this.use_singular_nouns = use_singular_nouns;
	}

	public List<Attention> getAttention() {
		return attention;
	}

	public void setAttention(List<Attention> attention) {
		this.attention = attention;
	}

	public List<Excercises> getExcercises() {
		return Excercises;
	}

	public void setExcercises(List<Excercises> excercises) {
		Excercises = excercises;
	}

	@Override
	public String toString() {
		return "LessonWrite [index=" + index + ", name=" + name + ", introduction=" + introduction + ", images="
				+ images + ", use_plural_nouns=" + use_plural_nouns + ", use_singular_nouns=" + use_singular_nouns
				+ ", attention=" + attention + ", Excercises=" + Excercises + "]";
	}

	

}
