package com.maiora.lms.api.dto;

import java.security.Timestamp;

public class UniversitiesDto {

	private int university_id;
	private String university_name;
	private String country;
	private String description;
	private  boolean unversity_type;
	private String website;
	private String email;
	private int mobile;
	private String address;
	private Timestamp founded_year;
	private int CGPA;
	private String university_image;
	private String cover_pic;
	private int is_deleted;
	private int is_active;
	private String created_by;
	private String updated_by;
	private Timestamp created_on;
	private Timestamp updated_on;
	public int getUniversity_id() {
		return university_id;
	}
	public String getUniversity_name() {
		return university_name;
	}
	public String getCountry() {
		return country;
	}
	public String getDescription() {
		return description;
	}
	public boolean isUnversity_type() {
		return unversity_type;
	}
	public String getWebsite() {
		return website;
	}
	public String getEmail() {
		return email;
	}
	public int getMobile() {
		return mobile;
	}
	public String getAddress() {
		return address;
	}
	public Timestamp getFounded_year() {
		return founded_year;
	}
	public int getCGPA() {
		return CGPA;
	}
	public String getUniversity_image() {
		return university_image;
	}
	public String getCover_pic() {
		return cover_pic;
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
	public void setUniversity_id(int university_id) {
		this.university_id = university_id;
	}
	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setUnversity_type(boolean unversity_type) {
		this.unversity_type = unversity_type;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setFounded_year(Timestamp founded_year) {
		this.founded_year = founded_year;
	}
	public void setCGPA(int cGPA) {
		CGPA = cGPA;
	}
	public void setUniversity_image(String university_image) {
		this.university_image = university_image;
	}
	public void setCover_pic(String cover_pic) {
		this.cover_pic = cover_pic;
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
