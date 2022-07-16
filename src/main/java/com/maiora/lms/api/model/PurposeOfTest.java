package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "purposeoftesting")
public class PurposeOfTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "purposeid")
	@JsonIgnore
	private int purposeid;
	
	@Column(name = "name")
	private String name;

	public int getPurposeid() {
		return purposeid;
	}

	public void setPurposeid(int purposeid) {
		this.purposeid = purposeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PurposeOfTest [purposeid=" + purposeid + ", name=" + name + "]";
	}
	
	

}
