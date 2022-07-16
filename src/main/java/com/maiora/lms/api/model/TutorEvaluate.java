package com.maiora.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tutorevaluate")
public class TutorEvaluate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;

	private String email;

	private int right_answers;

	private double result;

	private String student_name;

	private String test;

	private int total_no_questions;

	private int wrong_answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRight_answers() {
		return right_answers;
	}

	public void setRight_answers(int right_answers) {
		this.right_answers = right_answers;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public int getTotal_no_questions() {
		return total_no_questions;
	}

	public void setTotal_no_questions(int total_no_questions) {
		this.total_no_questions = total_no_questions;
	}

	public int getWrong_answers() {
		return wrong_answers;
	}

	public void setWrong_answers(int wrong_answers) {
		this.wrong_answers = wrong_answers;
	}

	@Override
	public String toString() {
		return "TutorEvaluate [id=" + id + ", email=" + email + ", right_answers=" + right_answers + ", result="
				+ result + ", student_name=" + student_name + ", test=" + test + ", total_no_questions="
				+ total_no_questions + ", wrong_answers=" + wrong_answers + "]";
	}

}
