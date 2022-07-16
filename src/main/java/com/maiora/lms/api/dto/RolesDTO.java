package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class RolesDTO {

	private int role_id;
	private String role;
	private String user_role;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getRole_id() {
		return role_id;
	}
	public String getRole() {
		return role;
	}
	public String getUser_role() {
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
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setUser_role(String user_role) {
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
