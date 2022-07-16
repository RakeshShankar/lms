package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "intropayment")
public class IntroPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "intropaymentid")
	@JsonIgnore
	private int intropaymentid;

	@Column(name = "description1")
	private String description1;

	@Column(name = "description2")
	private String description2;

	@Column(name = "description3")
	private String description3;

	@Column(name = "video")
	private String video;

	public int getIntropaymentid() {
		return intropaymentid;
	}

	public void setIntropaymentid(int intropaymentid) {
		this.intropaymentid = intropaymentid;
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

	public String getDescription3() {
		return description3;
	}

	public void setDescription3(String description3) {
		this.description3 = description3;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "IntroPayment [intropaymentid=" + intropaymentid + ", description1=" + description1 + ", description2="
				+ description2 + ", description3=" + description3 + ", video=" + video + "]";
	}
	
	
	
}
