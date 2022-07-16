package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class SpeakingPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int index;

	private String type;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SpeakingPK [index=" + index + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(index, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpeakingPK other = (SpeakingPK) obj;
		return index == other.index && Objects.equals(type, other.type);
	}

	public SpeakingPK(int index, String type) {
		this.index = index;
		this.type = type;
	}

	public SpeakingPK() {
	}

}
