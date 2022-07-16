package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "imagesspeak")
public class ImagesSpeak {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "speak_id")
	@JsonIgnore
	private int speak_id;

	private String image;

	public int getSpeak_id() {
		return speak_id;
	}

	public void setSpeak_id(int speak_id) {
		this.speak_id = speak_id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ImagesSpeak [speak_id=" + speak_id + ", image=" + image + "]";
	}

}
