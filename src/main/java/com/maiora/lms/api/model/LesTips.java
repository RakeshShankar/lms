package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "lestips")
public class LesTips {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tipid")
	@JsonIgnore
	private int tipid;

	@Column(name = "description")
	private String description;

	public int getTipid() {
		return tipid;
	}

	public void setTipid(int tipid) {
		this.tipid = tipid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "LesTips [tipid=" + tipid + ", description=" + description + "]";
	}

}
