package com.maiora.lms.api.dto;

import java.security.Timestamp;
import java.sql.Date;

public class UsersDTO {

	private int user_id;
	private String first_name;
	private int last_name;
	private String email;
	private int mobile;
	private Date DOB;
	private String qualification;
	private int user_role;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getUser_id() {
		return user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public int getLast_name() {
		return last_name;
	}
	public String getEmail() {
		return email;
	}
	public int getMobile() {
		return mobile;
	}
	public Date getDOB() {
		return DOB;
	}
	public String getQualification() {
		return qualification;
	}
	public int getUser_role() {
		return user_role;
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
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public void setLast_name(int last_name) {
		this.last_name = last_name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setUser_role(int user_role) {
		this.user_role = user_role;
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
