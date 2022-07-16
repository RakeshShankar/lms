package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class AssignmentsDTO {

	private int assignment_id;
	private String assignment;
	private String description;
	private Timestamp max_time;
	private int total_namrks;
	private int passing_marks;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	
	public int getAssignment_id() {
		return assignment_id;
	}
	public String getAssignment() {
		return assignment;
	}
	public String getDescription() {
		return description;
	}
	public Timestamp getMax_time() {
		return max_time;
	}
	public int getTotal_namrks() {
		return total_namrks;
	}
	public int getPassing_marks() {
		return passing_marks;
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
	public void setAssignment_id(int assignment_id) {
		this.assignment_id = assignment_id;
	}
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setMax_time(Timestamp max_time) {
		this.max_time = max_time;
	}
	public void setTotal_namrks(int total_namrks) {
		this.total_namrks = total_namrks;
	}
	public void setPassing_marks(int passing_marks) {
		this.passing_marks = passing_marks;
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
