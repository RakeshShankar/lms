package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "whatwilllearnspeaking")
public class WhatWillLearnSpeak {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wspeakid")
	@JsonIgnore
	private int wspeakid;

	@Column(name = "name")
	private String name;

	@OneToMany(targetEntity = Learn.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ilwwls_fk", referencedColumnName = "wspeakid")
	private List<Learn> learn = new ArrayList<>();

	public int getWspeakid() {
		return wspeakid;
	}

	public void setWspeakid(int wspeakid) {
		this.wspeakid = wspeakid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Learn> getLearn() {
		return learn;
	}

	public void setLearn(List<Learn> learn) {
		this.learn = learn;
	}

	@Override
	public String toString() {
		return "WhatWillLearnSpeak [wspeakid=" + wspeakid + ", name=" + name + ", learn=" + learn + "]";
	}

}
