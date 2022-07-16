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

@Entity
@Table(name = "speakexe")
public class SpeakExe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int speakid;

	@OneToMany(targetEntity = SpeakExec.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "so_fk", referencedColumnName = "speakid")
	private List<SpeakExec> excercises = new ArrayList<>();

	public int getSpeakid() {
		return speakid;
	}

	public void setSpeakid(int speakid) {
		this.speakid = speakid;
	}

	public List<SpeakExec> getExcercises() {
		return excercises;
	}

	public void setExcercises(List<SpeakExec> excercises) {
		this.excercises = excercises;
	}

	@Override
	public String toString() {
		return "SpeakExe [speakid=" + speakid + "]";
	}

}
