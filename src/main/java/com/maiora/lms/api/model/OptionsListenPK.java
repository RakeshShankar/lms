package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class OptionsListenPK implements Serializable {

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
		OptionsListenPK other = (OptionsListenPK) obj;
		return index == other.index && Objects.equals(name, other.name);
	}

	public OptionsListenPK(int index, String name) {
		this.index = index;
		this.name = name;
	}

	@Override
	public String toString() {
		return "OptionsListenPK [index=" + index + ", name=" + name + "]";
	}

	public OptionsListenPK() {
	}

}
