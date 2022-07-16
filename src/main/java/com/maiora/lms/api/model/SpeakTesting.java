package com.maiora.lms.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@IdClass(SpeakTestingPK.class)
@Table(name = "speaktesting")
public class SpeakTesting {

	@Id
	private int id;

	@Id
	private String module;

	private String student_name;

	private String email;

	@OneToMany(targetEntity = Speaking.class, cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "iid_fk", referencedColumnName = "id"),
			@JoinColumn(name = "code", referencedColumnName = "module") })
	private List<Speaking> speaking = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Speaking> getSpeaking() {
		return speaking;
	}

	public void setSpeaking(List<Speaking> speaking) {
		this.speaking = speaking;
	}

	@Override
	public String toString() {
		return "SpeakTesting [id=" + id + ", module=" + module + ", student_name=" + student_name + ", email=" + email
				+ ", speaking=" + speaking + "]";
	}

}
