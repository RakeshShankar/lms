package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class SpeakTestingPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String module;

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

	@Override
	public int hashCode() {
		return Objects.hash(id, module);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpeakTestingPK other = (SpeakTestingPK) obj;
		return id == other.id && Objects.equals(module, other.module);
	}

	@Override
	public String toString() {
		return "SpeakTestingPK [id=" + id + ", module=" + module + "]";
	}

	public SpeakTestingPK(int id, String module) {
		this.id = id;
		this.module = module;
	}

	public SpeakTestingPK() {
	}

}
