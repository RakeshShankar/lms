package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "readimages")
public class ReadImages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "readid")
	@JsonIgnore
	private int readid;

	@Column(name = "image")
	private String image;

	public int getReadid() {
		return readid;
	}

	public void setReadid(int readid) {
		this.readid = readid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ReadImages [readid=" + readid + ", image=" + image + "]";
	}

}
