package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "introductionlistening")
public class IntroductionListening {
	@Id
	private int index;

	private String description1;

	@OneToMany(targetEntity = ImagesListen.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iilil_fk", referencedColumnName = "index")
	private List<ImagesListen> images = new ArrayList<>();

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public List<ImagesListen> getImages() {
		return images;
	}

	public void setImages(List<ImagesListen> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "IntroductionListening [index=" + index + ", description1=" + description1 + ", images=" + images + "]";
	}

}
