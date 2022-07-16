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
@Table(name = "learn")
public class Learn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "learnid")
	@JsonIgnore
	private int learnid;
	
	@Column(name = "list")
	private String list;

	public int getLearnid() {
		return learnid;
	}

	public void setLearnid(int learnid) {
		this.learnid = learnid;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Learn [learnid=" + learnid + ", list=" + list + "]";
	}
	
	

}
