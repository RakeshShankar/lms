package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class LesExcercisesPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private double unk;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getUnk() {
		return unk;
	}

	public void setUnk(double unk) {
		this.unk = unk;
	}

	public LesExcercisesPK() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, unk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LesExcercisesPK other = (LesExcercisesPK) obj;
		return id == other.id && Double.doubleToLongBits(unk) == Double.doubleToLongBits(other.unk);
	}

	public LesExcercisesPK(int id, double unk) {
		super();
		this.id = id;
		this.unk = unk;
	}

	@Override
	public String toString() {
		return "LesExcercisesPK [id=" + id + ", unk=" + unk + "]";
	}

}
