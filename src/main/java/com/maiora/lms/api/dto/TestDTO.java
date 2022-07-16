package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class TestDTO {

	private int test_id;
	private boolean test_type;
	private String marks;
	private Timestamp time;
	private String no_of_questions;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getTest_id() {
		return test_id;
	}
	public boolean isTest_type() {
		return test_type;
	}
	public String getMarks() {
		return marks;
	}
	public Timestamp getTime() {
		return time;
	}
	public String getNo_of_questions() {
		return no_of_questions;
	}
	public int getIs_deleted() {
		return is_deleted;
	}
	public int getIs_active() {
		return is_active;
	}
	public String getCreated_by() {
		return created_by;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public Timestamp getCreated_on() {
		return created_on;
	}
	public Timestamp getUpdated_on() {
		return updated_on;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public void setTest_type(boolean test_type) {
		this.test_type = test_type;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public void setNo_of_questions(String no_of_questions) {
		this.no_of_questions = no_of_questions;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}
	public void setUpdated_on(Timestamp updated_on) {
		this.updated_on = updated_on;
	}
	
	
}
