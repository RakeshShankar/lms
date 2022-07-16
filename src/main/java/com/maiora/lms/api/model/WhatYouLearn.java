package com.maiora.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "whatyoulearn")
public class WhatYouLearn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int whatid;
	
	private String value;
	
	@ManyToOne
	@JoinColumn(name = "req_id", nullable = false)
	private CourseDetails coursedetail;
	

}
