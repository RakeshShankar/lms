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
@Table(name = "answerstrategy")
public class AnsweringStratergySpeak {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "strategyid")
	@JsonIgnore
	private int strategyid;

	@Column(name = "description")
	private String description;

	public int getStrategyid() {
		return strategyid;
	}

	public void setStrategyid(int strategyid) {
		this.strategyid = strategyid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AnsweringStratergySpeak [strategyid=" + strategyid + ", description=" + description + "]";
	}

}
