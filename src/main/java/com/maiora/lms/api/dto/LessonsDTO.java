package com.maiora.lms.api.dto;

import java.sql.Timestamp;

public class LessonsDTO {

	private int lession_id;
	private String lession_name;
	private String description;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getLession_id() {
		return lession_id;
	}
	public String getLession_name() {
		return lession_name;
	}
	public String getDescription() {
		return description;
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
	public void setLession_id(int lession_id) {
		this.lession_id = lession_id;
	}
	public void setLession_name(String lession_name) {
		this.lession_name = lession_name;
	}
	public void setDescription(String description) {
		this.description = description;
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
