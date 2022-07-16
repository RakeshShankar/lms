package com.maiora.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "speekingimages")
public class SpeekingImages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private long imageid;

	private String image;

	public long getImageid() {
		return imageid;
	}

	public void setImageid(long imageid) {
		this.imageid = imageid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "SpeekingImages [imageid=" + imageid + ", image=" + image + "]";
	}

}
