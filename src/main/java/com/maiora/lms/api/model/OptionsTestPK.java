package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class OptionsTestPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int index;

	private double unk = Math.random() * 100;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getUnk() {
		return unk;
	}

	public void setUnk(double unk) {
		this.unk = unk;
	}

	@Override
	public String toString() {
		return "OptionsTestPK [index=" + index + ", unk=" + unk + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(index, unk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionsTestPK other = (OptionsTestPK) obj;
		return index == other.index && Double.doubleToLongBits(unk) == Double.doubleToLongBits(other.unk);
	}

	public OptionsTestPK(int index, double unk) {
		this.index = index;
		this.unk = unk;
	}

	public OptionsTestPK() {
	}

}
