package com.maiora.lms.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "structuretesting")
public class StructureTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "structuretestid")
	@JsonIgnore
	private int structuretestid;

	@Column(name = "name")
	private String name;

	public int getStructuretestid() {
		return structuretestid;
	}

	public void setStructuretestid(int structuretestid) {
		this.structuretestid = structuretestid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StructureTest [structuretestid=" + structuretestid + ", name=" + name + "]";
	}

}
