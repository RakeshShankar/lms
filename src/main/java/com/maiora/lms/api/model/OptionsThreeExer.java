package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass( OptionsReadExerPK.class )
@Table(name = "optionsthreeexer")
public class OptionsThreeExer implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int index;

	@Id
	private String name;

	@Column(name = "user_answered")
	private String userAnswered;

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

	public String getUserAnswered() {
		return userAnswered;
	}

	public void setUserAnswered(String userAnswered) {
		this.userAnswered = userAnswered;
	}

	@Override
	public String toString() {
		return "OptionsThreeExer [index=" + index + ", name=" + name + ", userAnswered=" + userAnswered + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(index, name, userAnswered);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionsThreeExer other = (OptionsThreeExer) obj;
		return index == other.index && Objects.equals(name, other.name)
				&& Objects.equals(userAnswered, other.userAnswered);
	}

	public OptionsThreeExer(int index, String name, String userAnswered) {
		this.index = index;
		this.name = name;
		this.userAnswered = userAnswered;
	}

	public OptionsThreeExer() {
	}
	
	
}
