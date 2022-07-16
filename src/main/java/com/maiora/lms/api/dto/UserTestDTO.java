package com.maiora.lms.api.dto;

import java.security.Timestamp;

import javax.persistence.Id;

public class UserTestDTO {

	private int user_tset_id;
	private int test_id;
	private int total_questions;   
	private int currect_answered;
	private int wrong_answered;
	private int skipped;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getUser_tset_id() {
		return user_tset_id;
	}
	public int getTest_id() {
		return test_id;
	}
	public int getTotal_questions() {
		return total_questions;
	}
	public int getCurrect_answered() {
		return currect_answered;
	}
	public int getWrong_answered() {
		return wrong_answered;
	}
	public int getSkipped() {
		return skipped;
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
	public void setUser_tset_id(int user_tset_id) {
		this.user_tset_id = user_tset_id;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public void setTotal_questions(int total_questions) {
		this.total_questions = total_questions;
	}
	public void setCurrect_answered(int currect_answered) {
		this.currect_answered = currect_answered;
	}
	public void setWrong_answered(int wrong_answered) {
		this.wrong_answered = wrong_answered;
	}
	public void setSkipped(int skipped) {
		this.skipped = skipped;
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
