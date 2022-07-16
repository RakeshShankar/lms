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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "readintromodel")
public class ReadIntroModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "readintromodelid")
	@JsonIgnore
	private int readintromodelid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "read_intro_id")
	private ReadIntroduct introduction;

	@OneToMany(targetEntity = ReadLes.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "iril_fk", referencedColumnName = "readintromodelid")
	private List<ReadLes> lessons = new ArrayList<>();

	public int getReadintromodelid() {
		return readintromodelid;
	}

	public void setReadintromodelid(int readintromodelid) {
		this.readintromodelid = readintromodelid;
	}

	public ReadIntroduct getIntroduction() {
		return introduction;
	}

	public void setIntroduction(ReadIntroduct introduction) {
		this.introduction = introduction;
	}

	public List<ReadLes> getLessons() {
		return lessons;
	}

	public void setLessons(List<ReadLes> lessons) {
		this.lessons = lessons;
	}

	@Override
	public String toString() {
		return "ReadIntroModel [readintromodelid=" + readintromodelid + ", introduction=" + introduction + ", lessons="
				+ lessons + "]";
	}

}
