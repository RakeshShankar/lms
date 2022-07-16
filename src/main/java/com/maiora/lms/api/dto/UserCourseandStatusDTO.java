package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class UserCourseandStatusDTO {

	private int user_course_status_id;
	private int course_id;
	private String status;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getUser_course_status_id() {
		return user_course_status_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public String getStatus() {
		return status;
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
	public void setUser_course_status_id(int user_course_status_id) {
		this.user_course_status_id = user_course_status_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public void setStatus(String status) {
		this.status = status;
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
