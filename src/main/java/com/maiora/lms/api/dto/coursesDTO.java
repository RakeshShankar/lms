package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class coursesDTO {

	private int course_id;
	private String course_name;
	private String description;
	private String course_image;
	private Timestamp hours;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getCourse_id() {
		return course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public String getDescription() {
		return description;
	}
	public String getCourse_image() {
		return course_image;
	}
	public Timestamp getHours() {
		return hours;
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
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCourse_image(String course_image) {
		this.course_image = course_image;
	}
	public void setHours(Timestamp hours) {
		this.hours = hours;
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
	@Override
	public String toString() {
		return "coursesDTO [course_id=" + course_id + ", course_name=" + course_name + ", description=" + description
				+ ", course_image=" + course_image + ", hours=" + hours + ", is_deleted=" + is_deleted + ", is_active="
				+ is_active + ", created_by=" + created_by + ", updated_by=" + updated_by + ", created_on=" + created_on
				+ ", updated_on=" + updated_on + "]";
	}
	
	
	
}
