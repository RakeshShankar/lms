package com.maiora.lms.api.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "examplelisten")
public class ExampleListen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int exampleid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "example1id")
	private ExampleOne example1;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "example2id")
	private ExampleOne example2;

	public int getExampleid() {
		return exampleid;
	}

	public void setExampleid(int exampleid) {
		this.exampleid = exampleid;
	}

	public ExampleOne getExample1() {
		return example1;
	}

	public void setExample1(ExampleOne example1) {
		this.example1 = example1;
	}

	public ExampleOne getExample2() {
		return example2;
	}

	public void setExample2(ExampleOne example2) {
		this.example2 = example2;
	}

	@Override
	public String toString() {
		return "ExampleListen [exampleid=" + exampleid + ", example1=" + example1 + ", example2=" + example2 + "]";
	}

}
