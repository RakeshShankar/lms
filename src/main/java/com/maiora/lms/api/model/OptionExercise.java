package com.maiora.lms.api.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@IdClass( OptionExercisePK.class )
@Table(name = "optionexercise")
public class OptionExercise implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index")
	private int index;
	
	@Id
	private String name;
	
	private String description;

	@JsonProperty("userAnswered")
	private String user_answered;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUser_answered() {
		return user_answered;
	}

	public void setUser_answered(String user_answered) {
		this.user_answered = user_answered;
	}

	@Override
	public String toString() {
		return "OptionExercise [index=" + index + ", name=" + name + ", description=" + description + ", user_answered="
				+ user_answered + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, index, name, user_answered);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionExercise other = (OptionExercise) obj;
		return Objects.equals(description, other.description) && Objects.equals(index, other.index)
				&& Objects.equals(name, other.name) && Objects.equals(user_answered, other.user_answered);
	}
	
	

}
