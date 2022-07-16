package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class OptionExercisePK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int index;

	private String name;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(index, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionExercisePK other = (OptionExercisePK) obj;
		return index == other.index && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "OptionExercisePK [index=" + index + ", name=" + name + "]";
	}

	public OptionExercisePK(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public OptionExercisePK() {
	}


}
