package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "resultspayment")
public class ResultsPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resultspaymentid")
	@JsonIgnore
	private int resultspaymentid;

	@Column(name = "description1")
	private String description1;

	@Column(name = "image1")
	private String image1;

	@Column(name = "description2")
	private String description2;

	@Column(name = "image2")
	private String image2;

	public int getResultspaymentid() {
		return resultspaymentid;
	}

	public void setResultspaymentid(int resultspaymentid) {
		this.resultspaymentid = resultspaymentid;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	@Override
	public String toString() {
		return "ResultsPayment [resultspaymentid=" + resultspaymentid + ", description1=" + description1 + ", image1="
				+ image1 + ", description2=" + description2 + ", image2=" + image2 + "]";
	}

}
