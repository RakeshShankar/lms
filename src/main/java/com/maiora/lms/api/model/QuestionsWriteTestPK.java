package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class QuestionsWriteTestPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int index;

	private double unk;

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
		QuestionsWriteTestPK other = (QuestionsWriteTestPK) obj;
		return index == other.index && Double.doubleToLongBits(unk) == Double.doubleToLongBits(other.unk);
	}

	@Override
	public String toString() {
		return "QuestionsWriteTestPK [index=" + index + ", unk=" + unk + "]";
	}

	public QuestionsWriteTestPK(int index, double unk) {
		super();
		this.index = index;
		this.unk = unk;
	}

	public QuestionsWriteTestPK() {
		super();
	}

}
