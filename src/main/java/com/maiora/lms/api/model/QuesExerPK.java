package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class QuesExerPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int index;

	private String description;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
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
		QuesExerPK other = (QuesExerPK) obj;
		return Objects.equals(description, other.description) && index == other.index;
	}

	public QuesExerPK(int index, String description) {
		super();
		this.index = index;
		this.description = description;
	}

	@Override
	public String toString() {
		return "QuesExerPK [index=" + index + ", description=" + description + "]";
	}

	public QuesExerPK() {
		super();
	}

}
