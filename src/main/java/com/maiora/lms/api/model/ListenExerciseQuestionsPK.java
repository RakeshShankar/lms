package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

public class ListenExerciseQuestionsPK implements Serializable {

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
		ListenExerciseQuestionsPK other = (ListenExerciseQuestionsPK) obj;
		return index == other.index && Double.doubleToLongBits(unk) == Double.doubleToLongBits(other.unk);
	}

	public ListenExerciseQuestionsPK(int index, double unk) {
		this.index = index;
		this.unk = unk;
	}

	public ListenExerciseQuestionsPK() {
	}

	@Override
	public String toString() {
		return "ListenExerciseQuestionsPK [index=" + index + ", unk=" + unk + "]";
	}

}
