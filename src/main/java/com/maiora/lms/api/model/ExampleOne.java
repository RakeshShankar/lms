package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "exampleone")
public class ExampleOne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int exampleid;

	private String name;

	private String audio1;

	private String audio2;

	@OneToMany(targetEntity = Transcript.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iteo_fk", referencedColumnName = "exampleid")
	private List<Transcript> transcript = new ArrayList<>();

	private String description;

	public int getExampleid() {
		return exampleid;
	}

	public void setExampleid(int exampleid) {
		this.exampleid = exampleid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAudio1() {
		return audio1;
	}

	public void setAudio1(String audio1) {
		this.audio1 = audio1;
	}

	public List<Transcript> getTranscript() {
		return transcript;
	}

	public void setTranscript(List<Transcript> transcript) {
		this.transcript = transcript;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAudio2() {
		return audio2;
	}

	public void setAudio2(String audio2) {
		this.audio2 = audio2;
	}

	@Override
	public String toString() {
		return "ExampleOne [exampleid=" + exampleid + ", name=" + name + ", audio1=" + audio1 + ", audio2=" + audio2
				+ ", transcript=" + transcript + ", description=" + description + "]";
	}

}
