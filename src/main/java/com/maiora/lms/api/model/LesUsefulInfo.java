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
@Table(name = "lesusefulinfo")
public class LesUsefulInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "useinfoid")
	@JsonIgnore
	private int useinfoid;

	@Column(name = "information")
	private String information;

	public int getUseinfoid() {
		return useinfoid;
	}

	public void setUseinfoid(int useinfoid) {
		this.useinfoid = useinfoid;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "LesUsefulInfo [useinfoid=" + useinfoid + ", information=" + information + "]";
	}

}
