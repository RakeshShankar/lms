package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class ExcercisesWritePK implements Serializable {

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
		ExcercisesWritePK other = (ExcercisesWritePK) obj;
		return id == other.id && Double.doubleToLongBits(unk) == Double.doubleToLongBits(other.unk);
	}

	@Override
	public String toString() {
		return "ExcercisesWritePK [id=" + id + ", unk=" + unk + "]";
	}

	public ExcercisesWritePK(int id, double unk) {
		this.id = id;
		this.unk = unk;
	}

	
	public ExcercisesWritePK() {
	}

}
