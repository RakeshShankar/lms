package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bandpayment")
public class BandPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bandpaymentid")
	@JsonIgnore
	private int bandpaymentid;

	@Column(name = "description1")
	private String description1;

	@Column(name = "image1")
	private String image1;

	public int getBandpaymentid() {
		return bandpaymentid;
	}

	public void setBandpaymentid(int bandpaymentid) {
		this.bandpaymentid = bandpaymentid;
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

	@Override
	public String toString() {
		return "BandPayment [bandpaymentid=" + bandpaymentid + ", description1=" + description1 + ", image1=" + image1
				+ "]";
	}

}
