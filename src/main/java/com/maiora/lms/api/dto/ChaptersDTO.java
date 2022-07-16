package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class ChaptersDTO {

	private int chapter_id;
	private String chapter_name;
	private String description;
	private Timestamp hours;
	private String chapter_image;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getChapter_id() {
		return chapter_id;
	}
	public String getChapter_name() {
		return chapter_name;
	}
	public String getDescription() {
		return description;
	}
	public Timestamp getHours() {
		return hours;
	}
	public String getChapter_image() {
		return chapter_image;
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
	public void setChapter_id(int chapter_id) {
		this.chapter_id = chapter_id;
	}
	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setHours(Timestamp hours) {
		this.hours = hours;
	}
	public void setChapter_image(String chapter_image) {
		this.chapter_image = chapter_image;
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
