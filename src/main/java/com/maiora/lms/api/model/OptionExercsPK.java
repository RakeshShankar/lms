package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Id;

public class OptionExercsPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private long index;

	@Id
	private String description;

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, index);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionExercsPK other = (OptionExercsPK) obj;
		return Objects.equals(description, other.description) && index == other.index;
	}

	@Override
	public String toString() {
		return "OptionExercsPK [index=" + index + ", description=" + description + "]";
	}

	public OptionExercsPK(long index, String description) {
		this.index = index;
		this.description = description;
	}

	public OptionExercsPK() {
	}

}
