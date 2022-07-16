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
@Table(name = "procedureoftestspeaking")
public class ProcedureOfTestSpeak {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "procid")
	@JsonIgnore
	private int procid;

	@Column(name = "name")
	private String name;

	@OneToMany(targetEntity = Rules.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ifr_pk", referencedColumnName = "procid")
	private List<Rules> rules = new ArrayList<>();

	public int getProcid() {
		return procid;
	}

	public void setProcid(int procid) {
		this.procid = procid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rules> getRules() {
		return rules;
	}

	public void setRules(List<Rules> rules) {
		this.rules = rules;
	}

	@Override
	public String toString() {
		return "ProcedureOfTestSpeak [procid=" + procid + ", name=" + name + ", rules=" + rules + "]";
	}

}
